
import java.util.HashMap;
/**
 *
 * @author Jere
 */
public class PromissoryNote {
    private HashMap<String, Double> collection;
    
    public PromissoryNote() {
        this.collection = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        this.collection.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if (this.collection.containsKey(whose)){
            return this.collection.get(whose);
        }
        return 0;
    }
}
