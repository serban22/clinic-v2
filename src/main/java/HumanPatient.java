public class HumanPatient extends AbstractPatient {
    public HumanPatient(int patientId, String patientName) {
        super(patientId, patientName);
        System.out.println("Human patient " + patientName + " has been added. Get well, " + patientName + "!" );
    }

    @Override
    public String
    toString() {
        return "HumanPatient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
