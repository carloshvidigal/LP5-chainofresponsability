package chainofresponsability;

public class DiagnosisTypeSpecialist implements DiagnosisType{

    private static DiagnosisTypeSpecialist diagnosisTypeSpecialist = new DiagnosisTypeSpecialist();

    private DiagnosisTypeSpecialist() {};

    public static DiagnosisTypeSpecialist getDiagnosisSpecialist() {
        return diagnosisTypeSpecialist;
    }
}
