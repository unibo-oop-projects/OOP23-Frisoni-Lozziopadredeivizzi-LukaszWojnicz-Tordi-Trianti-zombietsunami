package main.java.zombieTsunami.api;

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

    
    List<Integer> mapList();

    List<String> tileElements();

    List<Pair<Integer, Integer>> tilePos();

    int getMapX();

    int getMapY();

    int getSpeed();

    int getNumX();
    
    void jumpZombie();

    void updateZombie();
}
