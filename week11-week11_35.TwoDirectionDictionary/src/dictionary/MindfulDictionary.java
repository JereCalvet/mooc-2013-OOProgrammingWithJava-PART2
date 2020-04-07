package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jere
 */
public class MindfulDictionary {

    private Map<String, String> dictionary;

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
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

    @Override
    public String toString() {
        String data = "";
        for (String key : dictionary.keySet()) {
            data += "Key: " + key + " Value: " + dictionary.get(key) + "\n";
        }
        return data;
    }
}
