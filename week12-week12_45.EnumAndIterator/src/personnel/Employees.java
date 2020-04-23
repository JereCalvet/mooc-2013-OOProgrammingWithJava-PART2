package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Employees {

    private List<Person> employeesList;

    public Employees() {
        this.employeesList = new ArrayList<Person>();
    }

    public void add(Person person) {
        employeesList.add(person);
    }

    public void add(List<Person> persons) {
//        respuesta propuesta:
//        utiliza el metodo anterior para agregar. siempre me olvido arggh!
        for (Person person : persons) {
            add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = employeesList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employeesList.iterator();

        while (iterator.hasNext()) {
            Person filteredPerson = iterator.next();
            if (filteredPerson.getEducation() == education) {
                System.out.println(filteredPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employeesList.iterator();

        while (iterator.hasNext()) {
            Person filteredPerson = iterator.next();
            if (filteredPerson.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
