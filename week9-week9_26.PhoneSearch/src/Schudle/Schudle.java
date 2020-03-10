package Schudle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    //helpérs--------------------------------------
    private boolean checkPersonExist(Person person) {
        return this.listOfPerson.contains(person);
    }

    private Person getPersonObjFromString(String name) {
        return new Person(name);
    }

    //adders----------------------------------------
    public void addNumber(String name, String number) {
        listOfPerson.add(new Person(name));
        phoneList.addNumber(name, number);
    }

    public void addAddress(String name, String address, String city) {
        listOfPerson.add(new Person(name));
        this.addressList.addAddress(name, address, city);
    }

    //searchers--------------------------------------
    public void searchForNumber(String name) {
//        Person tempPerson = new Person(name);
//        if (checkPersonExist(tempPerson)) {
//        tal vez mas adelante tenga que usar esta funcion para evitar: 
//        If a person is deleted, no search should retrieve them.  
//        }
        if (this.phoneList.searchNumberWithPersonName(name) == null) {
            System.out.println(" not found");
        } else {
            for (String number : this.phoneList.searchNumberWithPersonName(name)) {
                System.out.println(" " + number);
            }
        }
    }

    public void searchForAddress(String name) {
        if (this.addressList.searchAddress(name) == null) {
            System.out.println("  address unknown");
        } else {
            System.out.print("  adress: ");
            Map<String, String> address = this.addressList.searchAddress(name);
            for (String street : address.keySet()) {
                System.out.print(street + " " + address.get(street) + "\n");
            }
        }
    }

    public void searchPersonByPhoneNumber(String number) {
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

    public void searchPersonalInfo(String name) {
        if (!this.listOfPerson.contains(this.getPersonObjFromString(name))) {
            System.out.println("  not found");
        } else {
            searchForAddress(name);
            handlePhoneSearchAndPrintingForOperationFive(name);
        }
    }
}
