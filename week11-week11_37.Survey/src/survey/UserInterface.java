package survey;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
                
        JButton doneButton = new JButton("Done!");
        JRadioButton noReasonRadioButton = new JRadioButton("No reason.");
        JRadioButton cuzItsFunRadioButton = new JRadioButton("Because it is fun!");
        JLabel areYouLabel = new JLabel("Are you?");
        JLabel whyLabel = new JLabel("Why?");
        JCheckBox yesCheckBox = new JCheckBox("Yes!");
        JCheckBox noCheckBox = new JCheckBox("No!");

        ButtonGroup whyButtonGroup = new ButtonGroup();
        whyButtonGroup.add(cuzItsFunRadioButton);
        whyButtonGroup.add(noReasonRadioButton);

        ButtonGroup areYouButtonGroup = new ButtonGroup();
        areYouButtonGroup.add(yesCheckBox);
        areYouButtonGroup.add(noCheckBox);

//        respuesta propuesta:
//        uso nombres como pregunta1, pregunta2, respuestapregun1, respuestapregun2, etc.
//        los button gruop respuestaspregun1

//        JLabel question1 = new JLabel("Are you?");
//        JCheckBox question1AnswerYes = new JCheckBox("Yes!");
//        JCheckBox question1AnswerNo = new JCheckBox("No!");
//        JLabel question2 = new JLabel("Why?");
//        ButtonGroup question2Answers = new ButtonGroup();
//        JRadioButton question2Answer1 = new JRadioButton("No reason.");
//        JRadioButton question2Answer2 = new JRadioButton("Because it is fun!");
// 
//        question2Answers.add(question2Answer1);
//        question2Answers.add(question2Answer2);
//        JLabel question1 = new JLabel("Are you?");
//        JCheckBox question1AnswerYes = new JCheckBox("Yes!");
//        JCheckBox question1AnswerNo = new JCheckBox("No!");
//        JLabel question2 = new JLabel("Why?");
//        ButtonGroup question2Answers = new ButtonGroup();
//        JRadioButton question2Answer1 = new JRadioButton("No reason.");
//        JRadioButton question2Answer2 = new JRadioButton("Because it is fun!");
//
//        question2Answers.add(question2Answer1);
//        question2Answers.add(question2Answer2);
     
        container.setLayout(layout);

        container.add(areYouLabel);
        container.add(yesCheckBox);
        container.add(noCheckBox);
        container.add(whyLabel);
        container.add(noReasonRadioButton);
        container.add(cuzItsFunRadioButton);
        container.add(doneButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
