import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class ClinicFileReader implements ClinicReader {

    public List<AbstractPatient> readPatients() throws IOException, URISyntaxException {
        List<String> strings = readFileByName("human_patients.txt");
        return null;
    }

    public Map<Integer, String> readProblems() throws IOException, URISyntaxException {
        List<String> strings = readFileByName("human_problems.txt");
        return null;
    }

    private List<String> readFileByName(String fileName) throws URISyntaxException, IOException {
        URI patients = ClassLoader.getSystemResource(fileName).toURI();
        Path pathOfPatients = Paths.get(patients);
        List<String> strings = Files.readAllLines(pathOfPatients);
        return strings

    }
}
