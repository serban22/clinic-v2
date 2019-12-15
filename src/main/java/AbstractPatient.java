public abstract class AbstractPatient {
    protected int patientId;
    protected String patientName;
    protected String problemName;

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getProblemName() {
        return problemName;
    }

    public AbstractPatient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }

    public AbstractPatient(int patientId, String patientName, String problemName) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.problemName = problemName;
    }
}
