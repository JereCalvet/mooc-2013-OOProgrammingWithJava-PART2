package Calculator.ui;

import Calculator.logic.Calculator;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jere
 */
public class ButtonsPanel extends JPanel {

    private Calculator calculator;
    private JTextField intput;
    private JTextField output;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonReset;
    
    public ButtonsPanel(Calculator calculator, JTextField intput, JTextField output) {
        super(new GridLayout(1, 3));
        this.calculator = calculator;
        this.intput = intput;
        this.output = output;
        createButtons();
    }
 
    private void createButtons() {
        this.buttonPlus = new JButton("+");
        add(buttonPlus);
     
        this.buttonMinus = new JButton("-");
        add(buttonMinus);
     
        this.buttonReset = new JButton("Z");
        add(buttonReset);
        
        addListeners();
    }
    
    private void addListeners(){
        PlusEventListener plusButtonClickListener = new PlusEventListener(this.calculator, this.intput, this.output);
        buttonPlus.addActionListener(plusButtonClickListener);
    }
}
