package zombieTsunami.view;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

import zombieTsunami.view.api.KeyHandler;
import zombieTsunami.view.api.VController;
import zombieTsunami.view.mapView.impl.MapImpl;

public class View {


    public static void start(final VController c, final int width, final int height) {
        final JFrame window = new JFrame("Zombie Tsunami");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setFocusable(true);
        final KeyHandler keyH= new KeyHandlerImpl();
        window.addKeyListener((KeyListener) keyH);
        final StartMenu startMenu = new StartMenu(width, height);
        final MapImpl gamePanel = new MapImpl(c,keyH);

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
