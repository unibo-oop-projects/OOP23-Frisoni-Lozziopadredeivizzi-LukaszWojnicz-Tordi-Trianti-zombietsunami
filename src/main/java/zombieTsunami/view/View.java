package main.java.zombieTsunami.view;

import javax.swing.JFrame;

import main.java.zombieTsunami.view.api.VController;
import main.java.zombieTsunami.view.mapView.impl.MapImpl;

public class View {


    public static void start(final VController c, int width, int high) {
        final JFrame window = new JFrame("Zombie Tsunami");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        final StartMenu startMenu = new StartMenu(width, high);
        final MapImpl gamePanel = new MapImpl(c);

        startMenu.enable();
        window.add(startMenu);

        startMenu.getStartButton().addActionListener(e -> {
            window.remove(startMenu);
            window.add(gamePanel);
            window.revalidate();
            window.repaint();
            gamePanel.startGameThread();
        });
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

}
