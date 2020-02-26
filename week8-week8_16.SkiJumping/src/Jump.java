
import java.util.Random;

/**
 *
 * @author Jere
 */
public class Jump {

    private int length;
    private int score;
    private Random random;

    public Jump() {
        this.random = new Random();
        this.length = this.generateJump();
        this.score = 0;
    }

    private int generateJump() { //jump random between 60-120
        int low = 60;
        int high = 121;
        return this.random.nextInt(high - low) + low;
    }

    public int getLength() {
        return length;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
