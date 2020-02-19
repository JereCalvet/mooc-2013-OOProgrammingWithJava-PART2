
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");
         
        /* respuesta propuesta: interesante forma de hacer correr el programa automaticamente
        buen dato
        
         String input = "translate\n" + "apina\n" + 
                "translate\n" + "juusto\n" + 
                "add\n" + "juusto\n" + "cheese\n" + 
                "translate\n" + "juusto\n" + 
                "quit\n";
 
        Scanner reader = new Scanner(input);
        */
        
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
        
    }
}
