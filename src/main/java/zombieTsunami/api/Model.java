package zombieTsunami.api;

import java.util.List;

public interface Model {
    
    void updateZombie();

    void setController(Controller c);

    List<Integer> getMapList();

    List<String> getTileElem();

    List<Pair<Integer, Integer>> getScreenTilePos();

    int getX();

    int getY();

    int getSpeed();

    int getNumX();
    
    void jump();
}
