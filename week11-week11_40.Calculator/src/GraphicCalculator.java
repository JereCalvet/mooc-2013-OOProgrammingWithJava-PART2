
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 300));
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
