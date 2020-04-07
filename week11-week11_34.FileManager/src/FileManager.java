
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File fileObj = new File(file);
        Scanner reader = null;
        List<String> list = new ArrayList<String>();

        try {
            reader = new Scanner(fileObj, "UTF-8");
        } catch (Exception e) {
            System.out.println("Error reading: " + e.getMessage());
            return null;
        }

        while (reader.hasNextLine()) {
            String next = reader.nextLine();
            list.add(next);
        }

        return list;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fileObj = new FileWriter(file, true);
        fileObj.write(text);
        fileObj.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fileObj = new FileWriter(file, true);
        for (String line : texts) {
            fileObj.write(line + "\n");
        }
        fileObj.close();
    }
}
