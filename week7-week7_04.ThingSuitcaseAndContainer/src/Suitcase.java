
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
        if (this.maxWeightLimit > (thingToAdd.getWeight() + totalWeight())) {
            this.listOfThings.add(thingToAdd);
        }
    }

    public Thing heaviestThing() {
        if (!this.listOfThings.isEmpty()) {
            Thing something = new Thing(null, 0);
            for (Thing thing : this.listOfThings) {
                if (something.getWeight() < thing.getWeight()) {
                    something = thing;
                }
            }
            return something;
            /*
            aca tengo duda si esta bien. funcionar, funciona
            la duda es que something hace referencia al ultimo objeto mas pesado.
            si se modifica la refencia(el resultado del metodo), se modifica el objeto base.
            */
        }
        return null;
    }

    @Override
    public String toString() {
        if (listOfThings.isEmpty()) {
            return "empty (" + totalWeight() + " kg)";
        } else if (listOfThings.size() == 1) {
            return listOfThings.size() + " thing (" + totalWeight() + " kg)";
        } else {
            return listOfThings.size() + " things (" + totalWeight() + " kg)";
        }
    }
}
