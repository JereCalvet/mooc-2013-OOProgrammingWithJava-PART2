package reference;

import java.util.Collections;
import java.util.List;
import reference.comparator.FilmComparator;
import reference.domain.*;

/**
 *
 * @author Jere
 */
public class Reference {

    private RatingRegister rating;

    public Reference(RatingRegister rating) {
        this.rating = rating;
    }

    public Film recommendFilm(Person person) {
        //best choice is recommending them the film which has received the hightest average among the ratings
        List<Film> films = rating.getListOfFilms(); 
        Collections.sort(films, new FilmComparator(rating.filmRatings())); 
        return films.get(0);
    }
}
