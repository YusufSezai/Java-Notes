package classes;

import javax.swing.*;

public class IntroSwing02 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Hello");
        window.setSize(300,300);

        ImageIcon kid = new ImageIcon("C:\\Users\\PC\\Desktop\\photogram\\kid1.png");
        JLabel image = new JLabel(kid);
        window.add(image);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

}
