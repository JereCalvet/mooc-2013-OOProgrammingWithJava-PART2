
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getRegCode() {
        return regCode;
    }
    
    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public int hashCode() {
        /* Respuesta propuesta: otra vez no verifico nulls.     
        // also in this method we trust that register code is in the correct format
        // and that country and regCode are not null
 
        return this.country.hashCode() + this.regCode.hashCode();
        */
        int hash = 7;
        if (this.country == null){
            return hash;
        }
        if (this.regCode == null){
            return hash;
        }
  
        hash = this.regCode.hashCode() + this.country.hashCode();
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        /*  respuesta propuesta. bleh no verifico nulls
          RegistrationPlate comparable = (RegistrationPlate) o;
 
        // it might be good to check that this.regCode and this.country are not null
        // however, let's assume that register codes are always in correct format and
        // country has been initialized with some value
        // it would be best to check register code's and country's values in the constructor, and
        // we will be doing this as soon as we learn more of Java's "exceptions"
 
        return regCode.equals(comparable.regCode) && this.country.equals(comparable.country);
        */
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistrationPlate other = (RegistrationPlate) obj;
        
        if ( this.country == null || !this.country.equals(other.getCountry())){
            return false;
        }
        
        if ( this.regCode == null || !this.regCode.equals(other.getRegCode())){
            return false;
        }
        
        return true;
    }   
}
