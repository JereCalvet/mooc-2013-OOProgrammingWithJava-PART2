package game;

import gameoflife.GameOfLifeBoard;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jere
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    private boolean isInsideBoard(int i, int i1) {
        int width = getWidth() - 1;
        int height = getHeight() - 1;

        if (i >= 0 && i1 >= 0) {
            if (i <= width && i1 <= height) {
                return true;
            }
        }
        return false;
    }

    private boolean generateRandomCell(double d) {
        Random number = new Random();
        return number.nextDouble() < d;
    }

    private List<Neighbour> generateNeighbourhood(int i, int i1) {
        List<Neighbour> neighbourhood = new ArrayList<Neighbour>();
        neighbourhood.add(new Neighbour(i - 1, i1 - 1));
        neighbourhood.add(new Neighbour(i, i1 - 1));
        neighbourhood.add(new Neighbour(i + 1, i1 - 1));
        neighbourhood.add(new Neighbour(i - 1, i1));
        neighbourhood.add(new Neighbour(i + 1, i1));
        neighbourhood.add(new Neighbour(i - 1, i1 + 1));
        neighbourhood.add(new Neighbour(i, i1 + 1));
        neighbourhood.add(new Neighbour(i + 1, i1 + 1));
        return neighbourhood;
    }

    @Override
    public void initiateRandomCells(double d) {
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                getBoard()[j][i] = generateRandomCell(d);
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        return isInsideBoard(i, i1) && getBoard()[i][i1] == true;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (isInsideBoard(i, i1)) {
            getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (isInsideBoard(i, i1)) {
            getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int counter = 0;
        for (Neighbour neighbour : generateNeighbourhood(i, i1)) {
            if (isInsideBoard(neighbour.getX(), neighbour.getY()) && isAlive(neighbour.getX(), neighbour.getY())) {
                counter += 1;
            }
        }
        return counter;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
//        if (i2) {
//            
//        }
    }

}
