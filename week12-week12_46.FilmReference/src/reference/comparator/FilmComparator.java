package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.*;

/**
 *
 * @author Jere
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    private double calculateFilmAvgRating(Film film) {
        Double filmAvgRating = 0.0;
        List<Rating> ratingList = ratings.get(film);
        for (Rating rating : ratingList) {
            filmAvgRating += rating.getValue();
        }
        filmAvgRating = filmAvgRating / ratingList.size();
        return filmAvgRating;
    }

    @Override
    public int compare(Film film, Film otherFilm) {
        return (int) (calculateFilmAvgRating(otherFilm) - calculateFilmAvgRating(film));
    }
}
