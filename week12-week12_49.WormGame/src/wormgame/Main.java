package wormgame;

import javax.swing.SwingUtilities;
import wormgame.domain.*;
import wormgame.gui.UserInterface;
import wormgame.game.WormGame;

public class Main {

    public static void main(String[] args) {
        WormGame game = new WormGame(6, 6);
        System.out.println(game.getApple());
        System.out.println(game.getWorm());
    }
}
