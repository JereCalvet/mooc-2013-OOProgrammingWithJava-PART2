/*
Tema: Estructuras de datos: Interfaces pre-fabricadas.
    Map
    List
    Set
    HashSet
    Collection

Material: https://materiaalit.github.io/2013-oo-programming/part2/week-8/
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
}
