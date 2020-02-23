
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Jere
 */
public class ShoppingBasket {

    private Map<String, Purchase> purchaseBasket;

    public ShoppingBasket() {
        this.purchaseBasket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.purchaseBasket.containsKey(product)) {
            Purchase tempPurchase = this.purchaseBasket.get(product);
            tempPurchase.increaseAmount();
            this.purchaseBasket.put(product, tempPurchase);
        } else {
            this.purchaseBasket.put(product, new Purchase(product, price));
        }
        /*
        respuesta propuesta: para ver si el producto ya existe, rellena una variable y dps pregunta si es null
                             si es null, ingresa un producto con 0;
                             despues suma 1 y lo guarda
        funciona igula pero es diferente al mio
         Purchase purchase = this.purchases.get(product);
        if (purchase == null) {
            purchase = new Purchase(product, 0, price);
        }
        purchase.increaseAmount();
 
        this.purchases.put(product, purchase);
        */
    }

    public int price() {
        int price = 0;
        for (Purchase compra : this.purchaseBasket.values()) {
            price += compra.price();
        }
        return price;
    }

    public void print() {
        for (Purchase purchase : this.purchaseBasket.values()) {
            System.out.println(purchase);
        }
    }
}
