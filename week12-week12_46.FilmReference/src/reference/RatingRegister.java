package reference;

import java.util.HashMap;
import java.util.Map;
import reference.domain.*;

/**
 *
 * @author Jere
 */
public class RatingRegister {

    private Map<Person, Map<Film, Rating>> peopleRatings;

    public RatingRegister() {
        this.peopleRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        Map<Film, Rating> tempHashMap;
        if (peopleRatings.containsKey(person)) {
            tempHashMap = peopleRatings.get(person);
            if (!tempHashMap.containsKey(film)) {
                tempHashMap.put(film, rating);
            }
//            verificar si la persona ya rateo la pelicula ? return : ratear la pelicula y guardar los datos
//            add raiting to specific film to the parameter person.
//            person can only rate a film once.
//                    
            
//            peopleRatings.put(person, new HashMap<Film, Rating>());
//            peopleRatings.get(person).put(film, rating);
        }
    }
}
