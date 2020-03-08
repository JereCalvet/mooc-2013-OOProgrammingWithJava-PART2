package Schudle;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO- evitar parametros de funciones nulos
 *
 * @author Jere
 */
public class Address {

    private Map<Person, Map<String, String>> address;

    public Address() {
        this.address = new HashMap<Person, Map<String, String>>();
    }

    public void addAddress(String personName, String street, String city) {
        Person tempPerson = new Person(personName);
        if (this.address.containsKey(tempPerson)) {
            this.address.get(tempPerson).put(street, city);
        } else {
            this.address.put(tempPerson, new HashMap<String, String>());
            this.address.get(tempPerson).put(street, city);
        }
    }

    public String searchPersonalInfo(String personName) {
        Person tempPerson = new Person(personName);
        Map<String, String> addressMap = null;
        String result = "";
        if (this.address.containsKey(tempPerson)) {
            addressMap = this.address.get(tempPerson);
            for (String street : addressMap.keySet()) {
                result += street + " " + addressMap.get(street) + "\n";
            }
        }
        return result;
    }

    public void deletePersonalInfo(String personName) {
        Person tempPerson = new Person(personName);
        this.address.remove(tempPerson);
    }

    @Override
    public String toString() {
        String result = "";
        for (Person person : this.address.keySet()) {
            Map<String, String> addressMap = this.address.get(person);
            for (String street : addressMap.keySet()) {
                result += person + " " + street + " " + addressMap.get(street) + "\n";
            }
        }
        return result;
    }
}
