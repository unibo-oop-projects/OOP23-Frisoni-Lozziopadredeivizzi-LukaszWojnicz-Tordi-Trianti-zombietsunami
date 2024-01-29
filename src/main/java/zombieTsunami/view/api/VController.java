package main.java.zombieTsunami.view.api;

import java.util.List;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.api.Pair;

public interface VController {

    void set(Controller c);

    int getScreenWC();

    int getScreenHC();

    int screenColC();

    int screenRowC();

    int titleSizeC();

    int getFPSC();


    List<String> tileElementsC();

    List<Pair<Integer, Integer>> tilePosC();

    List<Integer> mapIndexListC();
    
    int getMapX();

    int getMapY();

    int getSpeed();

    int getNumX();

    void jumpZombie();

    void updateZombie();

    int getWorldColC();

    int getWorldRowC();

    int getWorldWidthC();

    int getWorldHightC();

}
