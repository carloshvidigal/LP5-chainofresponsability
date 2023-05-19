package chainofresponsability;

import java.util.ArrayList;

public abstract class Doctor {

    protected ArrayList diagnosisList = new ArrayList();
    private Doctor superiorDoctor;

    public Doctor getSuperiorDoctor() {
        return superiorDoctor;
    }

    public void setSuperiorDoctor(Doctor superiorDoctor) {
        this.superiorDoctor = superiorDoctor;
    }

    public abstract String getJobDescription();

    public String performDiagnosis (Diagnosis diagnosis) {
        if (diagnosisList.contains(diagnosis.getDiagnosisType())) {
            return getJobDescription();
        }
        else {
            if (superiorDoctor != null) {
                return superiorDoctor.performDiagnosis(diagnosis);
            }
            else
            {
                return "Without diagnosis!";
            }
        }
    }
}
