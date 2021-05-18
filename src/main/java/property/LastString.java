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
        // Reading a text file line by line
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath)))) {

            String line;
            // Writing text to an array
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Getting the last word in a line
        result = lines.get(lines.size() - 1).replaceAll(".*,", "");
        return result;
    }
}
