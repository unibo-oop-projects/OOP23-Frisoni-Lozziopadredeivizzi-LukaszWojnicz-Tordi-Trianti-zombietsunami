package main.java.zombieTsunami.model;

import java.awt.Graphics2D;
import java.util.List;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.api.Model;
import main.java.zombieTsunami.model.mapModel.api.GameMap;
import main.java.zombieTsunami.model.mapModel.api.TileElement;
import main.java.zombieTsunami.model.mapModel.impl.GameMapImpl;
import main.java.zombieTsunami.model.mapModel.impl.TileElementImpl;
import main.java.zombieTsunami.model.zombieModel.api.Zombie;
import main.java.zombieTsunami.model.zombieModel.impl.ZombieImpl;

public class ModelImpl implements Model{

    private final GameMap gameMap;
    private final TileElement tileElem;
    private final Zombie zombie;
    private Controller control;

    public ModelImpl(){
        this.gameMap = new GameMapImpl();
        this.tileElem = new TileElementImpl();
        this.zombie=new ZombieImpl();
    }

    public void setController(final Controller c){
        this.control=c;
    }

    public void updateZombie(){
        this.zombie.update();
    }

    public void drawZombie(final Graphics2D g2){
        this.zombie.drawZombie(g2);
    }

    @Override
    public List<List<Integer>> getMapList() {
        return this.gameMap.loadMap();
    }

    @Override
    public List<String> getTileElem() {
        return this.tileElem.getTileElement();
    }
}
