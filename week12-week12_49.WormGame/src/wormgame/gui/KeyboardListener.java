package wormgame.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import wormgame.Direction;
import wormgame.domain.Worm;

/**
 *
 * @author Jere
 */
public class KeyboardListener implements KeyListener {

    private Worm worm;

    public KeyboardListener(Worm worm) {
        this.worm = worm;
    }

    private void wormMovementManager(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            worm.setDirection(Direction.LEFT);
            worm.move();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            worm.setDirection(Direction.RIGHT);
            worm.move();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            worm.setDirection(Direction.UP);
            worm.move();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            worm.setDirection(Direction.DOWN);
            worm.move();
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        wormMovementManager(e);
   
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
