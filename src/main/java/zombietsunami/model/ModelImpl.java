package zombietsunami.model;

import java.util.List;

import zombietsunami.api.Collision;
import zombietsunami.api.MightWin;
import zombietsunami.api.GameOver;
import zombietsunami.api.Model;
import zombietsunami.Pair;
import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.mapmodel.impl.GameMapImpl;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.api.ObstacleManager;
import zombietsunami.model.obstaclemodel.impl.BreakableImpl;
import zombietsunami.model.obstaclemodel.impl.ObstacleManagerImpl;
import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;
import zombietsunami.model.personmodel.api.Person;
import zombietsunami.model.personmodel.impl.PersonImpl;
import zombietsunami.model.personmodel.api.PersonsManager;
import zombietsunami.model.personmodel.impl.PersonsManagerImpl;

/**
 * This class is the Model of the MVC and implements the Model interface
 * {@link zombietsunami.api.Model}.
 */
public final class ModelImpl implements Model {

    private final GameMap gameMap;
    private final Zombie zombie;
    private final Person person;
    private final PersonsManager personsManager;
    private final Breakable breakable;
    private final MightWin win;
    private final GameOver gameOver;
    private final ObstacleManager obstacleManager;
    private final Collision collisionManager;

    /**
     * Allows to set the different elements belonging to the Model.
     */
    public ModelImpl() {
        this.gameMap = new GameMapImpl();
        this.zombie = new ZombieImpl();
        this.person = new PersonImpl();
        this.personsManager = new PersonsManagerImpl();
        this.breakable = new BreakableImpl(3);
        this.win = new MightWinImpl();
        this.gameOver = new GameOverImpl();
        this.obstacleManager = new ObstacleManagerImpl();
        this.collisionManager = new CollisionImpl();
    }

    @Override
    public void getBombsFromMap(final List<Integer> bomblist, final List<Pair<Integer, Integer>> coords,
            final Integer strength) {
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
        return this.gameMap.getTileElem();
    }

    @Override
    public List<Pair<Integer, Integer>> getScreenTilePos() {
        return this.gameMap.getScreenTilePos(MapData.getMaxWorldRow(), MapData.getMaxWorldCol(),
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
    public void updatePerson() {
        this.person.update();
    }

    @Override
    public List<Integer> getPersonList() {
        return this.gameMap.getLoadedPersonList();
    }

    @Override
    public void getPersonFromMap(final List<Integer> personlist, 
        final List<Pair<Integer, Integer>> coords, final Integer strenght) {
        this.personsManager.getPersonFromMap(personlist, coords, strenght);
    }

    @Override
    public void setCoordinatesOfPersonInList(final int index, final int x, final int y) {
        this.personsManager.setCoordinatesOfPersonInList(index, x, y);
    }

    @Override
    public void removePersonFromList(final int index) {
       this.personsManager.removePersonFromList(index);
    }

    @Override
    public void removePersonListItem(final int index) {
        this.gameMap.removePersonListItem(index);
    }

    @Override
    public void collisionZombiePersons() {
        this.collisionManager.collisionZombiePersons(personsManager.getPersonList(), MapData.getTitSize(), this.zombie, gameMap);
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
    public void setCoordinatesOfBombInList(final int index, final int x, final int y) {
        this.obstacleManager.setCoordinatesOfBombInList(index, x, y);
    }

    @Override
    public void removeBombFromList(final int index) {
        this.obstacleManager.removeBombFromList(index);
    }

    @Override
    public void getBreakablesFromMap(final List<Integer> breakablelist, final List<Pair<Integer, Integer>> coords,
            final Integer strength) {
        this.obstacleManager.getBreakablesFromMap(breakablelist, coords, strength);
    }

    @Override
    public void collisionZombieObstacle() {
        this.collisionManager.collisionZombieObstacle(obstacleManager.getBombList(), 
            obstacleManager.getBreakableList(), MapData.getTitSize(), this.zombie, gameMap);
    }

    @Override
    public void removeObstacleListItem(final int index) {
        this.gameMap.removeObstacleListItem(index);
    }

    @Override
    public boolean isGameOver() {
        return this.collisionManager.isGameOver();
    }

    @Override
    public boolean isNotEnough() {
        return this.gameOver.isNotEnough(isGameOver());
    }

    @Override
    public boolean isStrenghtZero() {
        return this.gameOver.isStrenghtZero(getStrenght());
    }
}
