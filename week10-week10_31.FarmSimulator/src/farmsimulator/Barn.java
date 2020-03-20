package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Jere
 */
public class Barn {
    private MilkingRobot robot;
    private BulkTank tank;

    public Barn(BulkTank tank) {
        this.tank = tank;   
    }

    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = milkingRobot;
        milkingRobot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow){
          if (this.robot == null) {
            throw new IllegalStateException("Milking robot hasn't been installed yet");
        } else {
            robot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
//        respuesta propuesta: uso el metodo para 1 vaca. no me avive 
//          for (Cow cow : cows) {
//            takeCareOf(cow);
//        }
        if (this.robot == null) {
            throw new IllegalStateException("Milking robot hasn't been installed yet");
        } else {
            for (Cow cow : cows) {
                robot.milk(cow);
            }
        }
    }
    
    @Override
    public String toString(){
        return tank.toString();
    }
}
