package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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

    private List<Film> getPersonRatedFilms(Person person) {
        Map<Film, Rating> personFilmsAndRating = rating.getPersonalRatings(person);
        List<Film> personFilms = new ArrayList<Film>();
        for (Film film : personFilmsAndRating.keySet()) {
            personFilms.add(film);
        }
        return personFilms;
    }

    private List<Film> getFilmsInCommon(Person person, Person otherPerson) {
        List<Film> filmsInCommon = new ArrayList<Film>();
        List<Film> personFilms = getPersonRatedFilms(person);
        List<Film> otherPersonFilms = getPersonRatedFilms(otherPerson);

        for (Film film : personFilms) {
            if (otherPersonFilms.contains(film)) {
                filmsInCommon.add(film);
            }
        }

        return filmsInCommon;
    }

    public int calculateSimilarity(Person person, Person otherPerson) {
        List<Film> filmsInCommon = getFilmsInCommon(person, otherPerson);

        int similarityRating = 0;
        for (Film film : filmsInCommon) {
            int personRating = rating.getRating(person, film).getValue();
            int otherPersonRating = rating.getRating(otherPerson, film).getValue();
            similarityRating += (personRating * otherPersonRating);
        }

        return similarityRating;
    }

    public Film recommendFilm(Person person) {
        if (rating.hasPersonRatedAnyFilm(person)) {

        } else {
            return getFilmHighestAvgRating();
        }

        return null;
    }
}
