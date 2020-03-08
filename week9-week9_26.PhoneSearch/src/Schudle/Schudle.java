package Schudle;

import java.util.ArrayList;
import java.util.List;

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
    
    public void addNumber(String name, String number){
        Person tempPerson = new Person(name);
        listOfPerson.add(tempPerson);
        phoneList.addNumber(tempPerson, number);
    }
    
    
}
