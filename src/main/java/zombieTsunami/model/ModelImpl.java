package main.java.zombieTsunami.model;

import java.awt.Graphics2D;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.api.Model;
import main.java.zombieTsunami.model.mapModel.api.TileManager;
import main.java.zombieTsunami.model.mapModel.impl.TileManagerImpl;
import main.java.zombieTsunami.model.zombieModel.api.Zombie;
import main.java.zombieTsunami.model.zombieModel.impl.ZombieImpl;

public class ModelImpl implements Model{

    private final TileManager tileman;
    private final Zombie zombie;
    private Controller control;

    public ModelImpl(){
        this.tileman=new TileManagerImpl();
        this.zombie=new ZombieImpl();
    }

    public void setController(final Controller c){
        this.control=c;
    }

    public void updateZombie(){
        this.zombie.update();
    }
    
    public void drowMap(final Graphics2D g2){
        this.tileman.drow(g2, MapData.getMaxScCol(), MapData.getMaxScRow(), MapData.getTitSize());
    }
}
