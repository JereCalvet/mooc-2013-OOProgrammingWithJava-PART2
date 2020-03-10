package Schudle;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO- evitar parametros de funciones nulos todo- If a person is deleted, no
 * search should retrieve them.
 *
 * @author Jere
 */
public class Address {

    private Map<Person, Map<String, String>> address;

    public Address() {
        this.address = new HashMap<Person, Map<String, String>>();
    }

    private Person getPersonObjFromString(String name) {
        return new Person(name);
    }

    public boolean personContainsAddress(String personName) {
        return this.address.containsKey(this.getPersonObjFromString(personName));
    }

    public void addAddress(String personName, String street, String city) {
        if (this.personContainsAddress(personName)) {
            this.address.get(getPersonObjFromString(personName)).put(street, city);
        } else {
            this.address.put(getPersonObjFromString(personName), new HashMap<String, String>());
            this.address.get(getPersonObjFromString(personName)).put(street, city);
        }
    }

    public Map<String, String> searchAddress(String personName) { 
        if (this.address.containsKey(getPersonObjFromString(personName))) {
            Map<String, String> addressMap = this.address.get(getPersonObjFromString(personName));
            return addressMap;
        }
        return null;
    }

    public void deleteAddress(String personName) {
        this.address.remove(getPersonObjFromString(personName));
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
