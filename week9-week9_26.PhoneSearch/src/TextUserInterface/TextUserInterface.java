
package TextUserInterface;

import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class TextUserInterface {

    private Scanner reader;
//    private Tournament skiJumpingTornament;
//
//    public TextUserInterface(Scanner reader) {
//        this.reader = reader;
//        this.skiJumpingTornament = new Tournament();
//    }
//
//    private String askForString(String messageRequest) {
//        System.out.print(messageRequest);
//        return this.reader.nextLine();
//    }
//
//    private int askForInt(String messageRequest) {
//        System.out.print(messageRequest);
//        return Integer.parseInt(this.reader.nextLine());
//    }
//
//    private void playersInput(Scanner reader) {
//        while (true) {
//            String participantName = askForString("  Participant name: ");
//            if (participantName.isEmpty()) {
//                System.out.println();
//                break;
//            } else {
//                this.skiJumpingTornament.addPlayer(new Participant(participantName));
//            }
//        }
//    }
//
//    private void tournamentInput(Scanner reader) {
//        while (true) {
//            String command = askForString("Write \"jump\" to jump; otherwise you quit: ");
//            System.out.println();
//            if (command.equals("quit")) {
//                this.skiJumpingTornament.printTournamentResults();
//                break;
//            } else if (command.equals("jump")) {
//                this.skiJumpingTornament.playRound();
//            }
//        }
//    }
//
//    private static void welcomePanel() {
//        System.out.println("Kumpula ski jumping week");
//        System.out.println();
//        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
//    }
//
//    private static void tournamentPanel() {
//        System.out.println("The tournament begins!");
//        System.out.println("");
//    }
//
//    public void start() {
//        welcomePanel();
//        playersInput(this.reader);
//        tournamentPanel();
//        tournamentInput(this.reader);
//    }
}
