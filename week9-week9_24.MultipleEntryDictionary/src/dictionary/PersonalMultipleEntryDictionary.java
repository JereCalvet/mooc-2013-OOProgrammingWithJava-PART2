package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jere
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

//    respuesta propuesta: lo hizo con un hashset. No lo utilice porque el hash no permite repeticiones
//    supuse que 2 palabras distintas no podian tener la misma definicion. error, no permite que la misma palabra
//    no tenga 2 deficiones iguales. testado    
//    queda la copia abajo, para recordar
         
    private Map<String, ArrayList<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, ArrayList<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, new ArrayList<String>());
        }
        this.dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (this.dictionary.containsKey(word)) {
            ArrayList<String> temporal = new ArrayList<String>(this.dictionary.get(word));
            Set<String> output = new HashSet<String>();
            for (String string : temporal) {
                output.add(string);
            }
            return output;    
        }
        return null;
    }

    @Override
    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
    }
    //---------------------------------------------------------------------------
//       private Map<String, Set<String>> dictionary =
//            new HashMap<String, Set<String>>();
// 
//    @Override
//    public void add(String word, String entry) {
//        Set<String> translations = dictionary.get(word);
//        if (translations == null) {
//            translations = new HashSet<String>();
//            dictionary.put(word, translations);
//        }
//        translations.add(entry);
//    }
// 
//    @Override
//    public Set<String> translate(String word) {
//        return dictionary.get(word);
//    }
// 
//    @Override
//    public void remove(String word) {
//        dictionary.remove(word);
//    }
}
