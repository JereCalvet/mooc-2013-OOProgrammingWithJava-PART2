import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        
        ParticipantList lista = new ParticipantList();
        Participant jere = new Participant("Jere");
        lista.addPlayer(jere);
        Jump salto = new Jump();
        Jury nota = new Jury();
        nota.getVotes();
        System.out.println(nota.getVotes());
        salto.setScore(ListUtil.voteCalculator(nota.getVotes()) + salto.getLength());
        jere.setPoints(jere.getPoints() + salto.getScore());
        jere.addJump(salto);
        System.out.println("lenght: "+salto.getLength());
        System.out.println("");
        System.out.println(lista);
        
        System.out.println("otro salto");
        System.out.println("");
        Jump salto2 = new Jump();
        Jury nota2 = new Jury();
        System.out.println("lenght: "+salto2.getLength());
        System.out.print("judge votes: "+ nota2.getVotes());
        salto2.setScore(ListUtil.voteCalculator(nota2.getVotes()) + salto2.getLength());
        jere.setPoints(jere.getPoints() + salto2.getScore());
        jere.addJump(salto2);
        System.out.println("");
        System.out.println(lista);
        
        while (true){
            int i = 0;
            //for (lista) {
                
            }
   
            }
        }
        
        
        
        
        
        
        /*Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader);
        ui.start();*/
    }
}
