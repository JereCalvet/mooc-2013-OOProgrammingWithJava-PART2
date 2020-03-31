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
    
    public abstract void goUp();
    public abstract void goDown();
    public abstract void goLeft();
    public abstract void goRight();
}
