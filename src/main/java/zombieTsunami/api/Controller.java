package zombieTsunami.api;

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

    List<Pair<Integer, Integer>> screenTilePos();

    int getZombieMapX();

    int getZombieMapY();

    int getSpeed();

    int getNumX();
    
    void jumpZombie();

    void updateZombie();

    int getWorldCol();

    int getWorldRow();

    int getWorldWidth();

    int getWorldHight();
    
    int getStrenght();
    
    void increaseStrenght();

    int getPersonMapX();

    int getPersonMapY();

    int getNumXp();

    void setStrenght(int strenght);

    int getObstacleMapX();

    int getObstacleMapY();

    boolean canBreakObstacle(int zombieStrength);
}
