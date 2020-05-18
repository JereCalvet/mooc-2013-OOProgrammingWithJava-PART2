/*
Tema: ejercicio
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*String input = "Jere\n"+"Dino\n"+"Fede\n"+"Pablo\n"+"Juani\n"+"Marcos\n"+"Dufy\n"+"\n"
                       +"jump\n"+"jump\n"+"jump\n"+"quit\n"; 
        Scanner reader = new Scanner(input);*/
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader);
        ui.start();
    }
}
