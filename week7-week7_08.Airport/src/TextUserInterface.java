
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
/*
respuesta propuesta
Diferencias:
+llamo esta clase aeropuerto.
+utilizo 2 hashmap tipo string(cod avion) y objeto. Yo lo pense asi inicialmente
pero me parecio repetitivo el uso del codigo del avion
private Map<String, Airplane> planes = new HashMap<String, Airplane>();
private Map<String, Flight> flights = new HashMap<String, Flight>();
+addAirplane: pide datos, crae objeto y lo pone en el mapa
 Airplane plane = new Airplane(id, capacity);
 planes.put(id, plane);
+addFlight: verifica que el avion exista, pide los codigos, crea el objeto vuelo(pasando el obj avion y lo agrega al mapa)
*/

public class TextUserInterface {

    private Scanner reader;
    private Airplane airplanesHashMap;
    private ArrayList<Flight> flights;

    public TextUserInterface(Scanner reader) {
        this.reader = reader;
        this.airplanesHashMap = new Airplane();
        this.flights = new ArrayList<Flight>();
    }

    public void printFlights() {
        for (Flight flight : this.flights) {
            String plane = this.airplanesHashMap.get(flight.getAirplaneId());
            if (!plane.equals("There is no such a plane")) {
                //     HA-LOL (42 ppl) (HEL-BAL)
                String planePlusCodesFormat = plane + " (" + flight.getAirptDepCode() + "-" + flight.getAirptDestnCode() + ")";
                System.out.println(planePlusCodesFormat);
            }
        }
        System.out.println();
    }

    public String askForString(String messageRequest) {
        System.out.print(messageRequest);
        return this.reader.nextLine();
    }

    public int askForInt(String messageRequest) {
        System.out.print(messageRequest);
        return Integer.parseInt(this.reader.nextLine());
    }

    public void handleCommand(String command, String actionID) {
        if (actionID.equals("AirportMenu")) {
            if (command.equals("1")) { //Add airplane
                this.airplanesHashMap.add(askForString("Give plane ID: "), askForInt("Give plane capacity: "));
                System.out.println();
            } else if (command.equals("2")) {//Add flight
                this.flights.add(new Flight(askForString("Give plane ID: "), askForString("Give departure airport code: "), askForString("Give destination airport code: ")));
                System.out.println();
            } else {
                System.out.println("Unknown command");
                System.out.println();
            }
        }

        if (actionID.equals("FlightServiceMenu")) {
            if (command.equals("1")) { //Print planes
                this.airplanesHashMap.printAirplanesList();
            } else if (command.equals("2")) { //Print flights
                printFlights();
            } else if (command.equals("3")) { //Print plane info
                System.out.println(this.airplanesHashMap.printPlane(askForString("Give plane ID: ")));
                System.out.println();
            } else {
                System.out.println("Unknown command");
                System.out.println();
            }
        }
    }

    public void userInput(Scanner reader, String actionID) {
        while (true) {
            if (actionID.equals("AirportMenu")){
                airportPanel();
            }
            if (actionID.equals("FlightServiceMenu")){
                flightServicePanel();
            }
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
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }

    public static void flightServicePanel() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    }

    public void start() {
        System.out.println("Airport panel ");
        System.out.println("--------------------");
        System.out.println();
        userInput(this.reader, "AirportMenu");
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        userInput(this.reader, "FlightServiceMenu");
    }
}
