package dungeon;

import java.util.ArrayList;
import java.util.List;

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
    private List<Model> listModels;

    public Dungeon(int lenght, int height, int vampires, int moves, boolean vmapiresMove) {
        if (lenght == height) {
            throw new IllegalArgumentException("Error: Lenght and height have to be different. Its a rectangle");
        }
        this.height = height;
        this.lenght = lenght;
        this.vampires = vampires;
        this.moves = moves;
        this.vmapiresMove = vmapiresMove;
        this.listModels = new ArrayList<Model>();
        fillDungOfVampires();
    }

    public int getHeight() {
        return height;
    }

    public int getLenght() {
        return lenght;
    }

    private void fillDungOfVampires(){
        for (int i = 0; i < this.vampires; i++) {
            this.listModels.add(new Vampire());
        }
    }
    
    public boolean isPositionEmpty(int x, int y){
        for (Model model : this.listModels) {
            if (model.getPosX() == x && model.getPosY() == y) {
                return false;
            }
        }
        return true;
    } 
    
    public void run(){
    }
}
