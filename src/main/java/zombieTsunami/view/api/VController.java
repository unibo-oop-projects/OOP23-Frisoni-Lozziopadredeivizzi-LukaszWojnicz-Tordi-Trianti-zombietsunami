package main.java.zombieTsunami.view.api;

import java.awt.Graphics2D;
import java.util.List;

import main.java.zombieTsunami.api.Controller;

public interface VController {

    void set(Controller c);

    int getScreenWC();

    int getScreenHC();

    int screenColC();

    int screenRowC();

    int titleSizeC();

    int getFPSC();

    void updateZombieC();

    void drawZombieC(Graphics2D g2);

    List<String> tileElementsC();
}
