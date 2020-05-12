package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.game.WormGame;

/**
 *
 * @author Jere
 */
public class DrawingBoard extends JPanel implements Updatable {
    
    private WormGame game;
    private int pieceLength;

    public DrawingBoard(WormGame game, int pieceLength) {
        super.setBackground(Color.GRAY);
        this.game = game;
        this.pieceLength = pieceLength;
    }
        
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        game.draw(graphics, pieceLength);
        /* respuesta propuesta: esta respuesta es mejor, xq pinta el board aca. yo lo hice en WormGame y queda 
        mezclado. 
        graphics.setColor(Color.RED);
        Apple o = game.getApple();
        graphicsg.fillOval(side * o.getX(), side * o.getY(), side, side);
 
        graphicsg.setColor(Color.BLACK);
        for (Piece p : game.getWorm().getPieces()) {
            graphics.fill3DRect(side * p.getX(), side * p.getY(), side, side, true);
        }
        
        */
    }

    @Override
    public void update() {
        repaint();
    }
}
