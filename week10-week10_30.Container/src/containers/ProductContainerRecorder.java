package containers;

/**
 *
 * @author Jere
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialValue) {
        super(productName, capacity);
//        respuesta propuesta:
//        en vez de setVolume, utilizo addToContainer(inicialValue), ya que inicialmente los container tienen 0 volumen.
//        si le agrego un peso y tiene capacidad, el container obtiene automaticamente el volumen de lo que ya tenia, mas lo que se esta agregando
        this.setVolume(initialValue);
        this.history = new ContainerHistory();
        this.history.add(initialValue);
    }
    
    @Override
    public void addToTheContainer(double amount){
       super.addToTheContainer(amount);
       this.history.add(this.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        double result = super.takeFromTheContainer(amount);
        this.history.add(this.getVolume());
        return result;
    }
    
    public String history(){
        return this.history.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.history.maxValue());
        System.out.println("Smallest product amount: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
        System.out.println("Greatest change: " + this.history.greatestFluctuation()); 
        System.out.println("Variance: " + this.history.variance());
    }
}
