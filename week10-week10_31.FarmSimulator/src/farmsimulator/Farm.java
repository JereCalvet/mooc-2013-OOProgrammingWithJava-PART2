package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> cowList;  //respuesta propuesta: uso un hashset para que no se repita la vaca!
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cowList = new ArrayList<Cow>();
    }

    public void installMilkingRobot(MilkingRobot robot){
       this.barn.installMilkingRobot(robot);
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void addCow(Cow cow){
        this.cowList.add(cow);
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cowList);
    }
    
    private String borroUltimaLinea(String string){
        return string.substring(0, (string.length() - 2));
    }
    
    @Override
    public String toString(){
        //respuesta propuesta: hizo lo mismo con string builder appends appends
        String strCowList; 
        if (this.cowList.isEmpty()) {
            strCowList = "No Cows.";
        } else {
            strCowList = "Animals: \n";
            for (Cow cow : cowList) {
                strCowList += "         " + cow + "\n";
            }
        }
        strCowList = borroUltimaLinea(strCowList);
        return "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + barn + "\n" + strCowList; 
    }

    @Override
    public void liveHour() {
        for (Cow cow : cowList) {
            cow.liveHour();
        }
    }
}
