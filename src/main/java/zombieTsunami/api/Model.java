package main.java.zombieTsunami.api;

import java.util.List;

public interface Model {
    
    void updateZombie();

    void setController(Controller c);

    List<List<Integer>> getMapList();

    List<String> getTileElem();

    List<Pair<Integer, Integer>> getTilePos();

    List<Integer> getMapIndexList();
    int getX();

    int getY();

    int getSpeed();

    int getNumX();
    
    void jump();
}
