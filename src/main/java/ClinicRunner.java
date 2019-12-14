import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class ClinicRunner {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ClinicReader clinicReader = new ClinicFileReader();
        List<AbstractPatient> patients = clinicReader.readPatients();
        System.out.println(patients);
    }


}
