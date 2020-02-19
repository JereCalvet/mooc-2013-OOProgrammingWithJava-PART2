
import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class TextUserInterface {

    private Scanner reader;

    public TextUserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void handleCommand(String command, String actionID) {
        if (actionID.equals("AirportMenu")) {
            if (command.equals("1")) { //Add airplane
                //  
            } else if (command.equals("2")) {//Add airplane
                //  
            } else {
                System.out.println("Unknown command");
                System.out.println();
            }
        }
        
        if (actionID.equals("FlightServiceMenu")) {
            if (command.equals("1")) { //Print planes
                //  
            } else if (command.equals("2")) { //Print flights
                //   
            } else if(command.equals("3")){ //Print plane info
                //
            } else {
                System.out.println("Unknown command");
                System.out.println();
            }
        }
    }

    public void userInput(Scanner reader, String actionID) {
        while (true) {
            System.out.print("> ");
            String command = this.reader.nextLine();
            if (command.equals("x")) {
                System.out.println();
                break;
            }
            handleCommand(command, actionID);
        }
    }

    public static void airportPanel() {
        System.out.println("Airport panel ");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }
    
    public static void flightServicePanel(){
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    }

    public void start() {
        airportPanel();
        userInput(this.reader, "AirportMenu");
        flightServicePanel();
        userInput(this.reader, "FlightServiceMenu");
    }
}
