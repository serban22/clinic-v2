import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class ClinicRunner {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ClinicReader clinicReader = new ClinicFileReader(PatientTypes.HUMAN);
        ClinicReader clinicReader2 = new PclinicFileReader(PatientTypes.PET);

        List<AbstractPatient> patients = clinicReader.readPatients();
        Map<Integer, String> problems = clinicReader.readProblems();
        System.out.println(patients);
        System.out.println(problems);
        AbstractClinic clinic = new HumanClinic();
        clinic.addBulkPatients(patients);
        clinic.listPatients();
        System.out.println();

        clinic.removePatientByPatientId(1);
        clinic.removePatientByPatientId(3);
        clinic.listPatients();
        System.out.println();
        AbstractClinic petclinic = new PetClinic();

        List<AbstractPatient> petpatients = clinicReader2.readPatients();
        Map<Integer, String> petproblems = clinicReader2.readProblems();
        System.out.println(petpatients);
        System.out.println(petproblems);
        petclinic.addBulkPatients(petpatients);
        petclinic.listPatients();
        System.out.println();

        petclinic.addBulkPatients(petpatients);
        petclinic.removePatientByPatientId(1);
        petclinic.removePatientByPatientId(2);
        petclinic.listPatients();
    }
}
