package main.java.zombieTsunami.api;

import java.awt.Graphics2D;

public interface Controller {

    void setModel();

    void setView();

    int getScreenCol();

    int getScreenRow();

    int getTitleSize();

    int getFPS();

    int getScreenWidth();

    int getScreenHigh();

    void drowMap(Graphics2D g2);

    void updateZombie();
    
    int getMapX();

    int getMapY();

    int getSpeed();

    int getNumX();
}
