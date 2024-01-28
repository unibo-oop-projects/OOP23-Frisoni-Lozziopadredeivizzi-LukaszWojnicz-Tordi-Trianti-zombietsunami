package main.java.zombieTsunami.api;

import java.awt.Graphics2D;
import java.util.List;

public interface Controller {

    void setModel();

    void setView();

    int getScreenCol();

    int getScreenRow();

    int getTitleSize();

    int getFPS();

    int getScreenWidth();

    int getScreenHigh();

    void updateZombie();
    
    void drawZombie(Graphics2D g2);

    List<List<Integer>> mapList();

    List<String> tileElements();

    List<Pair<Integer, Integer>> tilePos();

    List<Integer> mapIndexList();
}
