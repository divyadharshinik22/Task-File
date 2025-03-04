package test;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test9 {

	public static void main(String[] args) {
        JFrame frame = new JFrame("Emoji Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        
        String emoji = "\u263A";
        
        JLabel label = new JLabel("Here is a smiley face emoji: " + emoji);
        
        frame.add(label);
        
        frame.setVisible(true);
    }

}
