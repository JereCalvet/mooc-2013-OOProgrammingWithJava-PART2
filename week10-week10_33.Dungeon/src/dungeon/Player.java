package dungeon;

/**
 *
 * @author Jere
 */
public class Player extends Model {

    public Player() {
        super(0, 0);
        super.setType('p');
    }

    
//    verificar mov: 
//    que este dentro del dungeon
//    si hay un vampiro > matarlo
//            
    @Override
    public void goUp() {
        int yPlus1 = this.getPosY() + 1;
        if (yPlus1 >=  0) {
            this.setPosY(this.getPosY() + 1);
        }
    }

    @Override
    public void goDown() {
        int yMinus1 = this.getPosY() - 1;
        if (yMinus1 >= 0) {
            this.setPosY(yMinus1);
        }
    }

    @Override
    public void goLeft() {
        int xMinus1 = this.getPosX() - 1;
        if (xMinus1 >= 0) {
            this.setPosX(xMinus1);
        }
    }

    @Override
    public void goRight() {
        int xPlus1 = this.getPosX() + 1;
        if (xPlus1 >= 0) {
            this.setPosX(xPlus1);
        }
    }
}
