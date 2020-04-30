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

    /*
    if nunca evaluaron una pelicula:
    
    encontrar personas que hayan visto las mismas peliculas que ya vio y que tengan el mismo rating
    guardarlas en una lista de personas
    ver que otra peliculas vieron esas personas que tengan buen ranking y que no haya visto
    
    else
    
    dar la mejor promedio;
    
    resto devolver null
     */
    private Film getFilmHighestAvgRating() {
        List<Film> films = rating.getListOfFilms();
        Collections.sort(films, new FilmComparator(rating.filmRatings()));
        return films.get(0);
    }

    public Film recommendFilm(Person person) {
        if (rating.hasPersonRatedAnyFilm(person)) {
            System.out.println("si rateo una pelicula");
        } else {
            System.out.println("no rateo nada");
        }
        return null;
    }
}
