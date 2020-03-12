
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jere
 */
public class RingingCentre {

    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        /*
        if (!observationLocations.containsKey(bird)) {
            observationLocations.put(bird, new ArrayList<String>());
        }
        observationLocations.get(bird).add(location);
        */
        if (this.observations.containsKey(bird)) {
            this.observations.get(bird).add(place);
        } else {
            this.observations.put(bird, new ArrayList<String>());
            this.observations.get(bird).add(place);
        }

    }

    public void observations(Bird bird) {
        /*
        if (!observationLocations.containsKey(bird)) {
            System.out.println(bird + " observations: 0");
            return;
        }
 
        System.out.println(bird + " observations: " + observationLocations.get(bird).size());
        for (String location : observationLocations.get(bird)) {
            System.out.println(location);
        }
        */
        if (this.observations.containsKey(bird)) {
            List<String> placesList = new ArrayList<String>(this.observations.get(bird));
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") " + "observations: " + placesList.size());
            for (String place : placesList) {
                System.out.println(place);
            }
        } else {
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") " + "observations: " + 0);
        }
    }
}
