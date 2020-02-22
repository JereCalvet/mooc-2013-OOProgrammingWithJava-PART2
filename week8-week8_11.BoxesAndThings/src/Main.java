
/**
 *
 * @author Jere
 */
public class Main {

    public static void main(String[] args) {
        Box cdBox = new Box(1);
        Box bookBox = new Box(9);
        Box boxOfBoxes = new Box(10);
        Box box = new Box(1);
        
        bookBox.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        bookBox.add(new Book("Robert Martin", "Clean Code", 1));
        bookBox.add(new Book("Kent Beck", "Test Driven Development", 4));
        bookBox.add( new Book("J.R.R. Tolkien", "The Hobbit", 2));
        
        cdBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        cdBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        cdBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        
        System.out.println("BOOKbox: "+bookBox);
        System.out.println();
        System.out.println("CDbox: "+cdBox);
        System.out.println();
        
        boxOfBoxes.add(cdBox);
        boxOfBoxes.add(bookBox);
        
        System.out.println("BOXofboxes");
        System.out.println(boxOfBoxes);        
        
        //System.out.println(box);
        //box.add(box);// errrrrrrrrror overFlow
        //System.out.println(box); 
    }
}
