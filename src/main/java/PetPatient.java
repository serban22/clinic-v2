public class PetPatient extends AbstractPatient {
    public PetPatient(int patientId, String patientName) {
        super(patientId, patientName);
        System.out.println("Pet patient " + patientName + " has been added. Get well, " + patientName + "!");
    }

    public PetPatient(int patientId, String patientName, String problemName) {
        super(patientId, patientName, problemName);
        System.out.println("Pet patient " + patientName + " suffering from " + problemName + " has been added. Get well, " + patientName + "!");
    }

    @Override
    public String toString() {
        return "PetPatient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", problemName='" + problemName + '\'' +
                '}';
    }
}
