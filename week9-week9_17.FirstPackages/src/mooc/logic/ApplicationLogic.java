package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author Jere
 */
public class ApplicationLogic {
    private UserInterface ok;
    
    public ApplicationLogic(UserInterface ui) {
        this.ok = ui;
    }
    
    public void execute(int howManyTimes){
        for (int i = 0; i < howManyTimes; i++){
            System.out.println("The application logic works");
            this.ok.update();
        }
    }
}
