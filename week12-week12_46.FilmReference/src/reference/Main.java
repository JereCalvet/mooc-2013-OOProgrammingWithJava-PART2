package reference;

import reference.domain.Person;


public class Main {

    public static void main(String[] args) {
        Person a = new Person("jere");
        Person b = a;
        System.out.println(b.equals(a));
    }
}
