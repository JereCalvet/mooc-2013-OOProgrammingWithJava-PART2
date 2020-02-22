/**
 *
 * @author Jere
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;          //resp prop: sin este field
            
    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;          //resp prop: sin este field       
    } 
    
    @Override
    public String toString(){
        return this.artist+": "+this.title+" ("+this.publishingYear+")";
    }
    
    @Override
    public double weight() {           //respuesta propuesta: aca no declaro el field peso simplemente lo devuelve 
        return this.weight;            // return 0.1;
    }
    
}
