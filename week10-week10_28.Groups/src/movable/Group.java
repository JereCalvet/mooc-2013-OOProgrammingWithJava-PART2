package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Group implements Movable{
    private List<Movable> group;

    public Group() {
        this.group = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){
        this.group.add(movable);
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Movable movable : this.group) {
            result += movable + "\n";
        }
        return result;
    }
     
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.group) {
            movable.move(dx, dy);
        }
    }
}
