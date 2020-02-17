
public class Main {

    public static void addSuitcasesFullOfBricks(Container pContainer) {
        int i = 1;
        while (i < 101) {
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(new Thing("brick", i));
            pContainer.addSuitcase(suitcase);
            i++;
        }
    }

    public static void main(String[] args) {
        // use this main class to test your program!
        Thing thing = new Thing("brick", 1);
        Thing thing2 = new Thing("brick2", 2);
        Thing thing3 = new Thing("brick3", 3);
        
        Suitcase suitcase = new Suitcase(100);
        suitcase.addThing(thing3);
        suitcase.addThing(thing2);
        suitcase.addThing(thing);
        System.out.println(suitcase.heaviestThing());
    }

}
