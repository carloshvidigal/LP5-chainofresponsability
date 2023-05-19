package chainofresponsability;

public class ImageExamDoctor extends Doctor{

    public ImageExamDoctor(Doctor superior) {
        diagnosisList.add(DiagnosisTypeImageExam.getDiagnosisTypeImageExam());
        setSuperiorDoctor(superior);
    }

    public String getJobDescription() {
        return "Image Exam Doctor";
    }
}
