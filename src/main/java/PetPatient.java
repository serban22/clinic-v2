public class PetPatient extends AbstractPatient {
    public PetPatient(int patientId, String patientName) {
        super(patientId, patientName);
        System.out.println("Human patient " + patientName + " has been added. Get well, " + patientName + "!");
    }

    @Override
    public String toString() {
        return "PetPatient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
