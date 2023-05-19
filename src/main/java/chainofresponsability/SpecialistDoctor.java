package chainofresponsability;

public class SpecialistDoctor extends Doctor{

    public SpecialistDoctor(Doctor superior) {
        diagnosisList.add(DiagnosisTypeSpecialist.getDiagnosisSpecialist());
        setSuperiorDoctor(superior);
    }

    public String getJobDescription() {
        return "Specialist Doctor";
    }
}
