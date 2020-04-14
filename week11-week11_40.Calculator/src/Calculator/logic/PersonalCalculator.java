package Calculator.logic;

/**
 *
 * @author Jere
 */
public class PersonalCalculator implements Calculator {

    private int value;

    public PersonalCalculator() {
        this.value = 0;
    }

    @Override
    public int giveValue() {
        return value;
    }

    @Override
    public int plus(int x) {
        return value += x;
    }

    @Override
    public int minus(int x) {
        return value -= x;
    }

    @Override
    public void reset() {
        value = 0;
    }
}
