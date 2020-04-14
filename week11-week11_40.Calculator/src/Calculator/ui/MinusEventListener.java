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
    private JTextField input;
    private JTextField output;

    public MinusEventListener(Calculator calculator, JTextField input, JTextField output) {
        this.calculator = calculator;
        this.input = input;
        this.output = output;
    }

    private int validateInputNumber(String number) {
        int inputNumber;
        try {
            inputNumber = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            //throw new NumberFormatException("Error: " + e.getMessage());
            input.setText("");
            System.out.println("Error: No es un numero valido." + e.getMessage());
            return 0;
        }
        return inputNumber;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.minus(validateInputNumber(this.input.getText()));
        this.output.setText(String.valueOf(calculator.giveValue()));
        this.input.setText("");
    }
}
