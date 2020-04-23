package personnel;

/**
 *
 * @author Jere
 */
public class Person {
    
    private String name;
    private Education educationCat;

    public Person(String name, Education educationCat) {
        this.name = name;
        this.educationCat = educationCat;
    }

    public String getName() {
        return name;
    }

    public Education getEducation() {
        return educationCat;
    }
    
    @Override
    public String toString(){
        return name + ", " + getEducation();
    }
}
