import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class ClinicRunner {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ClinicReader clinicReader = new ClinicFileReader();
        ClinicReader clinicReader2 = new PclinicFileReader();
        List<AbstractPatient> patients = clinicReader.readPatients();
        System.out.println(patients);
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
        System.out.println(petpatients);
        petclinic.addBulkPatients(petpatients);
        petclinic.listPatients();
        System.out.println();

        petclinic.removePatientByPatientId(1);
        petclinic.removePatientByPatientId(2);
        petclinic.listPatients();
    }
}
