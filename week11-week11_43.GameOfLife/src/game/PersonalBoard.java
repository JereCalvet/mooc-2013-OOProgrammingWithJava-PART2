package game;

import gameoflife.GameOfLifeBoard;

/**
 *
 * @author Jere
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    private boolean isInsideBoard(int i, int i1){
        return getWidth() >= i && getHeight() >= i1; 
    }
    
    @Override
    public void initiateRandomCells(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
