import java.util.List;
import java.util.Map;

public class PetClinic extends AbstractClinic {

    @Override
    public void addPatient(AbstractPatient patient) {
        currentPatients.put(patient.patientId, patient);

    }

    @Override
    public void addBulkPatients(List<AbstractPatient> patients) {
        for (AbstractPatient p : patients) {
            System.out.println("Adding patient " + p + " to current patients.");
            addPatient(p);
        }
    }

    @Override
    public void removePatientByPatientObject(AbstractPatient patient) {
        currentPatients.values().remove(patient);

    }

    @Override
    public void removePatientByPatientId(Integer patientId) {
        for (Map.Entry<Integer, AbstractPatient> entry : currentPatients.entrySet()) {
            if (patientId.equals(entry.getValue())) {
                patientId = entry.getKey();
                break;
            }
        }
        if (patientId != null) {
            currentPatients.remove(patientId);
        }

    }

    @Override
    public void listPatients() {
        for (Map.Entry<Integer, AbstractPatient> ap : currentPatients.entrySet()) {
            System.out.println(ap.getKey() + " " + ap.getValue().patientName);

        }
    }
}
