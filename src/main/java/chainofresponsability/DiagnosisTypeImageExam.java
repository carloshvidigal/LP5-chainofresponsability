package chainofresponsability;

public class DiagnosisTypeImageExam implements DiagnosisType{
    private static DiagnosisTypeImageExam diagnosisTypeImageExam = new DiagnosisTypeImageExam();

    private DiagnosisTypeImageExam() {};

    public static DiagnosisTypeImageExam getDiagnosisTypeImageExam() {
        return diagnosisTypeImageExam;
    }
}
