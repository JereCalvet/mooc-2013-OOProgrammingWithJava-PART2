package containers;

/**
 *
 * @author Jere
 */
public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String newProductName) {
        this.productName = newProductName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString(); 
    }
}
