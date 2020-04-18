package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Jere
 */
public class KeyboardListener implements KeyListener {

    private Figure figure;
    private Component component;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }

    private void figureMovementManager(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -1);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 1);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        figureMovementManager(e);
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
