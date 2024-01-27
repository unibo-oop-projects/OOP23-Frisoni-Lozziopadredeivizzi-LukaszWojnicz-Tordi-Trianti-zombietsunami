package main.java.zombieTsunami.view.api;

import java.awt.Graphics2D;

import main.java.zombieTsunami.api.Controller;

public interface VController {

    void set(Controller c);

    int getScreenWC();

    int getScreenHC();

    int getFPSC();

    void updateZombieC();

    void drowMapC(Graphics2D g2);

    void drawZombieC(Graphics2D g2);
}
