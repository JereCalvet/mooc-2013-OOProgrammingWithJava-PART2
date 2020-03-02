package application;

import java.util.Random;

/**
 *
 * @author Jere
 */
public class Thermometer implements Sensor {

    private boolean state;
    private int temperature;  //resp propesuta: esta temperatura no la guarda

    public Thermometer() {
        this.state = false;
    }

    @Override
    public String toString() {
        String strState, strReadings;
        if (this.state) {
            strState = "on";
        } else {
            strState = "off";
        }
        return "Thermometer is " + strState + ". Temperature: " + this.temperature;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() { 
        if (this.state == false) {              //resp pro:  if (!isOn()) {
            throw new IllegalStateException("Thermometer is off.");
        }
        Random random = new Random();
        int low = -30;
        int high = 31;
        this.temperature = random.nextInt(high - low) + low;
        return this.temperature;
    }

}
