package main.java.zombieTsunami.view;

import javax.swing.JFrame;

import main.java.zombieTsunami.view.mapView.impl.MapImpl;

public class View {
    
    public static void start(){
        final JFrame window = new JFrame("Zombie Tsunami");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        final MapImpl panel = new MapImpl();
        window.add(panel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        panel.startGameThread();
    }
    
}
