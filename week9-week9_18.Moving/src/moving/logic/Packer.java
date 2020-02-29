package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.*;

/**
 *
 * @author Jere
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    private Box getBox(int size){
        return new Box(size);
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        boxes.add(getBox(this.boxesVolume));
        
        
        for (Thing thing : things) {
            if (box.addThing(thing)){
                
            }
        }
        
        
        return boxes;
    }
}
