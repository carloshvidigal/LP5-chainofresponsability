package chainofresponsability;

public class Diagnosis {

    private DiagnosisType diagnosisType;

    public Diagnosis(DiagnosisType diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    public DiagnosisType getDiagnosisType() {
        return diagnosisType;
    }

    public void setDiagnosisType(DiagnosisType diagnosisType) {
        this.diagnosisType = diagnosisType;
    }
}
