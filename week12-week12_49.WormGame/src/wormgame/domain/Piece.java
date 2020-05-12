package wormgame.domain;

/**
 *
 * @author Jere
 */
public class Piece {
    
    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
 
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public boolean runsInto(Piece piece) {
        //respuesta propuesta: usa la variable directamente   return x == piece.x && y == piece.y; 
        return piece.getX() == this.getX() && piece.getY() == this.getY();
    }
    
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
