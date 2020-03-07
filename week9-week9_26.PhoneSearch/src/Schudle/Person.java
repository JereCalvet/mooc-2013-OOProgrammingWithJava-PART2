package Schudle;

/**
 *
 * @author Jere
 */
public class Person {
    private String surname;

    @Override
    public int hashCode() {
        return this.surname.hashCode();
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
        if ((this.surname == null) ? (other.surname != null) : !this.surname.equals(other.surname)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return this.surname;
    }
    
    public Person(String surname) {
        this.surname = surname;
    }
 
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}