/**
 *
 * @author Jere
 */
public class Purchase {
    private String product;
    private int amount;
    private int initPrice;
    
    public Purchase(String product, int amount, int initPrice) {
        this.product = product;
        this.amount = amount;
        this.initPrice = initPrice;
    }

    public Purchase(String product, int initPrice) {
        this.product = product;
        this.amount = 1;
        this.initPrice = initPrice;
    }
    
    public int price(){
        return this.amount * this.initPrice;
    }
    
    public void increaseAmount(){
        this.amount++;
    }
    
    @Override
    public String toString(){
        return this.product + ": " + this.amount;
    }
    
}
