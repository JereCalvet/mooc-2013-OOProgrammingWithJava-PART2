
import java.util.Comparator;

/**
 *
 * @author Jere
 */
public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card card, Card otherCard) {
        int comparacion = card.getSuit() - otherCard.getSuit();
        if (comparacion == 0) {
            comparacion = card.getValue() - otherCard.getValue();
        }
        return comparacion;
    }
    
}
