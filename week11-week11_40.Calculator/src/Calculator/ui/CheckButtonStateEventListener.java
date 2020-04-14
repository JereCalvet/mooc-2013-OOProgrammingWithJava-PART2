package Calculator.ui;

import Calculator.logic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Jere
 */
public class CheckButtonStateEventListener implements ActionListener {

    private Calculator calculator;
    private JButton resetButton;

    public CheckButtonStateEventListener(Calculator calculator, JButton resetButton) {
        this.calculator = calculator;
        this.resetButton = resetButton;
    }

    private boolean checkResetButtonState() {
        //value 0 button off
        return calculator.giveValue() != 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resetButton.setEnabled(checkResetButtonState());
    }
}
