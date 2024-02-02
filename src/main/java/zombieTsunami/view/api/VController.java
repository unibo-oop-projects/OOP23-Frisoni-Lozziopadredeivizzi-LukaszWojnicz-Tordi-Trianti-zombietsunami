package zombieTsunami.view.api;

import java.util.List;

import zombieTsunami.api.Controller;
import zombieTsunami.api.Pair;

public interface VController {

    void set(Controller c);

    int getScreenWC();

    int getScreenHC();

    int screenColC();

    int screenRowC();

    int titleSizeC();

    int getFPSC();


    List<String> tileElementsC();

    List<Pair<Integer, Integer>> screenTilePosC();

    List<Integer> mapIndexListC();
    
    int getZombieMapX();

    int getZombieMapY();

    int getSpeed();

    int getNumX();

    void jumpZombie();

    void updateZombie();

    int getWorldColC();

    int getWorldRowC();

    int getWorldWidthC();

    int getWorldHightC();

    int getPersonMapX();

    int getPersonMapY();

    void updatePerson();

    int getStrenght();
    
    void increaseStrenght();

    void setStrenght(int strenght);
    
    int getZombieScreenX();

    int getZombieScreenY();

    void setZombieScreenY(int screenY);
}
