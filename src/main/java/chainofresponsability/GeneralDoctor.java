package chainofresponsability;

public class GeneralDoctor extends Doctor {

    public GeneralDoctor(Doctor superior) {
        diagnosisList.add(DiagnosisTypeGeneral.getDiagnosisTypeGeneral());
        setSuperiorDoctor(superior);
    }

    public String getJobDescription() {
        return "General Doctor";
    }
}
