import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class wpm {
    public static void main(String[] args) {

        //list of my words
        List<String> words = new ArrayList<>();
        words.add("the");
        words.add("sentence");
        words.add("watch");
        words.add("into");
        words.add("through");
        words.add("nation");

        //random generator
        Random rand = new Random();
        int randInt1 = rand.nextInt(words.size());
        int randInt2 = rand.nextInt(words.size());
        int randInt3 = rand.nextInt(words.size());


        String testSentence = words.get(randInt1) + " " + words.get(randInt2) + " " + words.get(randInt3);

        //make jframe
        JFrame frame = new JFrame("WPM test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setBounds(50,150, 200,30);

        JLabel sentenceJLabel = new JLabel("Type this: " + testSentence);
        //find a way to dynamicaly change the length
        sentenceJLabel.setBounds(100, 100, 200, 30);

        //frame things
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
