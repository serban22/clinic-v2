import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClinicFileReader implements ClinicReader {

    public List<AbstractPatient> readPatients() throws IOException, URISyntaxException {
        List<String> strings = readFileByName("human_patients.txt");
        List<AbstractPatient> patients = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String[] split = strings.get(i).split(",");
            int patientId = Integer.valueOf(split[0]);
            String patientName = split[1];
            AbstractPatient tempPatient = new HumanPatient(patientId, patientName);
            patients.add(tempPatient);
        }
        return patients;
    }

    public Map<Integer, String> readProblems() throws IOException, URISyntaxException {
        List<String> strings = readFileByName("human_problems.txt");
        for (int i = 0; i < strings.size(); i++) {
            String[] split = strings.get(i).split(",");
        }
        return null;
    }

    private List<String> readFileByName(String fileName) throws URISyntaxException, IOException {
        URI patients = ClassLoader.getSystemResource(fileName).toURI();
        Path pathOfPatients = Paths.get(patients);
        List<String> strings = Files.readAllLines(pathOfPatients);
        return strings;

    }
}
