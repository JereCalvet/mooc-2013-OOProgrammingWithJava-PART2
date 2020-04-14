package Calculator.ui;

import Calculator.logic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Jere
 */
public class PlusEventListener implements ActionListener {

    private Calculator calculator;
    private JTextField intput;
    private JTextField output;

    public PlusEventListener(Calculator calculator, JTextField intput, JTextField output) {
        this.calculator = calculator;
        this.intput = intput;
        this.output = output;
    }

    private int validateInputNumber(String number) {
        int inputNumber;
        try {
            inputNumber = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
        return inputNumber;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.plus(validateInputNumber(this.intput.getText()));
        this.output.setText(String.valueOf(calculator.giveValue()));
    }
}
