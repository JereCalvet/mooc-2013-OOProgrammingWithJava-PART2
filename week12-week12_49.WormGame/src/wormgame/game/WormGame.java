package wormgame.game;

import java.awt.Color;
import java.awt.Graphics;
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

    //contructor
    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        this.worm = new Worm((width / 2), (height / 2), Direction.DOWN);

        this.apple = constructApple(width, height);
    }

    //getter - setter    
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

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    //metodos
    @Override
    public void actionPerformed(ActionEvent ae) {
        worm.move();

        if (worm.runsInto(apple)) {
            worm.grow();
            setApple(constructApple(width, height));
        }

        continues();

        if (continues) {
            updatable.update();
        }

        setDelay(1000 / worm.getLength());
    }

    private Apple constructApple(int width, int height) {
        int[] appleCoords = checkAppleNotInWormCoords(width, height);
        Apple appleObj = new Apple(appleCoords[0], appleCoords[1]);
        return appleObj;
    }

    private int[] checkAppleNotInWormCoords(int width, int height) {
        /*
        aca intentado usar recursion, la complique demas. yo utilice 3 metodos meh
        respuesta propuesta:
         while (true) {
            Random random = new Random();
            apple = new Apple(random.nextInt(width), random.nextInt(height));
            if (!worm.runsInto(apple)) { (si alguna parte del cupo NO esta en la pos de manzana
                break;
            }
        }
        */
        
        int genWidth = genRandomCoor(width);
        int genHeigh = genRandomCoor(height);
        if (genWidth == worm.getX() && genHeigh == worm.getY()) {
            return checkAppleNotInWormCoords(width, height);
        } else {
            int[] appleCoor = new int[]{genWidth, genHeigh};
            return appleCoor;
        }
    }

    private int genRandomCoor(int maxValue) {
        Random randomNumGen = new Random();
        return randomNumGen.nextInt(maxValue);
    }

    private boolean isMovingOutsideTheBoard() {
        return worm.getHeadOfTheWorm().getX() >= width || worm.getHeadOfTheWorm().getY() >= height || worm.getHeadOfTheWorm().getX() <= 0 || worm.getHeadOfTheWorm().getY() <= 0;
    }

    public boolean continues() {
        if (worm.runsIntoItself()) {
            return continues = false;
        }

        if (isMovingOutsideTheBoard()) {
            return continues = false;
        }

        return continues = true;
    }

    public void draw(Graphics graphics, int pieceLength) {
        graphics.setColor(Color.RED);
        graphics.fillOval(apple.getX() * pieceLength, apple.getY() * pieceLength, pieceLength, pieceLength);

        graphics.setColor(Color.BLACK);
        for (Piece piece : worm.getPieces()) {
            graphics.fill3DRect(piece.getX() * pieceLength, piece.getY() * pieceLength, pieceLength, pieceLength, true);
        }
    }
}
