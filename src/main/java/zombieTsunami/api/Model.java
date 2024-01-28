package main.java.zombieTsunami.api;

import java.awt.Graphics2D;

public interface Model {
    
    void updateZombie();

    void drowMap(Graphics2D g2);

    void setController(Controller c);

    int getX();

    int getY();

    int getSpeed();

    int getNumX();
}
