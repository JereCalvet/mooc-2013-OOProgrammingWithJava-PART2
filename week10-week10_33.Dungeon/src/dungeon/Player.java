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

    @Override
    public void goUp() {
        this.setPosY(this.getPosY() + 1);
    }

    @Override
    public void goDown() {
        this.setPosY(this.getPosY() - 1);
    }

    @Override
    public void goLeft() {
        this.setPosX(this.getPosX() - 1);
    }

    @Override
    public void goRight() {
        this.setPosX(this.getPosX() + 1);
    }
}
