
import java.util.ArrayList;
/**
 *
 * @author Jere
 */
public class Changer {
    private int numOfChanges;
    private ArrayList<Change> listOfChanges;
    
    public Changer(){
        this.numOfChanges = 0;
        this.listOfChanges = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        this.listOfChanges.add(change);
        this.numOfChanges++;
    }
    
    public String change(String characterString){
        String toBeChanged = characterString;
        for (Change changeToAply : listOfChanges){
            toBeChanged = changeToAply.change(toBeChanged);
        }
        return toBeChanged;
    }
}
