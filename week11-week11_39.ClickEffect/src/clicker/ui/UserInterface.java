package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculatorLogic;

    public UserInterface(Calculator calculatorLogic) {
        this.calculatorLogic = calculatorLogic;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        
        JLabel destinationLabel = new JLabel(String.valueOf(calculatorLogic.giveValue()));
        JButton clickCounterButton = new JButton("Click!");
        container.add(destinationLabel, BorderLayout.NORTH);
        container.add(clickCounterButton, BorderLayout.SOUTH);
        
        ClickListener eventButtonClick = new ClickListener(calculatorLogic, destinationLabel);
        clickCounterButton.addActionListener(eventButtonClick);
    }

    public JFrame getFrame() {
        return frame;
    }
}
