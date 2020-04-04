package dungeon;

/**
 *
 * @author Jere
 */
public abstract class Model {
    private int posX;
    private int posY;
    private char type;
    
    public Model(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

//    getters
    public int getPosY() {
        return posY;
    }

    public int getPosX() {
        return posX;
    }

    public char getType() {
        return type;
    }
    
//    setters
    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setType(char type) {
        this.type = type;
    } 
    
            
    @Override
    public String toString(){
        String mType;
        if (this.type == 'v' ) {
            mType = "v";
        } else {
            mType = "@";
        }
        return mType + " " + this.getPosX() + " " + this.getPosY();
    }
    
    public void goUp(Dungeon dungeon){
        int futureMove = this.posY - 1;
        if (dungeon.movementManager(this, this.posX, futureMove)) {
            this.posY = futureMove;
        }
    }
    
    public void goDown(Dungeon dungeon){
        int futureMove = this.posY + 1;
        if (dungeon.movementManager(this, this.posX, futureMove)) {
            this.posY = futureMove;
        }
    }
    
    public void goLeft(Dungeon dungeon){
        int futureMove = this.posX - 1;
        if (dungeon.movementManager(this, futureMove, this.posY)) {
            this.posX = futureMove;
        }        
    }
    
    public void goRight(Dungeon dungeon){
        int futureMove = this.posX + 1;
        if (dungeon.movementManager(this, futureMove, this.posY)) {
            this.posX = futureMove;
        }
    }
}
