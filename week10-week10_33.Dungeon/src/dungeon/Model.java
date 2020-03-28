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
}
