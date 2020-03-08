package TextUserInterface;

import Schudle.Schudle;
import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class TextUserInterface {

    private Scanner reader;
    private Schudle schudle;

    public TextUserInterface(Scanner reader) {
        this.reader = reader;
        this.schudle = new Schudle();
    }

    private String askForString(String messageRequest) {
        System.out.print(messageRequest);
        return this.reader.nextLine();
    }

    private int askForInt(String messageRequest) {
        System.out.print(messageRequest);
        return Integer.parseInt(this.reader.nextLine());
    }

    private static int numberStrToInt(String strNumber){
        int intNum;
        try {
            intNum = Integer.parseInt(strNumber);
        } catch (NumberFormatException e) {
            intNum = 0;
        }
        return intNum;
    }
    
    public void handleCommand(String command) {
        switch (numberStrToInt(command)) {
            case 1:
                this.schudle.addNumber(askForString("whose number: "), askForString("number: "));
                System.out.println();
                break;
            case 2:   
                System.out.println("case 2");
                System.out.println();
                break;
            case 3:   
                System.out.println("case 3");
                System.out.println();
                break;
            case 4:   
                System.out.println("case 4");
                System.out.println();
                break;
            case 5:   
                System.out.println("case 5");
                System.out.println();
                break;
            case 6:   
                System.out.println("case 6");
                System.out.println();
                break;
            case 7:   
                System.out.println("case 7");
                System.out.println();
                break;    
        }
    }
     
    private void userInput(Scanner reader) {
        while (true) {
            String command = this.reader.nextLine();
            if (command.equals("x")) {
                System.out.println();
                break;
            }
            handleCommand(command);
        }
    }

    private static void schudleMenuPanel() {
        System.out.println("phone search");
        System.out.println("avaliable operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println();
    }

    public void start() {
        schudleMenuPanel();
        userInput(this.reader);
    }
}
