package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Box implements Thing {

    private int maximunCapacity;
    private List<Thing> thingsInside;

    public Box(int maximunCapacity) {
        this.maximunCapacity = maximunCapacity;
        this.thingsInside = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (this.maximunCapacity >= this.getVolume() + thing.getVolume()) {
            this.thingsInside.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int currentWeight = 0;
        for (Thing thing : this.thingsInside) {
            currentWeight += thing.getVolume();
        }
        return currentWeight;
    }
}
