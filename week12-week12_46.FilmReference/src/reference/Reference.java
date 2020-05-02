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

    private int calculateSimilarity(Person person, Person otherPerson) {
        List<Film> filmsInCommon = getFilmsInCommon(person, otherPerson);

        int similarityRating = 0;
        for (Film film : filmsInCommon) {
            int personRating = rating.getRating(person, film).getValue();
            int otherPersonRating = rating.getRating(otherPerson, film).getValue();
            similarityRating += (personRating * otherPersonRating);
        }

        return similarityRating;
    }

    private Person getMostSuitablePersonToRecommend(Person person) {
        List<Person> reviewers = rating.reviewers();
        reviewers.remove(person);

        int bestSimilarity, currentSimilarity;
        bestSimilarity = currentSimilarity = 0;
        Person mostSuitablePerson = null;
        for (Person reviewer : reviewers) {
            currentSimilarity = calculateSimilarity(person, reviewer);
            if (currentSimilarity > bestSimilarity) {
                bestSimilarity = currentSimilarity;
                mostSuitablePerson = reviewer;
            }
        }

        return mostSuitablePerson;
    }

    private List<Film> getUnwatchedFilmsFromMostSuitablePerson(Person person) {
        Person mostSuitablePerson = getMostSuitablePersonToRecommend(person);

        List<Film> personFilms = getPersonRatedFilms(person);
        List<Film> otherPersonFilms = getPersonRatedFilms(mostSuitablePerson);

        for (Film film : personFilms) {
            if (otherPersonFilms.contains(film)) {
                otherPersonFilms.remove(film);
            }
        }

        return otherPersonFilms;
    }

    private Film getBestFilmToRecommendFromMostSuitablePerson(Person person) {
        List<Film> unwatchedFilms = getUnwatchedFilmsFromMostSuitablePerson(person);
        Person mostSuitablePerson = getMostSuitablePersonToRecommend(person);
        Film bestFilm = null;
        Rating bestRatingAtm = Rating.NOT_WATCHED;

        for (Film film : unwatchedFilms) { //filtered list
            Rating rated = rating.getRating(mostSuitablePerson, film);
            if (rated.getValue() > bestRatingAtm.getValue()) {
                bestRatingAtm = rated;
                bestFilm = film;
            }
        }
        return bestFilm;
    }

    public Film recommendFilm(Person person) {
        if (rating.hasPersonRatedAnyFilm(person)) {
            return getBestFilmToRecommendFromMostSuitablePerson(person);
        } else {
            return getFilmHighestAvgRating();
        }
    }
}
