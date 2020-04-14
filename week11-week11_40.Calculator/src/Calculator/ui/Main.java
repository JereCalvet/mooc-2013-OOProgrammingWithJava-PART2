package Calculator.ui;


import Calculator.logic.PersonalCalculator;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        PersonalCalculator calculatorLogic = new PersonalCalculator();
        SwingUtilities.invokeLater(new GraphicCalculator(calculatorLogic));
    }
}
