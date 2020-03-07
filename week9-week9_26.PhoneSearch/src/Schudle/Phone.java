package Schudle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jere
 */
public class Phone {

    private Map<Person, ArrayList<String>> phoneNumbers;
    
    public Phone() {
        this.phoneNumbers = new HashMap<Person, ArrayList<String>>();
    }

    public void addNumber(String personName, String number) {
        Person tempPerson = new Person(personName);
        if (this.phoneNumbers.containsKey(tempPerson)) {
            this.phoneNumbers.get(tempPerson).add(number);
        } else {
            this.phoneNumbers.put(tempPerson, new ArrayList<String>());
            this.phoneNumbers.get(tempPerson).add(number);
        }    
    }

    public void printNumbers(String personName) { //for testing
        Person temp = new Person(personName);
        System.out.println(this.phoneNumbers.get(temp));
    }
}
