package boxes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jere
 */
public class BlackHoleBox extends Box{
    private Set<Thing> listThings;
    
    public BlackHoleBox() {
        this.listThings = new HashSet<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        this.listThings.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
