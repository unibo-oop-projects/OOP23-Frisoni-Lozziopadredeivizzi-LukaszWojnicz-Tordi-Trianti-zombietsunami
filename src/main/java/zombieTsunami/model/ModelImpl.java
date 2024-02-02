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
import zombieTsunami.model.obstacleModel.api.Breakable;
import zombieTsunami.model.obstacleModel.impl.BreakableImpl;
import zombieTsunami.model.zombieModel.api.Zombie;
import zombieTsunami.model.zombieModel.impl.ZombieImpl;
import zombieTsunami.model.personModel.api.Person;
import zombieTsunami.model.personModel.impl.PersonImpl;

/**
 * This class is the Model of the MVC and implements the Model interface
 * {@link zombieTsunami.api.Model}.
 */
public final class ModelImpl implements Model {

    private final GameMap gameMap;
    private final TileElement tileElem;
    private final MapPosList mapPos;
    private final Zombie zombie;
    private final Person person;
    private final Breakable breakable; // Giustamente non dovrebbe esserci solo UN breakable nel gioco, ma molteplici
    private Controller control;

    /**
     * Allows to set the different elements belonging to the Model.
     */
    public ModelImpl() {
        this.gameMap = new GameMapImpl();
        this.tileElem = new TileElementImpl();
        this.zombie = new ZombieImpl();
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
    public void decreaseZombieScreenY() {
        this.zombie.decreaseZombieScreenY();
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObstacleMapX'");
    }

    @Override
    public int getObstacleMapY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObstacleMapY'");
    }

    @Override
    public boolean canBreakObstacle(final int zombieStrength) {
        return this.breakable.canBreakObstacle(zombieStrength);
    }

    @Override
    public void setScreenY(int screenY){
        this.zombie.setScreenY( screenY);
    }
}
