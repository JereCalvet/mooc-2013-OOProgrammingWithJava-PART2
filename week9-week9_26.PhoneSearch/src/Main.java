/*
Tema: Un objeto en varias listas, mapa o set al mismo tiempo
https://materiaalit.github.io/2013-oo-programming/part2/week-9/
*/
import UserInterface.TextUserInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String input = "1\n" + "pekka\n" + "040-123456\n" + "2\n" + "jukka\n" + "2\n" + "pekka\n" + "1\n"
//                + "pekka\n" + "09-222333\n" + "2\n" + "pekka\n" + "3\n" + "02-444123\n" + "3\n" + "09-222333\n"
//                + "5\n" + "pekka\n" + "4\n" + "pekka\n" + "ida ekmanintie\n" + "helsinki\n" + "5\n" + "pekka\n"
//                + "4\n"+ "jukka\n"+ "korsontie\n"+ "vantaa\n"+ "5\n" + "jukka\n" + "7\n" + "kk\n" + "7\n" + "vantaa\n"
//                + "7\n" + "seppo\n"+ "6\n" + "jukka\n"+ "5\n" + "jukka\n"+ "x\n";
//        Scanner reader = new Scanner(input);
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader);
        ui.start();
    }
}
