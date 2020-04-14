package Calculator.ui;

import Calculator.logic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Jere
 */
public class ResetEventListener implements ActionListener {

    private Calculator calculator;
    private JTextField input;
    private JTextField output;

    public ResetEventListener(Calculator calculator, JTextField input, JTextField output) {
        this.calculator = calculator;
        this.output = output;
        this.input = input;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.reset();
        this.output.setText(String.valueOf(calculator.giveValue()));
        this.input.setText("");
    }
}
