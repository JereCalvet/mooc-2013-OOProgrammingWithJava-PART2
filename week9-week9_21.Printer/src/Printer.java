
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class Printer {

    private String fileName;
    private File file;
    
    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
        this.file = new File(fileName);
    }
    /* resp propuesta: uso un arrayList
    
    private List<String> lines;
 
    public Printer(String t) throws Exception {
        Scanner tdst = new Scanner(new File(t));
        lines = new ArrayList<String>();
 
        while (tdst.hasNextLine()) {
            lines.add(tdst.nextLine());
        }
    }
 
    public void printLinesWhichContain(String word) {
        for (String line : lines) {
            if (word.isEmpty() || line.contains(word)) {
                System.out.println(line);
            }
        }
    }
    */      
    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(this.file);
        
        String string = "";

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (word.isEmpty()) {
                string += line;
                string += "\n";
            } else if (line.contains(word)) {
                string += line;
                string += "\n";
            }
        }
        System.out.print(string);

        reader.close();
    }
}
