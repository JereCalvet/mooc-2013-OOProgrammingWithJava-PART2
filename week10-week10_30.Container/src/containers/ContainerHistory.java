package containers;

import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class ContainerHistory {

    private ArrayList<Double> capHistory;

//    --Contructor
    public ContainerHistory() {
        this.capHistory = new ArrayList<Double>();
    }

//    --fase 1
    public void add(double situation) {
        this.capHistory.add(situation);
    }

    public void reset() {
        this.capHistory.clear();
    }

//    --fase 2
    public double maxValue() {
        double maxValue = 0;
        for (Double value : capHistory) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public double minValue() {
        double minValue = 0;
        for (Double value : capHistory) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public double average() {
        double minValue = 0;
        int counter = 0;
        for (Double value : capHistory) {
            minValue += value;
            counter++;
        }
        if (counter > 0) {
            minValue = minValue / counter;
        }
        return minValue;
    }

    //--fase 3
    public double greatestFluctuation() {
        double greatestFluctuation = 0;
        if (this.capHistory.size() > 1) {
            if (Math.abs(this.maxValue()) > Math.abs(this.minValue())) {
                greatestFluctuation = this.maxValue();
                return greatestFluctuation;
            } else {
                greatestFluctuation = this.minValue();
                return greatestFluctuation;
            }
        }
        return greatestFluctuation;
    }
    
    public double variance(){
        double variance = 0;
        if (this.capHistory.size() > 1) {
            for (Double value : capHistory) {
                variance += Math.pow((value - this.average()), 2); 
            }
            variance = variance / (this.capHistory.size() - 1);
        }
        return variance;
    }

    @Override
    public String toString() {
        return capHistory.toString();
    }
}
