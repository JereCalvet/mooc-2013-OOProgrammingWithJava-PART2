package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        PersonalCalculator calculatorLogic = new PersonalCalculator();
        UserInterface ui = new UserInterface(calculatorLogic);
        SwingUtilities.invokeLater(ui);
    }
}
