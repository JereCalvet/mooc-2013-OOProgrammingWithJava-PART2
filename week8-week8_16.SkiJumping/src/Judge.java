
import java.util.Random;

/**
 *
 * @author Jere
 */
public class Judge {

    private int vote;
    private Random random;

    public Judge() {
        this.vote = 0;
        this.random = new Random();
    }
    
    public void castVote(){ //vote random between 10-20
        int low = 10;
        int high = 21;
        this.vote = this.random.nextInt(high - low) + low;
    }

    public int getVote() {
        return vote;
    }
}
