package chainofresponsability;

public class DiagnosisSpecialist implements DiagnosisType{

    private static DiagnosisSpecialist diagnosisSpecialist = new DiagnosisSpecialist();

    private DiagnosisSpecialist() {};

    public static DiagnosisSpecialist getDiagnosisSpecialist() {
        return diagnosisSpecialist;
    }
}
