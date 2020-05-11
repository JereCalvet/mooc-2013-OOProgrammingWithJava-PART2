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
    }

    @Override
    public void update() {
        repaint();
    }
}
