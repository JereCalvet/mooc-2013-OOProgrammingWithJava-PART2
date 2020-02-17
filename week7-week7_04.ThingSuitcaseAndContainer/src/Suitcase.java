
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class Suitcase {

    private ArrayList<Thing> listOfThings;
    private int maxWeightLimit;

    public Suitcase(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.listOfThings = new ArrayList<Thing>();
    }

    public int totalWeight() {
        int sum = 0;
        for (Thing thing : this.listOfThings) {
            sum += thing.getWeight();
        }
        return sum;
    }

    public void printThings() {
        for (Thing thing : this.listOfThings) {
            System.out.println(thing);
        }
    }

    public void addThing(Thing thingToAdd) {
        if (this.maxWeightLimit >= (thingToAdd.getWeight() + totalWeight())) {
            this.listOfThings.add(thingToAdd);
        }
    }

    public Thing heaviestThing() {
        /* respuesta propuesta: el mio verifica que no este vacio. este no
        declara en objeto null y en el if entra y guarda la "thing" de turno en el objeto.
        
        similar a mi codigo, muy bueno
        Thing heaviest = null;
 
        for (Thing thing : this.things) {
            if (heaviest == null || heaviest.getWeight() < thing.getWeight()) {
                heaviest = thing;
            }
        }

        return heaviest;
        */
        if (!this.listOfThings.isEmpty()) {
            Thing something = new Thing(null, 0);
            for (Thing thing : this.listOfThings) {
                if (something.getWeight() < thing.getWeight()) {
                    something = thing;
                }
            }
            return something;
        }
        return null;
    }

    @Override
    public String toString() {
        if (this.listOfThings.isEmpty()) {
            return "empty (" + totalWeight() + " kg)";
        } else if (this.listOfThings.size() == 1) {
            return this.listOfThings.size() + " thing (" + totalWeight() + " kg)";
        } else {
            return this.listOfThings.size() + " things (" + totalWeight() + " kg)";
        }
    }
}
