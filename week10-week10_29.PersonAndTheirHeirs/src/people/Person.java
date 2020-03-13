package people;

/**
 *
 * @author Jere
 */
public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append("\n");
        sb.append("  ");
        sb.append(this.address);
        return sb.toString();
    }
}
