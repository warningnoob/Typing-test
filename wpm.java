import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class wpm {
    private static boolean timerStarted = false; //some bs 
    private static long startTime;
    public static void main(String[] args) {

        //list of my words
        List<String> words = new ArrayList<>();
        words.add("the");
        words.add("sentence");
        words.add("watch");
        words.add("into");
        words.add("through");
        words.add("nation");
        words.add("without");
        
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

        //start time when typing
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (!timerStarted) {
                    timerStarted = true;
                    startTime = System.currentTimeMillis();
                    System.out.println("time start");
                }
            }
        });
        

        JLabel sentenceJLabel = new JLabel("Type this: " + testSentence);
        //find a way to dynamicaly change the length
        sentenceJLabel.setBounds(100, 100, 500, 30);

        //frame things
        frame.add(textField);
        frame.add(sentenceJLabel);
        frame.setSize(400, 400);
        frame.setLayout(null);
        
        //Text event when enter is pressed
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = textField.getText();
                if (userInput.equals(testSentence)) {
                    long elapsedTime = System.currentTimeMillis() - startTime;
                    JOptionPane.showMessageDialog(frame, "Correct! Time taken: " + elapsedTime / 1000.0 + " seconds");
                } else {
                    JOptionPane.showMessageDialog(frame, "Try again");
                    textField.setText("");
                }
            }
        }); 
        frame.setVisible(true);
    }
}
