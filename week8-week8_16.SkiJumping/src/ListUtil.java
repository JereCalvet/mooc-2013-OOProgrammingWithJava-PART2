
import java.util.List;
import java.util.Collections;

/**
 *
 * @author Jere
 */
public class ListUtil {

    public static int voteCalculator(List<Integer> votes) {
        votes.remove(Collections.min(votes));
        votes.remove(Collections.max(votes));
        int jumpResult = 0;
        for (Integer vote : votes) {
            jumpResult += vote;
        }
        return jumpResult;
    }
}
