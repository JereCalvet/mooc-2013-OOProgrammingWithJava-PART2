package dungeon;

/**
 *
 * @author Jere
 */
public class Dungeon {
    private int height;
    private int lenght;
    private int vampires;
    private int moves;
    private boolean vmapiresMove;

    public Dungeon(int lenght, int height, int vampires, int moves, boolean vmapiresMove) {
        if (lenght == height) {
            throw new IllegalArgumentException("Error: Lenght and height have to be different. Its a rectangle");
        }
        this.height = height;
        this.lenght = lenght;
        this.vampires = vampires;
        this.moves = moves;
        this.vmapiresMove = vmapiresMove;
    }
    
    public void run(){
        
    }
}
