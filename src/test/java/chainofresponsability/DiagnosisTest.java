package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagnosisTest {

    GeneralDoctor generalDoctor;
    LaboratoryDoctor laboratoryDoctor;
    ImageExamDoctor imageExamDoctor;
    SpecialistDoctor specialistDoctor;

    @BeforeEach
    void setUp() {

        generalDoctor = new GeneralDoctor(laboratoryDoctor);
        laboratoryDoctor = new LaboratoryDoctor(imageExamDoctor);
        imageExamDoctor = new ImageExamDoctor(specialistDoctor);
        specialistDoctor = new SpecialistDoctor(null);
    }

    @Test
    void shouldReturnGeneralDoctorToPerformGeneralDiagnosis() {
        assertEquals("General Doctor", generalDoctor.performDiagnosis(new Diagnosis(DiagnosisTypeGeneral.getDiagnosisTypeGeneral())));
    }

    @Test
    void shouldReturnLaboratoryDoctorToPerformLabExam() {
        assertEquals("Laboratory Doctor", laboratoryDoctor.performDiagnosis(new Diagnosis(DiagnosisTypeLabExam.getDiagnosisTypeLabExam())));
    }

    @Test
    void shouldReturnImageExamDoctorToPerformImageExam() {
        assertEquals("Image Exam Doctor", imageExamDoctor.performDiagnosis(new Diagnosis(DiagnosisTypeImageExam.getDiagnosisTypeImageExam())));
    }

    @Test
    void shouldReturnSpecialistDoctorToPerformSpecialistExam() {
        assertEquals("Specialist Doctor", specialistDoctor.performDiagnosis(new Diagnosis(DiagnosisTypeSpecialist.getDiagnosisSpecialist())));
    }

    @Test
    void shouldReturnWithoutDiagnosis() {
        assertEquals("Without diagnosis!", generalDoctor.performDiagnosis(new Diagnosis(DiagnosisTypeLabExam.getDiagnosisTypeLabExam())));
    }
}
