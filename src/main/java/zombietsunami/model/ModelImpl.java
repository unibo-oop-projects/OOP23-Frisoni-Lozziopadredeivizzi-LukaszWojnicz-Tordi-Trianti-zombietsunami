package zombietsunami.model;

import java.util.List;

import zombietsunami.api.Collision;
import zombietsunami.api.MightWin;
import zombietsunami.api.Model;
import zombietsunami.api.Pair;
import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.mapmodel.api.MapPosList;
import zombietsunami.model.mapmodel.api.TileElement;
import zombietsunami.model.mapmodel.impl.GameMapImpl;
import zombietsunami.model.mapmodel.impl.MapPosListImpl;
import zombietsunami.model.mapmodel.impl.TileElementImpl;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.impl.BombImpl;
import zombietsunami.model.obstaclemodel.impl.BreakableImpl;
import zombietsunami.model.obstaclemodel.api.ObstacleManager;
import zombietsunami.model.obstaclemodel.impl.ObstacleManagerImpl;
import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;
import zombietsunami.model.personmodel.api.Person;
import zombietsunami.model.personmodel.impl.PersonImpl;

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
    private final Person person;
    private final Breakable breakable; // Giustamente non dovrebbe esserci solo UN breakable nel gioco, ma molteplici
    private final MightWin win;
    private final ObstacleManager obstacleManager;
    private final Collision collisionManager;

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
        this.win = new MightWinImpl();
        this.obstacleManager = new ObstacleManagerImpl();
        this.collisionManager = new CollisionImpl();
    }

    @Override
    public void getBombsFromMap(List<Integer> bomblist, List<Pair<Integer, Integer>> coords, Integer strength) {
        this.obstacleManager.getBombsFromMap(bomblist, coords, strength);
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
    public int getPersonMapX() {
       return this.person.getX();
    }

    @Override
    public int getPersonMapY() {
        return this.person.getY();
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
    public void updateBreakable() {
        this.breakable.update();
    }

    @Override
    public void updateBomb() {
        this.bomb.update();
    }

    @Override
    public List<Integer> getObstacleList() {
        return this.gameMap.getLoadedObstacleList();
    }

    @Override
    public void setEndPos(final int endX) {
        this.win.setEndPos(endX);
    }

    @Override
    public boolean isWin() {
        return this.win.isWin();
    }

    @Override
    public List<Bomb> getBombList() {
        return this.obstacleManager.getBombList();
    }

    @Override
    public List<Breakable> getBreakableList() {
        return this.obstacleManager.getBreakableList();
    }

    @Override
    public void setCoordinatesOfBombInList(int index, int x, int y) {
        this.obstacleManager.setCoordinatesOfBombInList(index, x, y);
    }

    @Override
    public void removeBombFromList(int index) {
        this.obstacleManager.removeBombFromList(index);
    }

    @Override
    public void getBreakablesFromMap(List<Integer> breakablelist, List<Pair<Integer, Integer>> coords,
            Integer strength) {
        this.obstacleManager.getBreakablesFromMap(breakablelist, coords, strength);
    }

    @Override
    public void collisionZombieObstacle() {
        this.collisionManager.collisionZombieObstacle(obstacleManager.getBombList(), obstacleManager.getBreakableList(), 
            MapData.getTitSize(), this.zombie, gameMap);
    }

    @Override
    public void removeObstacleListItem(int index) {
        this.gameMap.removeObstacleListItem(index);
    }

    @Override
    public boolean isGameOver() {
        return this.collisionManager.isGameOver();
    }
}
