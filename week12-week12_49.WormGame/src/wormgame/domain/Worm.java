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
        this.body.add(new Piece(originalX, originalY));
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

    private boolean isMatureSize() {
        return body.size() >= 4;
    }

    public Piece getHeadOfTheWorm() {  
        int lastPiece = body.size() - 1;
        return body.get(lastPiece);
    }

    public void move() {
        /*
        Para mover el gusano agrego un pieza adelante en la direccion que deberia ir (esta ultima pieza se convierte en la 
        cabeza del gusano). Posteriormente, si no puede crecer (xq no comio y xq ya esta maduro) se borra la cola del gusano
         */
        int[] coordenates;
        coordenates = calculateXAndYValuesForNewPiece(getHeadOfTheWorm(), originalDirection);
        body.add(new Piece(coordenates[0], coordenates[1]));

        if (!isMatureSize()) {
            grow();
        }

        if (!canGrow) {
            body.remove(body.get(0));
        }

        canGrow = false;
    }

    public void grow() {
        canGrow = true;
    }

    @Override
    public boolean runsInto(Piece piece) {
        for (Piece wormPiece : body) {
            //respuesta propuesta: en la siguiente linea lo hice mejor porque yo utilice el metodo runInto de la clase piece
            //mientras que lo propuesto declaro ese metodo inecesario que hace lo mismo.
            /*
             private boolean same(Piece p1, Piece p2) {
                return p1.getX() == p2.getX() && p1.getY() == p2.getY();
             }
            */
            if (wormPiece.runsInto(piece)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean runsIntoItself() {
        /*
        logica:
        si alguna pieza mete en la cabeza del gusano, quiere decir que la cabeza atraveso el cuerpo del gusano
        */
        
        Piece head = getHeadOfTheWorm();
        body.remove(head);
        if (runsInto(head)) {   //este metodo es el del gusano (arriba)
            body.add(head);
            return true;
        }
        body.add(head);
        return false;
        /*respuesta propuesta: es buena, no se me ocurrio. funciona de ambas formas
        for (int i = 0; i < pieces.size(); i++) {
            for (int j = i + 1; j < pieces.size(); j++) {
                if (same(pieces.get(i), pieces.get(j))) {
                    return true;
                }
            }
        }
 
        return false;
        */
    }
}
