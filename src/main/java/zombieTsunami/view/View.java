package main.java.zombieTsunami.view;

import javax.swing.JFrame;

public class View {
    
    public static void start(){
        final JFrame window = new JFrame("Zombie Tsunami");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    
}
