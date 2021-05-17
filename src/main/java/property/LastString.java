package property;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LastString {
    public String findString(String filePath) {
        List<String> lines = new ArrayList<>();
        String result = "";

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath)))) {

            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        result = lines.get(lines.size() - 1).replaceAll(".*,", "");
        return result;
    }
}
