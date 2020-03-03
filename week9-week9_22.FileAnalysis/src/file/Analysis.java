package file;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class Analysis {

//    respuesta propuesta:
//    lee una sola vez el archivo y no usa arrayList. tampoco arrastra la excepcion porque la trata en el try catch 
//    private String readFile() {
//        try {
//            String str = "";
// 
//            Scanner reader = new Scanner(file);
// 
//            while (reader.hasNextLine()) {
//                str += reader.nextLine();
//                str += "\n";
//            }
// 
//            return str;
//        } catch (FileNotFoundException ex) {
//            return "";
//        }
//    }        
//    -----
//    para las lineas usa el .split. muy bueno
//    public int lines() {
//        String content = readFile();
//        return content.split("\n").length;
//    }
    
    private File file;
    private List<String> lines;

    public Analysis(File file) {
        this.file = file;
    }

    private void fillLines() throws Exception {
        Scanner reader = new Scanner(this.file);
        this.lines = new ArrayList<String>();

        while (reader.hasNextLine()) {
            this.lines.add(reader.nextLine());
        }
    }

    public int lines() throws Exception{
        this.fillLines();
        return this.lines.size();
    }

    public int characters() throws Exception {
        this.fillLines();
        
        int counter = 0;
        for (String line : this.lines) {
            counter += line.length();
        }

        return this.lines() + counter;
    }

}
