package chainofresponsability;

public class DiagnosisTypeLabExam implements DiagnosisType {

    private static DiagnosisTypeLabExam diagnosisTypeLabExam = new DiagnosisTypeLabExam();

    private DiagnosisTypeLabExam() {};

    public static DiagnosisTypeLabExam getDiagnosisTypeLabExam() {
        return diagnosisTypeLabExam;
    }

}
