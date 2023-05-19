package chainofresponsability;

public class DiagnosisTypeGeneral implements DiagnosisType{

    private static DiagnosisTypeGeneral diagnosisTypeGeneral = new DiagnosisTypeGeneral();

    private DiagnosisTypeGeneral() {};

    public static DiagnosisTypeGeneral getDiagnosisTypeGeneral() {
        return diagnosisTypeGeneral;
    }
}


