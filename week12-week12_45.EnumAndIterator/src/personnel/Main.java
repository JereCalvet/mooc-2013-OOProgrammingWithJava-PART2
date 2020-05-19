/*
Tema: Enum Type e Iterador
*/
package personnel;

public class Main {

    public static void main(String[] args) {
        Employees a = new Employees();
        a.add(new Person("name1", Education.D));
        a.add(new Person("name2", Education.B));
        a.add(new Person("name3", Education.D));
        a.add(new Person("name4", Education.GRAD));
        
        a.print(Education.D);
    }
}
