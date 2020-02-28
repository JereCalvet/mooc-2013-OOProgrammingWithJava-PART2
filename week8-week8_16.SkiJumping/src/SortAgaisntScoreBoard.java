import java.util.Comparator;
/**
 *
 * @author Jere
 */
public class SortAgaisntScoreBoard implements Comparator<Participant> {
    
    @Override
    public int compare(Participant player, Participant otherPlayer) {
        return otherPlayer.getPoints() - player.getPoints();
    }
}
