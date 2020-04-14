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
    private JTextField input;
    private JTextField output;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonReset;
    
    public ButtonsPanel(Calculator calculator, JTextField input, JTextField output) {
        super(new GridLayout(1, 3));
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        createButtons();
        createListeners();
    }
 
    private void createButtons() {
        buttonPlus = new JButton("+");
        add(buttonPlus);
     
        buttonMinus = new JButton("-");
        add(buttonMinus);
     
        buttonReset = new JButton("Z");
        buttonReset.setEnabled(false);
        add(buttonReset);
    }
    
    private void createListeners(){
        CheckButtonStateEventListener resetButtonStateCheckerListener = new CheckButtonStateEventListener(calculator, buttonReset);
        buttonReset.addActionListener(resetButtonStateCheckerListener);
        buttonPlus.addActionListener(resetButtonStateCheckerListener);
        buttonMinus.addActionListener(resetButtonStateCheckerListener);
        
        PlusEventListener plusButtonClickListener = new PlusEventListener(calculator, input, output);
        buttonPlus.addActionListener(plusButtonClickListener);
        
        MinusEventListener minusButtonClickListener = new MinusEventListener(calculator, input, output);
        buttonMinus.addActionListener(minusButtonClickListener);
    
        ResetEventListener resetButtonClickListener = new ResetEventListener(calculator, input, output);
        buttonReset.addActionListener(resetButtonClickListener);
    }
    
    
}
