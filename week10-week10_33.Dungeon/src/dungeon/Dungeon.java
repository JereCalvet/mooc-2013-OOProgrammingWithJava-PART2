package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class Dungeon {

    private int height;
    private int lenght;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private List<Model> listModels;

    //--contructor
    public Dungeon(int lenght, int height, int vampires, int moves, boolean vampiresMove) {
        this.height = height;
        this.lenght = lenght;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
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

    private void printDungeonState() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.lenght; x++) {
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

    private boolean areThereAnyVampireLeft() {
        for (Model model : this.listModels) {
            if (model.getType() == 'v') {
                return true;
            }
        }
        return false;
    }

    private boolean printGameOver() {

        if (this.moves == 0) {
            System.out.println("YOU LOSE");
            return true;
        }

        if (!this.areThereAnyVampireLeft()) {
            System.out.println("YOU WIN");
            return true;
        }

        return false;
    }

    private void printStatus() {
        System.out.println(this.moves);
        System.out.println();
        printModelsPosition();
        System.out.println();
        printDungeonState();
        System.out.println();
    }
    //--fin print

    //--movimiento
    private boolean isMovementInsideDungeon(int x, int y) {
        return y >= 0 && this.height - 1 >= y && this.lenght - 1 >= x && x >= 0;
    }

    public boolean movementManager(Model modelMoving, int x, int y) {
        int caseModel = 0;
        if (modelMoving.getType() == 'v') {
            caseModel = 1;
        }

        if (!isMovementInsideDungeon(x, y)) {
            return false;
        }

        switch (caseModel) { //0 player - 1 vampire
            case 0:
//                player moviendose, si hay vampiro lo mata
                if (!isPositionEmpty(x, y)) {
                    this.listModels.remove(getModelInPosition(x, y));
                    return true;
                }
                break;
            case 1:
//                vampiro moviendose. si esta ocupado no se mueve //TESTEAR
                return isPositionEmpty(x, y);
        }
        return true;  
    }

    private Model getPlayerFromList() {
        for (Model model : this.listModels) {
            if (model.getType() == 'p') {
                return model;
            }
        }
        return null;
    }

    private void vampireMoves() {
        for (Model vampire : this.listModels) {
            if (vampire.getType() == 'v') {
                int randomMove = new Random().nextInt(4);
                switch (randomMove) {
                    case 0:
                        vampire.goDown(this);
                        break;
                    case 1:
                        vampire.goLeft(this);
                        break;
                    case 2:
                        vampire.goUp(this);
                        break;
                    case 3:
                        vampire.goRight(this);
                        break;
                }
            }
        }
    }

    private void handleCommand(char command) {
        if (command == 'w') {
            Model player = this.getPlayerFromList();
            player.goUp(this);
            if (vampiresMove) {
                vampireMoves();
            }
        }

        if (command == 'a') {
            Model player = this.getPlayerFromList();
            player.goLeft(this);
            if (vampiresMove) {
                vampireMoves();
            }
        }

        if (command == 's') {
            Model player = this.getPlayerFromList();
            player.goDown(this);
            if (vampiresMove) {
                vampireMoves();
            }
        }

        if (command == 'd') {
            Model player = this.getPlayerFromList();
            player.goRight(this);
            if (vampiresMove) {
                vampireMoves();
            }
        }
    }

    public void run() {
        Scanner reader = new Scanner(System.in);
        while (this.moves > 0) {

            printStatus();

            String commands = reader.nextLine();
            for (int i = 0; i < commands.length(); i++) {
                char currentOrder = commands.charAt(i);
                handleCommand(currentOrder);
            }
            
            this.moves--;
            if (printGameOver()) {
                System.out.println();
                break;
            }
        }
    }
}
