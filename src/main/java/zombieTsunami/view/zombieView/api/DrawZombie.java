package main.java.zombieTsunami.view.zombieView.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import main.java.zombieTsunami.view.api.VController;

public interface DrawZombie {

    void drawZombieV(final Graphics2D g2, final VController controller);
    BufferedImage getZombie();
    void update();
    void jump();
} 
