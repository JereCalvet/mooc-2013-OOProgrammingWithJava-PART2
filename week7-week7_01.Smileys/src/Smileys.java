/*
Tema: Visibilidad: private
*/
public class Smileys {

    private static boolean lengthIsOdd(String characterString){
        return characterString.length() % 2 == 1;
    }
    
    private static void printTopAndBot(int amountOfFaces){
         for (int i = 0; i < amountOfFaces; i++){
            System.out.print(":)");
        }
        System.out.println();
    }
    
    private static void printWithSmileys(String characterString) {
        /* respuesta propuesta: esta similar. El propuesto tiene un metodo mas para el string del medio 
        
    private static String createTheStringInTheMiddle(String characterString) {
        String returnCharacterString = " " + characterString + " ";
        if (characterString.length() % 2 == 1) {
            return returnCharacterString + " ";
        }
 
        return returnCharacterString;
    }
        */
        if (lengthIsOdd(characterString)) {
            characterString = characterString + " ";
        }
        
        int amountOfFacesNeeded = characterString.length()+ 6; //6 size of middle faces + spaces
        amountOfFacesNeeded = amountOfFacesNeeded/2;
        
        printTopAndBot(amountOfFacesNeeded);
        System.out.println(":) "+characterString+" :)");
        printTopAndBot(amountOfFacesNeeded);
    }

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Met");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

}
