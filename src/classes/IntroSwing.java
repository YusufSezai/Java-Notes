package classes;

import javax.swing.*;
import java.awt.*;

public class IntroSwing {
    public static void main(String[] args) {
        JFrame window = new JFrame("Hello");
        window.setSize(300,300);


        JLabel text = new JLabel("I am a label", JLabel.CENTER);
        Font font = new Font("Serif", Font.BOLD, 24);
        text.setOpaque(true);
        text.setBackground(Color.BLACK);
        text.setForeground(Color.blue);
        window.add(text);


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
