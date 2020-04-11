package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jere
 */
public class ActionEventListener implements ActionListener{
    private JTextField textOrigin;
    private JLabel textDestination;

    public ActionEventListener(JTextField textOrigin, JLabel textDestination) {
        this.textOrigin = textOrigin;
        this.textDestination = textDestination;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.textDestination.setText(this.textOrigin.getText());
        this.textOrigin.setText("");
    }
}
