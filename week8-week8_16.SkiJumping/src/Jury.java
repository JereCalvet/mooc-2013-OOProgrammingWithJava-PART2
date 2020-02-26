
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Jury{
    private final static int JUDGES_AMOUNT = 5;
    private List<Judge> listOfJudges;
    private List<Integer> votes;

    public List<Integer> getVotes() {
        if (this.votes == null){
            this.takeDecision();
        }
        return votes;
    }
    
    public Jury() {  
        this.listOfJudges = new ArrayList<Judge>();
    }

    private void addJudges() {
        int i = 0;
        while (i < Jury.JUDGES_AMOUNT) {
            this.listOfJudges.add(new Judge());
            i++;
        }
    }

    private void juryVotes() {
        this.votes = new ArrayList<Integer>();
        for (Judge judge : this.listOfJudges) {
            judge.castVote();
            this.votes.add(judge.getVote());
        }
    }

    public void takeDecision() {
        addJudges();
        juryVotes();
    }
}
