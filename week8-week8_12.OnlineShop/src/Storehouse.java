
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Jere
 */
public class Storehouse {

    private Map<String, Integer> price = new HashMap<String, Integer>();
    private Map<String, Integer> stock = new HashMap<String, Integer>();

    //metodos
    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (!this.stock.containsKey(product)) {
            return -99;
        }
        return this.price.get(product);
    }

    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.stock.containsKey(product) && this.stock.get(product) > 0) {
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        }
        return false;
        /*respuesta propuesta:
        escribe los if separados
             if (!this.stocks.containsKey(product)) {
            return false;
        }
 
        int saldo = this.stocks.get(product);
        if (saldo == 0) {
            return false;
        }
 
        this.stocks.put(product, saldo - 1);
        return true;
        */
    }

    public Set<String> products() {
        Set<String> products = this.stock.keySet();
        return products; //   resp propeusta. esto no me salia, asi deberia ser: return this.stocks.keySet();
    }
}
