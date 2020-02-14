
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class Container {
    private int weightLimit;
    private ArrayList<Suitcase> listOfSuitCase;
    
    public Container(int maxWeightLimit){
        this.weightLimit = maxWeightLimit;
        this.listOfSuitCase = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){ //esto se podria llamar (Suitcase pSuitcase)
        this.listOfSuitCase.add(suitcase);
    }
}
