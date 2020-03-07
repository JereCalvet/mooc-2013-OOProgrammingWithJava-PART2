
import Schudle.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Phone cel = new Phone();
        cel.addNumber("calvet", "15457635");
        cel.addNumber("calvet", "23254364");
        cel.addNumber("abuela", "33453453");
        cel.addNumber("donatto", "4345345");
        cel.addNumber("camila", "52342342");
        cel.addNumber("calvet", "62343244");
        
        Address dir = new Address();
        dir.addAddress("calvet", "finocchio 2079", "rio grande");
        dir.addAddress("donatto", "san martin", "ush");
        dir.addAddress("calvet", "finocchio 234", "rio grnade");
        System.out.println(dir);
        dir.deletePersonalInfo("calvet");
        System.out.println(dir);
    }
}
