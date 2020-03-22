package boxes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jere
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private Set<Thing> listThings;

    public MaxWeightBox(int maxWeight) {
        this.listThings = new HashSet<Thing>();
        this.maxWeight = maxWeight;
    }

    private int getCurrentWeight() {
        int boxWeight = 0;
        for (Thing thing : listThings) {
            boxWeight += thing.getWeight();
        }
        return boxWeight;
    }

    @Override
    public void add(Thing thing) {
        if (this.getCurrentWeight() + thing.getWeight() <= this.maxWeight) {
            this.listThings.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        //respuesta proropuesta: utilizo el metodo equals de thing. Usa conteins
        // return this.things.contains(thing);
        for (Thing iThing : listThings) {
            if (iThing.getName().equals(thing.getName())) {
                return true;
            }
        }
        
        return false;
    }

}
