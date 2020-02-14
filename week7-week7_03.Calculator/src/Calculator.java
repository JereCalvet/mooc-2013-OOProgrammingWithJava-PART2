import java.util.Arrays;
/**
 *
 * @author Jere
 */


public class Calculator {
    private Reader sc;
    private int calculationCounter;
    
    public Calculator(){
        this.sc = new Reader();
        this.calculationCounter = 0;
    }
    
    private int[] numbersInput(){
        /*
        respuesta propuesta: dentro de este metodo suma el contador para no repetirlo abajo.
        detalle minimo, buena idea
        calculationCounter++;
        */
                
        int[] input = new int[2]; 
        
        System.out.print("Value1: ");
        input[0] = this.sc.readInteger();
        System.out.print("Value2: ");
        input[1] = this.sc.readInteger();
        
        return input;
    }
    
    private void sum(){
        int[] input = numbersInput();
        System.out.println("sum of the values: "+(input[0]+input[1]));
        calculationCounter++;       //esto podia ir en el metodo
        System.out.println();
    }
    
    private void difference(){
        int[] input = numbersInput();
        System.out.println("difference of the values: "+(input[0]-input[1]));
        calculationCounter++;       //esto podia ir en el metodo
        System.out.println();
    }
    
    private void product(){
        int[] input = numbersInput();
        System.out.println("product of the values: "+(input[0]*input[1]));
        calculationCounter++;      //esto podia ir en el metodo
        System.out.println();
    }
    
    private void statistics(){
        System.out.println("Calculations done "+this.calculationCounter);
        System.out.println();
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = this.sc.readString();
            
            if (command.equals("end")){
                break;
            }
            if (command.equals("sum")){
                sum();
            } else if (command.equals("difference")){
                difference();
            } else if (command.equals("product")){
                product();
            }    
        }
        statistics();
    }
}
