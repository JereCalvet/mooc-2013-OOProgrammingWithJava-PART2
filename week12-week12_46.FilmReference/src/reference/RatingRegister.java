package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.*;

/**
 *
 * @author Jere
 */
public class RatingRegister {

    private Map<Film, List<Rating>> ratingStorage;
    private Map<Person, Map<Film, Rating>> personalRating;

    public RatingRegister() {
        this.ratingStorage = new HashMap<Film, List<Rating>>();
        this.personalRating = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        /* respuesta propuesta: es igual pero escrito de otra forma
              if (!this.filmRatings.containsKey(film)) {             //por aca solo si esta agregando
            this.filmRatings.put(film, new ArrayList<Rating>());
            }
 
            List<Rating> movieRatings = this.filmRatings.get(film);  //por aca pasa siempre
            movieRatings.add(rating);    
        */
        if (ratingStorage.containsKey(film)) {
            ratingStorage.get(film).add(rating);
        } else {
            ratingStorage.put(film, new ArrayList<Rating>());
            ratingStorage.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film) {
        return ratingStorage.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return ratingStorage;
    }

    public void addRating(Person person, Film film, Rating rating) {
        Map<Film, Rating> filmRatingStorage;
        if (personalRating.containsKey(person)) {
            filmRatingStorage = personalRating.get(person);
            if (!filmRatingStorage.containsKey(film)) {
                filmRatingStorage.put(film, rating);
            }
        } else {
            personalRating.put(person, new HashMap<Film, Rating>());
            personalRating.get(person).put(film, rating);
        }
        addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) { 
        Map<Film, Rating> filmRatingStorage;
        if (personalRating.containsKey(person)) {
            filmRatingStorage = personalRating.get(person);
            if (filmRatingStorage.containsKey(film)) {
                return filmRatingStorage.get(film);
            }
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        /*
        respuesta propuesta: esta es la forma correcta de escribir este metodo
         if (!this.personalRatings.containsKey(person)) {
            return new HashMap();
        }
 
        return this.personalRatings.get(person);
        */
        
        if (personalRating.containsKey(person)) {
            return personalRating.get(person);
        }
        Map<Film, Rating> nullResult = new HashMap<Film, Rating>();
        return nullResult;
    }

    public List<Person> reviewers() {
        List<Person> reviewers = new ArrayList<Person>();
        for (Person person : personalRating.keySet()) {
            reviewers.add(person);
        }
        return reviewers;
    }

    public List<Film> getListOfFilms() {
        List<Film> listOfFilms = new ArrayList<Film>();
        for (Film film : ratingStorage.keySet()) {
            listOfFilms.add(film);
        }
        return listOfFilms;
    }
    
    public boolean hasPersonRatedAnyFilm(Person person) {
       return personalRating.containsKey(person);
    }
}
