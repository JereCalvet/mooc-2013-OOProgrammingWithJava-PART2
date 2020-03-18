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
        if (!capHistory.isEmpty()) {
            minValue = capHistory.get(0);
            for (Double value : capHistory) {
                if (value < minValue) {
                    minValue = value;
                }
            }
        }
        return minValue;
    }

    public double average() {
        double avg = 0;
        int counter = 0;
        for (Double value : capHistory) {
            avg += value;
            counter++;
        }
        if (counter > 0) {
            avg = avg / counter;
        }
        return avg;
    }

    //--fase 3
    public double fluctuation(double numA, double numB) {
        return Math.abs(numA - numB);
    }

    public double greatestFluctuation() {
        double greatestFluctuation = 0;
        double fluctuation = 0;
        if (this.capHistory.size() > 1) {
            for (int i = 0; i < this.capHistory.size(); i++) {
                if (i+1 < this.capHistory.size()) {
                    fluctuation = this.fluctuation(this.capHistory.get(i), this.capHistory.get(i + 1));
                }
                if (fluctuation > greatestFluctuation) {
                    greatestFluctuation = fluctuation;
                }
            }
            return greatestFluctuation;
        }
        return greatestFluctuation;
    }

    public double variance() {
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
