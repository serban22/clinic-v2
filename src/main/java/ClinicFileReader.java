import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClinicFileReader implements ClinicReader {

    private PatientTypes types;

    public ClinicFileReader(PatientTypes types) {
        this.types = types;
    }

    public List<AbstractPatient> readPatients() throws IOException, URISyntaxException {
        List<String> strings = readFileByName(types.getPatientNames());
        List<AbstractPatient> patients = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String[] patientParameters = strings.get(i).split(",");
            int patientId = Integer.parseInt(patientParameters[0]);
            String patientName = patientParameters[1];
            AbstractPatient tempPatient = new HumanPatient(patientId, patientName);
            patients.add(tempPatient);
        }
        return patients;
    }

    public Map<Integer, String> readProblems() throws IOException, URISyntaxException {
        List<String> strings = readFileByName(types.getPatientProblems());
        Map<Integer, String> problems = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String[] patientParameters = strings.get(i).split(",");
            problems.put(Integer.valueOf(patientParameters[0]), patientParameters[1]);
        }
        return problems;
    }

    private List<String> readFileByName(String fileName) throws URISyntaxException, IOException {
        URI patients = ClassLoader.getSystemResource(fileName).toURI();
        Path pathOfPatients = Paths.get(patients);
        List<String> strings = Files.readAllLines(pathOfPatients);
        return strings;


    }
}
