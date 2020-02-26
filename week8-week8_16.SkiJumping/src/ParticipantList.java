
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author Jere
 */
public class ParticipantList {

    private List<Participant> players;

    public ParticipantList() {
        this.players = new ArrayList<Participant>();
    }

    public void addPlayer(Participant player){
        this.players.add(player);
    }
    
    @Override
    public String toString(){
        Collections.sort(players);
        String listado = "";
        for (int i = 0; i < this.players.size(); i++){
            listado += (i+1)+". "+ this.players.get(i) + "\n";
        }
        return listado;
    }
}
