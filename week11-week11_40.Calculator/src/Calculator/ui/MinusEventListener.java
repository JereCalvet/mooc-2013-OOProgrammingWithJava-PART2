package Calculator.ui;

import Calculator.logic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Jere
 */
public class MinusEventListener implements ActionListener {

    private Calculator calculator;
    private JTextField intput;
    private JTextField output;

    public MinusEventListener(Calculator calculator, JTextField intput, JTextField output) {
        this.calculator = calculator;
        this.intput = intput;
        this.output = output;
    }

    private int validateInputNumber(String number) {
        int inputNumber;
        try {
            inputNumber = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            //throw new NumberFormatException("Error: " + e.getMessage());
            System.out.println("Error: No es un numero valido." + e.getMessage());
            return 0;
        }
        return inputNumber;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.minus(validateInputNumber(this.intput.getText()));
        this.output.setText(String.valueOf(calculator.giveValue()));
    }
}
