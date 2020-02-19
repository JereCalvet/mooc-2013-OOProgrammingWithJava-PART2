import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(sc);
        //ui.start();
        
        Airplane r = new Airplane("G-OWAC", 101);
        System.out.println(r);
        
    }
}
