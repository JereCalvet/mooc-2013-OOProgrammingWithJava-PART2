package reference;

import java.util.Collections;
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
        //Collections.sort(, new FilmComparator(rating.filmRatings()));

        /*        Implement the class Reference in the package reference. 
        The class Reference receives a RatingRegister object as constructor parameter. 
        Reference uses the ratings in the rating register to elaborate a recommendation.

        Implement the method public Film recommendFilm(Person person), which implements films to people. 
        Hint: you need three things to find out the most suitable film. 
        These are at least the class FilmComparator which you created earlier on; 
        the method public Map<Film, List<Rating>> filmRatings() of the class RatingRegister; 
        and a list of the existing films.
         */
        return null;
    }
}
