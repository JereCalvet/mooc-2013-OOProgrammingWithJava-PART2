package farmsimulator;

/**
 *
 * @author Jere
 */
public class MilkingRobot {

    private BulkTank tank; //resp prop: le asigna null en la declaracion (= null)

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        if (this.getBulkTank() == null) { //resp prop: tank = null
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            this.tank.addToTank(milkable.milk());
        }
    }
}
