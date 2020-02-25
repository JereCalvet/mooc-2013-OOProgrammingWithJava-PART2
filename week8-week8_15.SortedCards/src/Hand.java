
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author Jere
 */
public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public void print(){
        for (Card card : hand){
            System.out.println(card);
        }
    }
    
    public int handValue(){
        int value = 0;
        for (Card card : this.hand){
            value += card.getValue();
        }
        return value;
    }

    @Override
    public int compareTo(Hand otherHand) {
        return this.handValue() - otherHand.handValue();
    }
}
