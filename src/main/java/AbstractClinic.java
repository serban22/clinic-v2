import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractClinic {
    Map<Integer, AbstractPatient> currentPatients = new HashMap<>();
    public abstract void addPatient(AbstractPatient patient);
    public abstract void addBulkPatients(List<AbstractPatient> patients);
    public abstract void removePatientByPatientObject(AbstractPatient patient);
    public abstract void removePatientByPatientId(Integer patientId);
    public abstract void listPatients();
}
