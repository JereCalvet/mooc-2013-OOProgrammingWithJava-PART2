
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
        if (this.weightLimit >= (suitcase.totalWeight() + totalWeight())) {
            this.listOfSuitCase.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int sum = 0;
        for (Suitcase suitcase : this.listOfSuitCase) {
            sum += suitcase.totalWeight();
        }
        return sum;
    }
    
    public void printThings(){
        for (Suitcase suitcase:this.listOfSuitCase) {
            suitcase.printThings();
        }
    }
    
    @Override
    public String toString(){
        if (this.listOfSuitCase.isEmpty()) {
            return "empty (" + totalWeight() + " kg)";
        } else if (this.listOfSuitCase.size() == 1) {
            return this.listOfSuitCase.size() + " suitcase (" + totalWeight() + " kg)";
        } else {
            return this.listOfSuitCase.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }
}
