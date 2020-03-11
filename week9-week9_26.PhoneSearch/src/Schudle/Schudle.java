package Schudle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jere
 */
public class Schudle {

    private List<Person> listOfPerson;
    private Phone phoneList;
    private Address addressList;

    public Schudle() {
        this.listOfPerson = new ArrayList<Person>();
        this.phoneList = new Phone();
        this.addressList = new Address();
    }

    //adders----------------------------------------
    public void addNumber(String name, String number) { //metodo 1
        listOfPerson.add(new Person(name));
        phoneList.addNumber(name, number);
    }

    public void addAddress(String name, String address, String city) { //metodo 4
        listOfPerson.add(new Person(name));
        this.addressList.addAddress(name, address, city);
    }

    //searchers--------------------------------------
    public void searchForNumber(String name) { //metodo 2
        if (this.phoneList.searchNumberWithPersonName(name) == null) {
            System.out.println(" not found");
        } else {
            for (String number : this.phoneList.searchNumberWithPersonName(name)) {
                System.out.println(" " + number);
            }
        }
    }

    public void searchForAddress(String name) {
        if (this.addressList.searchAddressWithPersonName(name) == null) {
            System.out.println("  address unknown");
        } else {
            System.out.print("  adress: ");
            Map<String, String> address = this.addressList.searchAddressWithPersonName(name);
            for (String street : address.keySet()) {
                System.out.print(street + " " + address.get(street) + "\n");
            }
        }
    }

    public void searchPersonByPhoneNumber(String number) { //metodo 3
        if (this.phoneList.searchPersonWithPhoneNum(number) == null) {
            System.out.println(" not found");
        } else {
            System.out.println(" " + this.phoneList.searchPersonWithPhoneNum(number).getSurname());
        }
    }

    private void handlePhoneSearchAndPrintingForOperationFive(String name) {
        if (this.phoneList.personContainsPhoneNumber(name)) {
            System.out.println("  phone numbers:");
            for (String number : this.phoneList.searchNumberWithPersonName(name)) {
                System.out.println("   " + number);
            }
        } else {
            System.out.println("  phone number not found");
        }
    }

    public void searchPersonalInfo(String name) { //metodo 5
        if (!this.listOfPerson.contains(this.getPersonObjFromString(name))) {
            System.out.println("  not found");
        } else {
            searchForAddress(name);
            handlePhoneSearchAndPrintingForOperationFive(name);
        }
    }

    //----------------------------delete
    public void deletePerson(String name) { //metodo 6
        this.listOfPerson.remove(this.getPersonObjFromString(name));
        this.phoneList.deletePhone(name);
        this.addressList.deleteAddress(name);
    }

    //helpérs--------------------------------------
    private boolean checkPersonExist(Person person) {
        return this.listOfPerson.contains(person);
    }

    private Person getPersonObjFromString(String name) {
        return new Person(name);
    }

    private Set<Person> addressFiltering(String address) {
        return this.addressList.searchAddressContaining(address);
    }

    private Set<Person> nameFiltering(String name) {  
        Set<Person> result = new HashSet<Person>();
        for (Person person : this.listOfPerson) {
            if (person.getSurname().contains(name)) {
                result.add(person);
            }
        }
        return result;
    }
        
    private void personListPrinting(List<Person> personList) {
        Collections.sort(personList);
        for (Person person : personList) {
            System.out.println("");
            System.out.println(" " + person.getSurname());
            this.searchPersonalInfo(person.getSurname());
        }
    }

    //--------------------metodo 7
    public void filteredListing(String input) {
        boolean found = false;
        
        if (input.isEmpty()) {
            this.personListPrinting(this.listOfPerson);
            found = true;
        }

        if (!this.nameFiltering(input).isEmpty() && !input.isEmpty()) {
            List<Person> whosNameMatch = new ArrayList<Person>(this.nameFiltering(input));
            this.personListPrinting(whosNameMatch);
            found = true;
        }

        if (!this.addressFiltering(input).isEmpty() && !input.isEmpty()) {
            List<Person> whosAddressMatch = new ArrayList<Person>(this.addressFiltering(input));
            this.personListPrinting(whosAddressMatch);
            found = true;
        }
        
        if (!found) {
            System.out.println(" keyword not found");
        }
    }
}
