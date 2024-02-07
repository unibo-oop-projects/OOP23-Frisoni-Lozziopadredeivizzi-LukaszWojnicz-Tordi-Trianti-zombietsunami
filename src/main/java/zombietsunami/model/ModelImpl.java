package zombietsunami.model;

import java.util.List;

import zombietsunami.api.Controller;
import zombietsunami.api.Model;
import zombietsunami.api.Pair;
import zombietsunami.model.mapModel.api.GameMap;
import zombietsunami.model.mapModel.api.MapPosList;
import zombietsunami.model.mapModel.api.TileElement;
import zombietsunami.model.mapModel.impl.GameMapImpl;
import zombietsunami.model.mapModel.impl.MapPosListImpl;
import zombietsunami.model.mapModel.impl.TileElementImpl;
import zombietsunami.model.obstacleModel.api.Bomb;
import zombietsunami.model.obstacleModel.api.Breakable;
import zombietsunami.model.obstacleModel.impl.BombImpl;
import zombietsunami.model.obstacleModel.impl.BreakableImpl;
import zombietsunami.model.zombieModel.api.Zombie;
import zombietsunami.model.zombieModel.impl.ZombieImpl;
import zombietsunami.model.personModel.api.Person;
import zombietsunami.model.personModel.impl.PersonImpl;

/**
 * This class is the Model of the MVC and implements the Model interface
 * {@link zombietsunami.api.Model}.
 */
public final class ModelImpl implements Model {

    private final GameMap gameMap;
    private final TileElement tileElem;
    private final MapPosList mapPos;
    private final Zombie zombie;
    private final Bomb bomb;
    final Person person;
    private final Breakable breakable; // Giustamente non dovrebbe esserci solo UN breakable nel gioco, ma molteplici
    Controller control;

    /**
     * Allows to set the different elements belonging to the Model.
     */
    public ModelImpl() {
        this.gameMap = new GameMapImpl();
        this.tileElem = new TileElementImpl();
        this.zombie = new ZombieImpl();
        this.bomb = new BombImpl();
        this.mapPos = new MapPosListImpl();
        this.person = new PersonImpl();
        this.breakable = new BreakableImpl(1); // 1 per test
    }

    @Override
    public void setController(final Controller c) {
        this.control = c;
    }

    @Override
    public void updateZombie() {
        this.zombie.update();
    }

    @Override
    public List<Integer> getMapList() {
        return this.gameMap.getLoadedMapList();
    }

    @Override
    public List<String> getTileElem() {
        return this.tileElem.getTileElement();
    }

    @Override
    public List<Pair<Integer, Integer>> getScreenTilePos() {
        return this.mapPos.getScreenTilePosition(MapData.getMaxWorldRow(), MapData.getMaxWorldCol(),
                MapData.getTitSize(),
                getZombieMapX(), getZombieMapY(), this.zombie.getScreenX(), this.zombie.getScreenY());
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
    public int getPersonMapX() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonMapX'");
    }

    @Override
    public int getPersonMapY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonMapY'");
    }

    @Override
    public int getNumXp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumXp'");
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
    public void setStrenght(final int strenght) {
        this.zombie.setStrenght(strenght);
    }

    @Override
    public int getZombieScreenX() {
        return this.zombie.getScreenX();
    }

    @Override
    public int getZombieScreenY() {
        return this.zombie.getScreenY();
    }

    @Override
    public int getObstacleMapX() {
        return this.bomb.getX();
    }

    @Override
    public int getObstacleMapY() {
        return this.bomb.getY();
    }

    @Override
    public boolean canBreakObstacle(final int zombieStrength) {
        return this.breakable.canBreakObstacle(zombieStrength);
    }

    @Override
    public void jumpPress() {
        this.zombie.jumpPress();
    }

    @Override
    public void updateJumpZombie() {
        this.zombie.updateJumpZombie();
    }

    @Override
    public boolean isJumping() {
        return this.zombie.isJumping();
    }

    @Override
    public void updateOstacle() {
        this.bomb.update();
    }

    @Override
    public List<Integer> getObstacleList() {
        return this.gameMap.getLoadedObstacleList();
    }
}
