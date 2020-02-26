
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Participant implements Comparable<Participant> {
    private String name;
    private int points;
    private List<Jump> jumpList;

    public Participant(String name) {
        this.name = name;
        this.points = 0;
        this.jumpList = new ArrayList<Jump>();
    }

    //getter - setter
    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    //metodos
    public void addJump(Jump jump){
        this.jumpList.add(jump);
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }

    @Override
    public int compareTo(Participant otherParticipant) {
        return this.getPoints() - otherParticipant.getPoints();
    }
    
    
}
