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

    //--contructor
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
        fillDungeon();
    }

    //-- getter
    public int getHeight() {
        return height;
    }

    public int getLenght() {
        return lenght;
    }

    //constructor helper
    private void fillDungeon() {
        this.listModels.add(new Player());
        for (int i = 0; i < this.vampires; i++) {
            this.listModels.add(new Vampire(this));
        }
    }
    
    //--position info
    private Model getModelInPosition(int x, int y) {
        for (Model model : this.listModels) {
            if (model.getPosX() == x && model.getPosY() == y) {
                return model;
            }
        }
        return null;
    }

    public boolean isPositionEmpty(int x, int y) {
        for (Model model : this.listModels) {
            if (model.getPosX() == x && model.getPosY() == y) {
                return false;
            }
        }
        return true;
    }
    //--fin position info
    
    //-- print methods
    private void printModelsPosition() {
        for (Model model : this.listModels) {
            System.out.println(model);
        }
    }

    private void printGameState() {
        for (int y = 0; y <= this.height; y++) {
            for (int x = 0; x <= this.lenght; x++) {
                if (isPositionEmpty(x, y)) {
                    System.out.print(".");
                } else {
                    Model modelTemp = getModelInPosition(x, y);
                    if (modelTemp.getType() == 'v') {
                        System.out.print("v");
                    } else {
                        System.out.print("@");
                    }
                }
            }
            System.out.println("");
        }
    }

    private void printStatus() {
        System.out.println(this.moves);
        System.out.println();
        printModelsPosition();
        System.out.println();
        printGameState();
    }
    //--fin print

    //--movimiento
     private boolean isMovementInsideDungeon(int x, int y) {
        return y >= 0 && this.height >= y && this.lenght >= x && x >= 0;
    }

    public void movementManager(Model modelMoving, int x, int y) {
        int caseModel = 0; 
        if (modelMoving.getType() == 'v') {
            caseModel = 1;
        }

        if (!isMovementInsideDungeon(x, y)) {
            return;
        }
        
        if (isPositionEmpty(x, y)) {
            return;
        }
        
        switch (caseModel) { //0 player - 1 vampire
            case 0:
//                player moviendose hacia un vampiro:
//                borrar el vampiro
//                y ocupar ese lugar        
                break;
            case 1:
//                vampiro moviendose hacia otro vampiro
//                cancelar movimiento
                break;
        }

    }

    public void run() {
    }
}
