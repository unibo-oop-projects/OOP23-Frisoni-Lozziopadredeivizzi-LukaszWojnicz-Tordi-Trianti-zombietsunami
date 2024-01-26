package main.java.zombieTsunami.model;

import java.awt.Graphics2D;
import main.java.zombieTsunami.model.mapModel.api.TileManager;
import main.java.zombieTsunami.model.mapModel.impl.TileManagerImpl;
import main.java.zombieTsunami.model.zombieModel.api.Zombie;
import main.java.zombieTsunami.model.zombieModel.impl.ZombieImpl;

public class Model {

    private final TileManager tileman;
    private final Zombie zombie;

    public Model(){
        this.tileman=new TileManagerImpl();
        this.zombie=new ZombieImpl();
    }

    public void updateZombie(){
        this.zombie.update();
    }
    
    public void drowMap(final Graphics2D g2){
        this.tileman.drow(g2);
    }
}
