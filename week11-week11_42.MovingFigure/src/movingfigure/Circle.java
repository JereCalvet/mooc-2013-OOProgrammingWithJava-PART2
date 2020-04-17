package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Jere
 */
public class Circle extends Figure {
    private int diameter;

    public Circle(int diameter, int x, int y) {
        super(x, y);
        this.diameter = diameter;
    }
    
    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval(getX(), getY(), 10, 10);
    }
    
}
