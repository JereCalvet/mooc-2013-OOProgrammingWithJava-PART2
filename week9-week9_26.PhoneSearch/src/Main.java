
import Schudle.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Phone cel = new Phone();
        cel.addNumber("calvet", "15457635");
        cel.addNumber("calvet", "15451236");
        cel.addNumber("Aguston", "154999");
        
        cel.printNumbers("calvet");
        cel.printNumbers("Aguston");
        cel.printNumbers("jere");
  
    }
}
