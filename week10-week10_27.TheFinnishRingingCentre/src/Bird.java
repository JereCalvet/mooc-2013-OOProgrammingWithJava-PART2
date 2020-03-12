
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

    @Override
    public int hashCode() {
        return latinName.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
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


