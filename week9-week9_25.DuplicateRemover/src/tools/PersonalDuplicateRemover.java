package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Jere
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

//    respuesta propuesta: lo hizo tan sensillo. utilizo un set y un int.
//                         la diferencia es que en ningun momento guarda los duplicados            
//    metodo agregar
//       boolean added = variableSet.add(characterString);
//        if (!added) {
//            variableIntDuplicates++;
//        }        
//    
//    metodo # duplicados
//            return variableIntDuplicates;
//            
//    Metodo getUniqueCharacterStrings
//            return set;
//    
//    metodo empty
//           set.clear;
//           variableIntDuplicates = 0;
      
    private List<String> list;
    private Set<String> listWithoutDuplicates;

    public PersonalDuplicateRemover() {
        this.list = new ArrayList<String>();
    }

    private void filterDuplicates() {
        this.listWithoutDuplicates = new HashSet<String>();
        for (String characterString : this.list) {
            this.listWithoutDuplicates.add(characterString);
        }
    }

    @Override
    public void add(String characterString) {
        this.list.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        this.filterDuplicates();
        return this.list.size() - this.listWithoutDuplicates.size();
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        this.filterDuplicates();
        return this.listWithoutDuplicates;
    }

    @Override
    public void empty() {
        if (!this.list.isEmpty()) {
            this.list.clear();
        }
        if (this.listWithoutDuplicates != null) {
            this.listWithoutDuplicates.clear();
        }
    }
}
