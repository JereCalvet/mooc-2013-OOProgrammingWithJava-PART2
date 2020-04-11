package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        
        JTextField textToBeCopied = new JTextField();
        JButton copyButton = new JButton("Copy!");
        JLabel copiedText = new JLabel("");
                
        ActionEventListener textCopier = new ActionEventListener(textToBeCopied, copiedText);
        copyButton.addActionListener(textCopier);
        
        container.setLayout(layout);
        
        container.add(textToBeCopied);
        container.add(copyButton);
        container.add(copiedText);
    }
}
