package wormgame.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wormgame.*;

/**
 *
 * @author Jere
 */
public class Worm extends Piece {

    private List<Piece> body;
    private Direction originalDirection;
    private boolean canGrow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        super(originalX, originalY);
        this.originalDirection = originalDirection;
        this.body = new ArrayList<Piece>();
        this.body.add(this);
    }

    public Direction getDirection() {
        return originalDirection;
    }

    public void setDirection(Direction dir) {
        originalDirection = dir;
    }

    public int getLength() {
        return body.size();
    }

    public List<Piece> getPieces() {
        return body;
    }

      private int[] calculateXAndYValuesForNewPiece(Piece piece, Direction dir) {
        int[] coordenates = new int[2];
        switch (dir) {
            case UP:
                coordenates[0] = piece.getX();
                coordenates[1] = piece.getY() - 1;
                break;
            case DOWN:
                coordenates[0] = piece.getX();
                coordenates[1] = piece.getY() + 1;
                break;
            case LEFT:
                coordenates[0] = piece.getX() - 1;
                coordenates[1] = piece.getY();
                break;
            case RIGHT:
                coordenates[0] = piece.getX() + 1;
                coordenates[1] = piece.getY();
                break;
            default:
                System.out.println("Error: invalid direction.");
                return null;
        }
        return coordenates;
    }
    
    private boolean isMatureSize(){
        return body.size() >= 4;
    }  
      
    public void move() {
        int[] coordenates;
        int lastPiece = body.size() - 1;
        coordenates = calculateXAndYValuesForNewPiece(body.get(lastPiece), originalDirection);
        body.add(new Piece(coordenates[0], coordenates[1]));
        
        if (isMatureSize()) {
            body.remove(body.get(0));
        }
    }

    public void grow() {
        int[] coordenates;
        int lastPiece = body.size() - 1;
        coordenates = calculateXAndYValuesForNewPiece(body.get(lastPiece), originalDirection);
        body.add(new Piece(coordenates[0], coordenates[1]));
    }

    public boolean runsIntoItself() {
        for (Piece piece : body) {
            if (this.runsInto(piece)) {
                return true;
            }
        }
        return false;
    }
}
