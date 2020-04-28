package reference;

import reference.domain.*;
import reference.comparator.*;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        RatingRegister rek = new RatingRegister();
        Film saksiKasi = new Film("Saksikäsi");
        Film eraserhead = new Film("Eraserhead");
        Film haifisch = new Film("Haifisch");
        Person pekka = new Person("Pekka");
        rek.addRating(pekka, eraserhead, Rating.FINE);
        rek.addRating(pekka, saksiKasi, Rating.BAD);
        rek.addRating(saksiKasi, Rating.FINE);
        rek.addRating(saksiKasi, Rating.FINE);
        rek.addRating(haifisch, Rating.BAD);
        rek.addRating(haifisch, Rating.BAD);
        FilmComparator comp = new FilmComparator(rek.filmRatings());
        comp.compare(eraserhead, saksiKasi);
      //  expected negative value
    //    , you returned 2

// List<Film> films = Arrays.asList(eraserhead, saksiKasi, haifisch);
        //System.out.println(films);
        //Collections.sort(films, new FilmComparator(rek.filmRatings()));
        //System.out.println(films);
    }
}
