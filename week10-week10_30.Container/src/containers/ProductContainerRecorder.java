package containers;

/**
 *
 * @author Jere
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialValue) {
        super(productName, capacity);
        setVolume(initialValue);
        this.history = new ContainerHistory();
        this.history.add(initialValue);
    }
    
    public String history(){
        return this.history.toString();
    }
}
