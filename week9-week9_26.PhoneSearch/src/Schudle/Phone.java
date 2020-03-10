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

    private Person getPersonObjFromString(String name) {
        return new Person(name);
    }

    public boolean personContainsPhoneNumber(String personName) {
        return this.phoneNumbers.containsKey(this.getPersonObjFromString(personName));
    }

    public void addNumber(String name, String number) {
        if (this.personContainsPhoneNumber(name)) {
            this.phoneNumbers.get(this.getPersonObjFromString(name)).add(number);
        } else {
            this.phoneNumbers.put(this.getPersonObjFromString(name), new ArrayList<String>());
            this.phoneNumbers.get(this.getPersonObjFromString(name)).add(number);
        }
    }

    public ArrayList<String> searchNumberWithPersonName(String personName) {
        for (Person person : this.phoneNumbers.keySet()) {
            if (person.getSurname().equals(personName)) {
                return this.phoneNumbers.get(person);
            }
        }
        return null;
    }

    public Person searchPersonWithPhoneNum(String phoneNumber) {
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
