package main.java.zombieTsunami.model;

import java.util.List;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.api.Model;
import main.java.zombieTsunami.api.Pair;
import main.java.zombieTsunami.model.mapModel.api.GameMap;
import main.java.zombieTsunami.model.mapModel.api.MapPosList;
import main.java.zombieTsunami.model.mapModel.api.TileElement;
import main.java.zombieTsunami.model.mapModel.impl.GameMapImpl;
import main.java.zombieTsunami.model.mapModel.impl.MapPosListImpl;
import main.java.zombieTsunami.model.mapModel.impl.TileElementImpl;
import main.java.zombieTsunami.model.zombieModel.api.Zombie;
import main.java.zombieTsunami.model.zombieModel.impl.ZombieImpl;

public class ModelImpl implements Model {

    private final GameMap gameMap;
    private final TileElement tileElem;
    private final MapPosList mapPos;
    private final Zombie zombie;
    private Controller control;

    public ModelImpl() {
        this.gameMap = new GameMapImpl();
        this.tileElem = new TileElementImpl();
        this.mapPos = new MapPosListImpl();
        this.zombie = new ZombieImpl();
    }

    public void setController(final Controller c) {
        this.control = c;
    }

    public void updateZombie() {
        this.zombie.update();
    }

    @Override
    public List<Integer> getMapList() {
        return this.gameMap.loadMap();
    }

    @Override
    public List<String> getTileElem() {
        return this.tileElem.getTileElement();
    }

    @Override
    public List<Pair<Integer, Integer>> getScreenTilePos() {
        return this.mapPos.getScreenTilePosition(MapData.getMaxWorldRow(), MapData.getMaxWorldCol(),
                MapData.getTitSize(), getX(), getY(), this.zombie.getScreenX(), this.zombie.getScreenY());
    }

    @Override
    public int getX() {
        return this.zombie.getX();
    }

    @Override
    public int getY() {
        return this.zombie.getY();
    }

    @Override
    public int getSpeed() {
        return this.zombie.getSpeed();
    }

    @Override
    public int getNumX() {
        return this.zombie.getNumX();
    }

    @Override
    public void jump() {
        this.zombie.jump();
    }

}
