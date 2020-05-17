/*
Tema: ejercicio
*/
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*String input = "1\n"+"HA-LOL\n"+"42\n"+
                       "1\n"+"G-OWAC\n"+"101\n"+
                       "2\n"+"G-OWAC\n"+"HEL\n"+"BAL\n"+
                       "2\n"+"HA-LOL\n"+"JFK\n"+"BAL\n"+
                       "2\n"+"HA-LOL\n"+"BAL\n"+"HEL\n"+
                       "x\n"+
                       "1\n"+
                       "2\n"+
                       "3\n"+"G-OWAC\n"+
                       "x\n";
        */
        Scanner sc = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(sc);
        //ui.start();
        System.out.println(ui);
    }
}
