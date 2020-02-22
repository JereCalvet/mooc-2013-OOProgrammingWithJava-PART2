
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class Box implements ToBeStored {
                                                 //resp pro: importa e utilizar list
    private ArrayList<ToBeStored> listOfThings; //   private List<ToBeStored> items = new ArrayList<ToBeStored>();
    private double maxWeight;

    public Box(double maxWeight) {
        this.listOfThings = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored thing){
        if (this.maxWeight >= this.weight() + thing.weight()){
            this.listOfThings.add(thing);
        }
    }
    
    @Override
    public double weight(){
        double weight = 0; 
        for (ToBeStored thing : this.listOfThings){
            weight += thing.weight();
        }
        return weight;
    }
     
    @Override
    public String toString(){
        return "Box: "+this.listOfThings.size()+" things, total weight "+ this.weight()+" kg";
    }
}
