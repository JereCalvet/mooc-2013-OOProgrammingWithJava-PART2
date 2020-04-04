package dungeon;

import java.util.Random;

/**
 *
 * @author Jere
 */
public class Vampire extends Model {

    public Vampire(Dungeon dungeon) {
        super(-1, -1);
        this.randomizeVampirePosition(dungeon);
        super.setType('v');
    }

    private void randomizeVampirePosition(Dungeon dungeon){
        int tempX = 0;
        int tempY = 0;
        while (!dungeon.isPositionEmpty(tempX, tempY)){
            tempX = genRandomXInitialPos(dungeon.getLenght());
            tempY = genRandomYInitialPos(dungeon.getHeight());
        }
        this.setPosX(tempX);
        this.setPosY(tempY);
    }
    
    private int genRandomXInitialPos(int maxX){
        return new Random().nextInt(maxX+1);
    }

    private int genRandomYInitialPos(int maxY){
        return new Random().nextInt(maxY+1);
    }
}
