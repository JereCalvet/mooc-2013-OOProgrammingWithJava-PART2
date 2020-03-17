
import java.util.ArrayList;
import java.util.List;
import people.*;

public class Main {

    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Person olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);

        Object liisa = new Student("Liisa", "Väinö Auerin Street 20 00500 Helsinki");
        System.out.println(liisa);
    }
}
