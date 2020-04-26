package reference.domain;

/**
 *
 * @author Jere
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;

//        esto hace el ? operador: if condition ? true statement : false statement;       
//        if (this.name = null) {
//            if (other.name != null) {
//                return false;
//            }
//        } else {
//            if (!this.name.equals(other.name)) {
//                return false;
//            }
//        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
