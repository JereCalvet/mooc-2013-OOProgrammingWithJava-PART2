/*
Tema: Equals, hashCode y HashMap
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        List<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");

        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }

        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        /* testing
        VehicleRegister owners = new VehicleRegister();
        
        System.out.println("owners:");
        
        if (owners.add(new RegistrationPlate("FI", "ABC-123"), "Jere")){
            System.out.println("se agrego");
        } else {
            System.out.println("wtf nada");
        }
        if (owners.add(new RegistrationPlate("FI", "ABC-124"), "Jere2")){
            System.out.println("se agrego");
        } else {
            System.out.println("wtf nada");
        }
        if (owners.add(new RegistrationPlate("FI", "ABC-125"), "Jere3")){
            System.out.println("se agrego");
        } else {
            System.out.println("wtf nada");
        }
        if (owners.add(new RegistrationPlate("FI", "ABC-126"), "Jere3")){
            System.out.println("se agrego");
        } else {
            System.out.println("wtf nada");
        }
        
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        if (owners.delete(new RegistrationPlate("FI", "ABC-123"))){
            System.out.println("borro");
        } else {
            System.out.println("no borro");
        }
        System.out.println("comprobando si borro");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println("-------------");
        owners.printRegistrationPlates();
        System.out.println("-------------");
        owners.printOwners();
        */
        // if the hashCode hasn't been overwritten, the owners are not found
    }
}
