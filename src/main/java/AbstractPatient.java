public abstract class AbstractPatient {
    protected int patientId;
    protected String patientName;

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public AbstractPatient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }
}
