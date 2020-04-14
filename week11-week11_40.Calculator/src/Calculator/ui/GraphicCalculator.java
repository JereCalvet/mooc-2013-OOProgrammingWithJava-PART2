package Calculator.ui;


import Calculator.ui.PlusEventListener;
import Calculator.logic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public GraphicCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 200));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    
    
    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        
        JTextField outputText = new JTextField(String.valueOf(calculator.giveValue()));
        JTextField inputText = new JTextField();
        outputText.setEnabled(false);
        
        container.add(outputText);
        container.add(inputText);
        container.add(new ButtonsPanel(this.calculator, inputText, outputText));
    }

    public JFrame getFrame() {
        return frame;
    }
}
