
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
/*
    respuesta propuesta: airplane es un objeto con String, Integer.
    como lo habia hecho inicialmente
*/
public class Airplane {

    private HashMap<String, Integer> airplane;
    
    public Airplane() {
        this.airplane = new HashMap<String, Integer>();        
    }
    
    public void add(String id, int capacity) {
        this.airplane.put(id, capacity);
    }
    
    public String get(String id) {
        if (this.airplane.get(id) == null){
            return "There is no such a plane";
        }
        return id + " (" + this.airplane.get(id) + " ppl)";
    }
    
    public String printPlane(String id){
        return this.get(id);
    }
    
    public ArrayList<String> airplanesList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String key : this.airplane.keySet()) {
            String airp = key + " (" + this.airplane.get(key) + " ppl)";
            list.add(airp);
        }
        return list;
    }
    
    public void printAirplanesList(){
        for (String airplane : this.airplanesList()){
            System.out.println(airplane);
        }
    }
    
}
