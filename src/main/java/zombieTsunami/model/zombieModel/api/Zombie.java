package main.java.zombieTsunami.model.zombieModel.api;

import java.awt.Graphics2D;


public interface Zombie {
    void jump();
    void drawZombie(Graphics2D g2);
    void update();
}
