package boxes;

/**
 *
 * @author Jere
 */
public class OneThingBox extends Box {

    private Thing thingSlot;

    public OneThingBox() {
        this.thingSlot = null;
    }

    @Override
    public void add(Thing thing) {
        if (thingSlot == null) {
            this.thingSlot = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
//        respuesta propuesta: utilizo el metodo equals
//        return this.thing != null && this.thing.equals(thing);
        if (this.thingSlot != null && this.thingSlot.getName().equals(thing.getName())) {
            return true;
        }
        return false;
    }

}
