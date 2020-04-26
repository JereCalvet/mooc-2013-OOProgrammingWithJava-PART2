package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Jere
 */
public class PersonComparator implements Comparator<Person> {
    
    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }
    
    @Override
    public int compare(Person person, Person otherPerson) {
        return peopleIdentities.get(otherPerson) - peopleIdentities.get(person);
    }
}
