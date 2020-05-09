package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.*;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Apple apple;
    private Worm worm;
    
    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        this.worm = new Worm((width/2), (height/2), Direction.DOWN);
        
        this.apple = constructApple(width, height);
    }
    
    private Apple constructApple(int width, int height) {
        int[] appleCoords = checkAppleNotInWormCoords(width, height);
        Apple appleObj = new Apple(appleCoords[0], appleCoords[1]);
        return appleObj;
    }
    
    private int[] checkAppleNotInWormCoords(int width, int height) {
        int genWidth = genRandomCoorBetweenOneAnd(width);
        int genHeigh = genRandomCoorBetweenOneAnd(height);
        if (genWidth == worm.getX() && genHeigh == worm.getY()) {        
            return checkAppleNotInWormCoords(width, height);
        } else {
            int[] appleCoor = new int[] {genWidth, genHeigh};
            return appleCoor;
        }
    }
    
    private int genRandomCoorBetweenOneAnd(int maxValue){
        Random randomNumGen = new Random();
        return randomNumGen.nextInt(maxValue);
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Worm getWorm() {
        return worm;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Apple getApple() {
        return apple;
    }
}
