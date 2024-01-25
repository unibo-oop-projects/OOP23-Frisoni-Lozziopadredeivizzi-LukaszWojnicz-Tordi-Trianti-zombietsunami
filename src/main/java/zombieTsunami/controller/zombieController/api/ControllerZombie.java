package main.java.zombieTsunami.controller.zombieController.api;

import java.awt.Graphics2D;

public interface ControllerZombie {
    void drawZombie(Graphics2D g2);
    void update();
    void handleKeyPress();
}
