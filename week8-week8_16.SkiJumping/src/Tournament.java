
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Tournament {

    private List<Participant> players;
    private int round;

    public Tournament() {
        this.players = new ArrayList<Participant>();
        this.round = 0;
    }

    public void addPlayer(Participant player) {
        this.players.add(player);
    }

    public void printPlayers() {
        Collections.sort(this.players);
        for (Participant player : this.players) {
            System.out.println("   " + (this.players.indexOf(player) + 1) + ". " + player);
        }
    }

    public void playRound() {
        this.round++;
        System.out.println("Round " + this.round);
        System.out.println();
        Collections.sort(players);
        System.out.println("Jumping order: ");
        this.printPlayers();
        System.out.println();
        System.out.println("Results of round " + this.round);

        for (Participant player : this.players) {
            System.out.println("   " + player.getName()); //imp nombre
            Jump jump = new Jump();
            player.addJump(jump);
            System.out.println("     length: " + jump.getLength()); //imp length
            Jury takeDecision = new Jury();
            System.out.println("     judge votes: " + takeDecision.getVotes()); //imp votos
            int jumpScore = ListUtil.voteCalculator(takeDecision.getVotes()) + jump.getLength();
            jump.setScore(jumpScore);
            player.setPoints(player.getPoints() + jump.getScore());
        }
        System.out.println();
    }

    public void printTournamentResults() {
        SortAgaisntScoreBoard scoreSorter = new SortAgaisntScoreBoard();
        Collections.sort(players, scoreSorter);
        System.out.println("Thanks!");
        System.out.println();
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        for (Participant player : this.players) {
            System.out.println((this.players.indexOf(player) + 1) + "           " + player);
            System.out.print("            ");
            player.printJumps();
        }
    }
}
