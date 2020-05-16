/*
Tema: Visibilidad: private
*/
public class Main {
    public static void main(String[] args) {
        // Test your program here
        String a = "My dog is called donatto. He is an amazing dog.";
        Changer changerList = new Changer();
        changerList.addChange(new Change('o', 'O'));
        changerList.addChange(new Change('a', 'A'));
        changerList.addChange(new Change('e', 'E'));
        changerList.addChange(new Change('i', 'I'));
        changerList.addChange(new Change('u', 'U'));
        System.out.println(a);
        System.out.println(changerList.change(a));
    }
}
