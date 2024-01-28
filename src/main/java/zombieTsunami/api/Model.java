package main.java.zombieTsunami.api;

import java.awt.Graphics2D;
import java.util.List;

public interface Model {
    
    void updateZombie();

    void setController(Controller c);

    void drawZombie(Graphics2D g2);

    List<List<Integer>> getMapList();

    List<String> getTileElem();

    List<Pair<Integer, Integer>> getTilePos();

    List<Integer> getMapIndexList();
}
