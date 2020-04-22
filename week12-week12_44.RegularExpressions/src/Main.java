
import java.util.Scanner;

public class Main {

    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string) {
//        respuesta propuesta:
//        return string.matches("[äöaeiou]*");
        return string.matches("(ä|ö|a|e|i|o|u)+");
    }

    public static boolean clockTime(String string) {
//        respuesta propuesta:
//        return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");

        if (string.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
            String hour = string.substring(0, 2);
            String min = string.substring(3, 5);
            String sec = string.substring(6, 8);
            if (isValidHour(Integer.parseInt(hour)) && isValidMinSec(Integer.parseInt(min)) && isValidMinSec(Integer.parseInt(sec))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidHour(int hour) {
        return hour >= 0 && hour <= 23;
    }

    public static boolean isValidMinSec(int minsec) {
        return minsec >= 0 && minsec <= 59;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Give me a string: ");
        String string = rd.nextLine();
        if (clockTime(string)) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
    }
}
