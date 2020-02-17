import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary Dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.Dictionary = dictionary;
    }   
    
    public void add(){
        System.out.print("In Finnish: ");
        String word = this.reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        System.out.println();
        this.Dictionary.add(word, translation);
    }
    
    public void translate(){
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        /*
        resp propuesta: le puso un mensaje de error 
        
        if (this.dict.translate(word) == null) {
            System.out.println("Unknown word!");
        } else {
            System.out.println("Translation: " + this.dict.translate(word));
        }
        */
        System.out.println("Translation: "+this.Dictionary.translate(word));
        System.out.println();
    }
    
    public void start(){
        System.out.println("Statement: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the user interface");
        System.out.println();
        
        
        while (true){
            System.out.print("Statement: ");
            String command = this.reader.nextLine();
            if (command.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")){
                add();
            } else if (command.equals("translate")){
                translate();
            } else {
                System.out.println("Unknown statement");
                System.out.println();
            }
            /* aca utilizo un metodo a parte despues del quit: meh 
                handleStatement(command);
        
            
        private void handleStatement(String statement) {
        if (statement.equals("add")) {
            add();
        } else if (statement.equals("translate")) {
            translate();
        } else {
            System.out.println("Unknown statement.");
        }
    }
            */
        }
        
    }
    
}
