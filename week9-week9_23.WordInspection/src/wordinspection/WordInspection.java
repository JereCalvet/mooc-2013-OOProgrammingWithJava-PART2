package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class WordInspection {
//    Respuesta propuesta: 
//    en general es mejor porque lee el archivo 1 sola vez en el constructor y lo guarda en una lista(private List<String> words;) 
//    ademas trata la excepcion ahi mismo
//    
//    dentro de los procedimientos hace un for each y aplica la logica a cada palabra
//    
//       try {
//            this.words = readWords(file);
//        } catch (Exception e) {
//            this.words = new ArrayList<String>();
//        }        
//    
//     private List<String> readWords(File file) throws Exception {
//        Scanner reader = new Scanner(file, "UTF-8");
//        List<String> readLines = new ArrayList();
// 
//        while (reader.hasNextLine()) {
//            String line = reader.nextLine();
//            line = line.trim();
// 
//            if (!line.isEmpty()) {
//                readLines.add(line);
//            }
//        }
// 
//        return readLines;
//    }    
        
        
    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

//    respuesta propuesta:
//    aca se complico un poco al dope. recorre todos los chars en el array de vocales y si no encuentra alguna revuelve falso
//    for (char vowel: this.vowels.toCharArray()) {
//         if (!word.contains("" + vowel)) {
//             return false;
//         }
//    }
//    return true;
    private boolean checkForVowels(String toBeChecked) {
        return toBeChecked.contains("ö") && toBeChecked.contains("ä") && toBeChecked.contains("y") && toBeChecked.contains("a") && toBeChecked.contains("e") && toBeChecked.contains("i") && toBeChecked.contains("o") && toBeChecked.contains("u");
    }

//    respuesta propuesta:
//    aca utilizo una funcion ya pre-definida (claro la descubri despues de googlear, despues de hacer la mia)
//     StringBuilder sb = new StringBuilder(str);
//        return sb.reverse().toString();
//        
    private String invertString(String toBeInverted) {
        toBeInverted = toBeInverted.trim();
        String inverted = "";
        for (int i = toBeInverted.length(); i > 0; i--) {
            char letter = toBeInverted.charAt(i - 1);
            inverted += letter;
        }
        return inverted;
    }

    public int wordCount() throws Exception {
        Scanner sc = new Scanner(this.file, "UTF-8");
        int counter = 0;
        while (sc.hasNext()) {
            sc.next();
            counter++;
        }
        return counter;
    }

    public List<String> wordsContainingZ() throws Exception {
        List<String> wordsContainingZ = new ArrayList<String>();
        Scanner sc = new Scanner(this.file, "UTF-8");
        while (sc.hasNext()) {
            String next = sc.next();
            if (next.contains("z")) {
                wordsContainingZ.add(next);
            }
        }
        return wordsContainingZ;
    }
    
    public List<String> wordsEndingInL() throws Exception {
        List<String> wordsEndingWithL = new ArrayList<String>();
        Scanner sc = new Scanner(this.file, "UTF-8");
        while (sc.hasNext()) {
            String next = sc.next();
            if (next.endsWith("l")) {
                wordsEndingWithL.add(next);
            }
        }
        return wordsEndingWithL;
    }

    public List<String> palindromes() throws Exception {
        List<String> palindromes = new ArrayList<String>();
        Scanner sc = new Scanner(this.file, "UTF-8");
        while (sc.hasNext()) {
            String next = sc.next();
            if (next.equals(this.invertString(next))) {
                palindromes.add(next);
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        List<String> vowels = new ArrayList<String>();
        Scanner sc = new Scanner(this.file, "UTF-8");
        while (sc.hasNext()) {
            String next = sc.next();
            if (this.checkForVowels(next)) {
                vowels.add(next);
            }
        }
        return vowels;
    }
}
