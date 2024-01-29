package main.java.zombieTsunami.api;

import java.util.List;

import main.java.zombieTsunami.view.VControllerImpl;

public interface Controller {

    void setModel();

    void setView();

    int getScreenCol();

    int getScreenRow();

    int getTitleSize();

    int getFPS();

    int getScreenWidth();

    int getScreenHigh();

    
    List<List<Integer>> mapList();

    List<String> tileElements();

    List<Pair<Integer, Integer>> tilePos();

    List<Integer> mapIndexList();
    int getMapX();

    int getMapY();

    int getSpeed();

    int getNumX();
    
    void jumpZombie();

    void updateZombie();
}
