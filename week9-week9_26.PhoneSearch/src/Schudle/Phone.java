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

    public void addNumber(Person person, String number) {
        if (this.phoneNumbers.containsKey(person)) {
            this.phoneNumbers.get(person).add(number);
        } else {
            this.phoneNumbers.put(person, new ArrayList<String>());
            this.phoneNumbers.get(person).add(number);
        }    
    }

    public ArrayList<String> searchNumber(String personName){
        for (Person person : this.phoneNumbers.keySet()) {
            if (person.getSurname().equals(personName)) {
                return this.phoneNumbers.get(person);
            }
        }
        return null;
    }
    
    public Person searchPerson(String phoneNumber){
        for (Person personList : this.phoneNumbers.keySet()) {
            for (String number : this.phoneNumbers.get(personList)) {
                if (number.equals(phoneNumber)) {
                   return personList; 
                }
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Person person : this.phoneNumbers.keySet()) {
            result += person + " " + this.phoneNumbers.get(person) + "\n";
        }
        return result;
    }
}
