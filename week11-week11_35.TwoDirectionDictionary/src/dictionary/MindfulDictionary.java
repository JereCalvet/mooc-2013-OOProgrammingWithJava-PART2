package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class MindfulDictionary {

    private Map<String, String> dictionary;
    private File file;

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    
    /*
    respuesta propuesta:
     utilizo para no repetir en el segundo constructor. siempre me olvido!
    
    this();
    */
    public MindfulDictionary(String file) {
        this.dictionary = new HashMap<String, String>();
        this.file = new File(file);
    }    

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }

        for (String key : dictionary.keySet()) {
            String value = dictionary.get(key);
            if (value.equals(word)) {
                return key;
            }
        }

        return null;
    }

    public void remove(String word) {
        dictionary.remove(word);

        String toBeRemoved = "";
        for (String key : dictionary.keySet()) {
            String value = dictionary.get(key);
            if (value.equals(word)) {
                toBeRemoved = key;
            }
        }
        
        if (!toBeRemoved.isEmpty()) {
            dictionary.remove(toBeRemoved);
        }
    }

    public boolean load(){
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
    
    public boolean save(){
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String key : dictionary.keySet()) {
                writer.write(key + ":" + dictionary.get(key) + "\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
    
    @Override
    public String toString() {
        String data = "";
        for (String key : dictionary.keySet()) {
            data += "Key: " + key + " Value: " + dictionary.get(key) + "\n";
        }
        return data;
    }
}
