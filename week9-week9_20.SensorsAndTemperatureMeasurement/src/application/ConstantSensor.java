package application;

import java.util.Arrays;

/**
 *
 * @author Jere
 */
public class ConstantSensor implements Sensor {

    private int temperature;
    
    public ConstantSensor(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Sensor is on. Temperature: " + this.temperature;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public int measure() {
        return this.temperature;
    }

}
