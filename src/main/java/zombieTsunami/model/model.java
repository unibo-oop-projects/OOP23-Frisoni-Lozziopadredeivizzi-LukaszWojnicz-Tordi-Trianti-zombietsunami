package main.java.zombieTsunami.model;

import main.java.zombieTsunami.model.mapModel.api.TileManager;
import main.java.zombieTsunami.model.mapModel.impl.TileManagerImpl;
import main.java.zombieTsunami.model.zombieModel.api.Zombie;
import main.java.zombieTsunami.model.zombieModel.impl.ZombieImpl;

public class model {

    private final TileManager tileman;
    private final Zombie zombie;

    public model(){
        this.tileman=new TileManagerImpl();
        this.zombie=new ZombieImpl();
    }

    public void updateZombie(){
        this.zombie.update();
    }
    
    
}
