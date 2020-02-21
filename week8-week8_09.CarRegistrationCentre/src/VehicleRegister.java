
/**
 *
 * @author Jere
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        /*
        resp propuesta: utilizo la siguiente funcion; owners.containsKey(plate). Buen dato
        if (owners.containsKey(plate)) {
            return false;
        }
 
        owners.put(plate, owner);
 
        return true;
        */
        if (this.owners.get(plate) == null) { //if the car had no owner 
            this.owners.put(plate, owner);
            return true;
        }
        return false; //if the car had an owner already
    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        /* resp pro: de nuevo conteins key. 
         if (!owners.containsKey(plate)) {
            return false;
        }
 
        owners.remove(plate);
 
        return true;
        */
        if (this.owners.get(plate) != null) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate key : this.owners.keySet()) {
            System.out.println(key); //+ " " + this.owners.get(key)
        }
    }

    public void printOwners() {
        /* respuesta propuesta: mucho mejor que la mia en terminos de perfomance.
        +importante: no hizo 2 bucles. imprimio en el mismo blucle que filtra
        +usa el bucle directo sobre el value del hashmap: for (String owner : owners.values()) { 
        +declara los ArrayList como lista
        
        List<String> alreadyPrinted = new ArrayList<String>();
 
        for (String owner : owners.values()) {
            if (!alreadyPrinted.contains(owner)) {
                System.out.println(owner);          ->aca imprime, muy inteligente
                alreadyPrinted.add(owner);
            }
        }
        */
        ArrayList<String> ownersList = new ArrayList<String>();
        for (RegistrationPlate key : this.owners.keySet()) {
            String owner = this.owners.get(key);
            if (!ownersList.contains(owner)) {
                ownersList.add(owner);
            }
        }
        for (String owner : ownersList) {
            System.out.println(owner);
        }
    }
}
