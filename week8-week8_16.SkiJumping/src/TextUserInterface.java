
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class TextUserInterface {

    private Scanner reader;
    private ParticipantList players;

    public TextUserInterface(Scanner reader) {
        this.reader = reader;
        this.players = new ParticipantList();
    }

    public String askForString(String messageRequest) {
        System.out.print(messageRequest);
        return this.reader.nextLine();
    }

    public int askForInt(String messageRequest) {
        System.out.print(messageRequest);
        return Integer.parseInt(this.reader.nextLine());
    }

    public void playersInput(Scanner reader) {
        while (true) {
            String participantName = askForString("  Participant name: ");
            if (participantName.isEmpty()) {
                System.out.println();
                break;
            } else {
                this.players.addPlayer(new Participant(participantName));
            }
        }
    }

    public void tournamentInput(Scanner reader) {
        while (true) {
            String command = askForString("Write \"jump\" to jump; otherwise you quit: ");
            System.out.println();

            if (command.equals("quit")) {
                System.out.println();
                break;
            } else if (command.equals("jump")) {
                System.out.println("jump method");
            }
        }
    }

    public static void welcomePanel() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    }

    public static void tournamentPanel() {
        System.out.println("The tournament begins!");
        System.out.println("");
    }

    public void start() {
        welcomePanel();
        playersInput(this.reader);
        tournamentPanel();
        tournamentInput(this.reader);
    }
}
