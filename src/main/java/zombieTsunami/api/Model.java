package zombieTsunami.api;

import java.util.List;

public interface Model {

    void updateZombie();

    void setController(Controller c);

    List<Integer> getMapList();

    List<String> getTileElem();

    List<Pair<Integer, Integer>> getScreenTilePos();

    int getZombieMapX();

    int getZombieMapY();

    int getSpeed();

    int getNumX();

    void decreaseZombieScreenY();

    int getPersonMapX();

    int getPersonMapY();

    int getNumXp();

    int getStrenght();

    void increaseStrenght();

    void setStrenght(int strenght);

    int getZombieScreenX();

    int getZombieScreenY();

    int getObstacleMapX();

    int getObstacleMapY();

    boolean canBreakObstacle(int zombieStrength);

    void jumpPress();
}
