package wormgame.domain;

import java.util.ArrayList;
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

    private void handlePieceMovement(Piece piece, Direction dir) {
        switch (dir) {
            case UP:
                piece.setX(piece.getX() - 1);
                break;
            case DOWN:
                piece.setY(piece.getY() - 1);
                break;
            case LEFT:
                piece.setY(piece.getY() + 1);
                break;
            case RIGHT:
                piece.setX(piece.getX() + 1);
                break;
            default:
                System.out.println("Error: invalid direction.");
                break;
        }
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

    public void move() {
//        if (getLength() < 3 || canGrow) {
//            grow();
//        }
        for (Piece piece : body) {
            handlePieceMovement(piece, originalDirection);
        }
    }

    public void grow() {
        //agregar una pieza en la posicion ?de alado?
        body.add(new Piece(0, 0));
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
