package zombieTsunami.model;

import java.util.List;

import zombieTsunami.api.Controller;
import zombieTsunami.api.Model;
import zombieTsunami.api.Pair;
import zombieTsunami.model.mapModel.api.GameMap;
import zombieTsunami.model.mapModel.api.MapPosList;
import zombieTsunami.model.mapModel.api.TileElement;
import zombieTsunami.model.mapModel.impl.GameMapImpl;
import zombieTsunami.model.mapModel.impl.MapPosListImpl;
import zombieTsunami.model.mapModel.impl.TileElementImpl;
import zombieTsunami.model.zombieModel.api.Zombie;
import zombieTsunami.model.zombieModel.impl.ZombieImpl;

public class ModelImpl implements Model {

    private final GameMap gameMap;
    private final TileElement tileElem;
    private final MapPosList mapPos;
    private final Zombie zombie;
    private Controller control;

    public ModelImpl() {
        this.gameMap = new GameMapImpl();
        this.tileElem = new TileElementImpl();
        this.zombie = new ZombieImpl();
        this.mapPos = new MapPosListImpl(MapData.getMaxWorldRow(), MapData.getMaxWorldCol(), MapData.getTitSize(),
                getZombieMapX(), getZombieMapY(), this.zombie.getScreenX(), this.zombie.getScreenY());
    }

    public void setController(final Controller c) {
        this.control = c;
    }

    @Override
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
                MapData.getTitSize(), getZombieMapX(), getZombieMapY(), this.zombie.getScreenX(),
                this.zombie.getScreenY());
    }

    @Override
    public int getZombieMapX() {
        return this.zombie.getX();
    }

    @Override
    public int getZombieMapY() {
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

    @Override
    public int getStrenght() {
        return this.zombie.getStrenght();
    }

    @Override
    public void increaseStrenght() {
        this.zombie.increaseStrenght();
    }

    @Override
    public void setStrenght(int strenght) {
        this.zombie.setStrenght(strenght);
    }

}
