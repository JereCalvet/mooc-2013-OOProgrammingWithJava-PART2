package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.*; /*resp propuesta: importo box y thing se forma separada 
                        
                        import moving.domain.Box;
                        import moving.domain.Thing;
                        */

/**
 *
 * @author Jere
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        /* List<Box> boxes = new ArrayList<Box>(); //resp propuesta: dio esta solucion en vez de la que pone cosas
        for (Thing thing : things) {               // en las cajas segun el tamaño
            Box box = new Box(this.boxesVolume);
            boxes.add(box);
            if (box.addThing(thing)) {
                System.out.println();
            }
        }
        return boxes;*/
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(this.boxesVolume);
        boxes.add(box);
        while (!things.isEmpty()) {
            if (box.addThing(things.get(0))) {
                things.remove(0);
            } else {
                box = new Box(this.boxesVolume);
                if (box.addThing(things.get(0))) {
                    things.remove(0);
                    boxes.add(box);
                }
            }
        }
        return boxes;
    }
}
