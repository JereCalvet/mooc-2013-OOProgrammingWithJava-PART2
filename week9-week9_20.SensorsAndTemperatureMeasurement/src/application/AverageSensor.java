package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class AverageSensor implements Sensor {

    private List<Sensor> listOfSensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.listOfSensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor sensor) {
        this.listOfSensors.add(sensor);
    }

    private void turnThem(boolean onOff) {
        for (Sensor sensor : this.listOfSensors) {
            if (onOff) {
                sensor.on();
            } else {
                sensor.off();
            }
        }
    }

    private boolean areThemOnOrOff() {
        /* resp propuesta: similar solo que verifica que la lista de sensores no este vacia
           if (sensors.isEmpty()) {
            return false;
        }
 
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
 
        return true; 
         */
        for (Sensor sensor : this.listOfSensors) {
            if (sensor.isOn()) {
                return true;
            }
        }
        return false;
    }

    public int avgReadings() {
        int sum, counter;
        sum = counter = 0;
        for (Sensor sensor : this.listOfSensors) {
            sum += sensor.measure();
            counter++;
        }
        int avg = sum / counter; //aca divide por sensor.size(); en vez de counter
        this.readings.add(avg);
        return avg;
    }

    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public boolean isOn() {
        return areThemOnOrOff();
    }

    @Override
    public void on() {
        this.turnThem(true); //on
    }

    @Override
    public void off() {
        this.turnThem(false); //off
    }

    @Override
    public int measure() {
        if (!this.isOn()) {
            throw new IllegalStateException("Sensor is OFF.");
        }
        if (this.listOfSensors.isEmpty()) {
            throw new IllegalStateException("List of sensors is empty.");
        }
        return avgReadings();
    }

}
