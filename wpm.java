import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class wpm {
    public static void main(String[] args) {
        String testSentence = "This is a test.";

        //make jframe
        JFrame frame = new JFrame("WPM test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTextField textField = new JTextField();
        textField.setBounds(50,150, 200,30);

        JLabel sentenceJLabel = new JLabel("Type this: " + testSentence);
        sentenceJLabel.setBounds(100, 100, 100, 30);

        frame.add(textField);
        frame.add(sentenceJLabel);

        frame.setSize(400, 400);
        frame.setLayout(null);
        
        //Text event
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = textField.getText();
                if (userInput.equals(testSentence)) {
                    JOptionPane.showMessageDialog(frame, "Correct");
                } else {
                    JOptionPane.showMessageDialog(frame, "Try again");
                }
            }
        }); 
        frame.setVisible(true);
    }
}
