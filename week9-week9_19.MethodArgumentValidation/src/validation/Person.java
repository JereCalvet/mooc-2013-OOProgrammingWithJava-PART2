package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40 ) {
            throw new IllegalArgumentException("Error in the name.");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age has to be between 0-120");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
