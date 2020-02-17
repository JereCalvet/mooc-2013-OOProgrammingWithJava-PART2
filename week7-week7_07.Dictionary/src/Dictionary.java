
/**
 *
 * @author Jere
 */

import java.util.HashMap;
import java.util.ArrayList;
//resp prop: import java.util.Map; 
//resp prop: import java.util.List;


public class Dictionary {
    private HashMap<String, String> dictionary;  //respuesta propuesta
                                                 //private Map<String, String> translations;    map??
    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public ArrayList<String> translationList() {
        /*
        resp propuesta:
        List<String> translationList = new ArrayList<String>(); list??  
        ...
        
        mas adelante: usa una variable para hacer el codigo mas legible
        String translation = key + " = " + this.translations.get(key);
            translationList.add(translation);
        */
        ArrayList<String> result = new ArrayList<String>();
        for (String key : this.dictionary.keySet()) {
            result.add(key + " = " + this.dictionary.get(key));
        }

        return result;
    }

    public void printTranslationList(){
        for (String translation : this.translationList()){
            System.out.println(translation);
        }
    }
    
    public int amountOfWords() {
        return this.dictionary.size();
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    /*
        resp prop: una sola linea de codigo. 
        return this.translations.get(word);
    */    
    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
}
