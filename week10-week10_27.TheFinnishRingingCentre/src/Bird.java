
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;
    
    public Bird(String name, String latinName, int ringingYear) {
        if (latinName.isEmpty() || ringingYear == 0 ) {
            throw new IllegalArgumentException("Error in year or latin name");
        }
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }

    public void observe(Bird bird, String place){
        
    }
    
    @Override
    public int hashCode() {
        return latinName.hashCode();
        /*
        resp propuesta: si no hay nombre el hash es el año
          if (this.latinName == null) {
            return this.ringingYear;
        }
 
        return this.latinName.hashCode() + this.ringingYear;
        */
    }
    
    @Override
    public boolean equals(Object obj) {
        /*
        resp propuesta
        // Check whether object o's real type is Bird, if not, return false
         if (!(o instanceof Bird)) {
            return false;
        }
 
        // Now we know that o is a bird, let's convert its type
        Bird bird = (Bird) o;
 
        if (this.latinName == null) {
            return false;
        }
 
        return this.latinName.equals(bird.latinName) && 
               this.ringingYear == bird.ringingYear;
        */
        if (obj == null) {
            return false;
        }
        
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        Bird compared = (Bird) obj;
        
//        a latin =  año dife   f      b  latin dife año igual  f
//        c latin =  año igual t       d   latin dife año dife  f
//        

        if (!this.latinName.equals(compared.getLatinName())) {
            if ( this.ringingYear == compared.getRingingYear()) {
                return false;
            } else {
                return false;
            }
        } // b d
        
        if (this.latinName.equals(compared.getLatinName())) {
            if ( this.ringingYear != compared.getRingingYear()) {
                return false;
            }
        } //a
          
        return true;
    }

    
    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


