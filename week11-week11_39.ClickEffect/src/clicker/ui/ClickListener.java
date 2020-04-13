package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Jere
 */
public class ClickListener implements ActionListener{
    private Calculator calculatorLogic;
    private JLabel counterDestination;

    public ClickListener(Calculator calculatorLogic, JLabel counterDestination) {
        this.calculatorLogic = calculatorLogic;
        this.counterDestination = counterDestination;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculatorLogic.increase();
        this.counterDestination.setText(String.valueOf(this.calculatorLogic.giveValue())); //convert intToStr
    }    
}
