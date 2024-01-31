package zombieTsunami.view.zombieView.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import zombieTsunami.view.api.KeyHandler;
import zombieTsunami.view.api.VController;

public interface DrawZombie {

    void drawZombieV(final Graphics2D g2, final VController controller);
    BufferedImage getZombie();
    void updateZombie(final VController controller);
    void jump();
    void handleKeyPress(VController controller, KeyHandler keyH);
} 
