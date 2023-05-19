package chainofresponsability;

public class LaboratoryDoctor extends Doctor{

    public LaboratoryDoctor(Doctor superior) {
        diagnosisList.add(DiagnosisTypeLabExam.getDiagnosisTypeLabExam());
        setSuperiorDoctor(superior);
    }

    public String getJobDescription() {
        return "Laboratory Doctor";
    }
}
