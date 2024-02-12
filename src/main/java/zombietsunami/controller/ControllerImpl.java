package zombietsunami.controller;

import java.util.List;

import zombietsunami.api.Controller;
import zombietsunami.api.Model;
import zombietsunami.api.Pair;
import zombietsunami.model.MapData;
import zombietsunami.model.ModelImpl;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.view.VControllerImpl;
import zombietsunami.view.api.VController;

/**
 * This class is the Controller of the MVC and implements the Controller
 * interface
 * {@link zombietsunami.api.Controller}.
 */
public final class ControllerImpl implements Controller {

    private Model model;

    @Override
    public void setModel() {
        this.model = new ModelImpl();
    }

    @Override
    public void setView() {
        final VController viewController = new VControllerImpl();
        viewController.set(this);
    }

    @Override
    public int getScreenCol() {
        return MapData.getMaxScCol();
    }

    @Override
    public int getScreenRow() {
        return MapData.getMaxScRow();
    }

    @Override
    public int getTitleSize() {
        return MapData.getTitSize();
    }

    @Override
    public int getFPS() {
        return MapData.getFPS();
    }

    @Override
    public int getScreenWidth() {
        return MapData.getScreenW();
    }

    @Override
    public int getScreenHigh() {
        return MapData.getScreenH();
    }

    @Override
    public int getZombieMapX() {
        return this.model.getZombieMapX();
    }

    @Override
    public List<Integer> mapList() {
        return this.model.getMapList();
    }

    @Override
    public List<String> tileElements() {
        return this.model.getTileElem();
    }

    @Override
    public List<Pair<Integer, Integer>> screenTilePos() {
        return this.model.getScreenTilePos();
    }

    @Override
    public int getZombieMapY() {
        return this.model.getZombieMapY();
    }

    @Override
    public int getSpeed() {
        return this.model.getSpeed();
    }

    @Override
    public void updateZombie() {
        this.model.updateZombie();
    }

    @Override
    public int getWorldCol() {
        return MapData.getMaxWorldCol();
    }

    @Override
    public int getWorldRow() {
        return MapData.getMaxWorldRow();
    }

    @Override
    public int getWorldWidth() {
        return MapData.getWorldWidth();
    }

    @Override
    public int getWorldHight() {
        return MapData.getWorldHeight();
    }

    @Override
    public int getStrenght() {
        return this.model.getStrenght();
    }

    @Override
    public void increaseStrenght() {
        this.model.increaseStrenght();
    }

    @Override
    public int getPersonMapX() {
        return this.model.getPersonMapX();
    }

    @Override
    public int getPersonMapY() {
        return this.model.getPersonMapY();
    }

    @Override
    public void removePersonListItem(int index) {
        this.model.removePersonListItem(index);
    }

    @Override
    public void updatePerson() {
        this.model.updatePerson();
    }

    @Override
    public void getPersonFromMap(List<Integer> personlist, List<Pair<Integer, Integer>> coords, Integer strenght) {
        this.model.getPersonFromMap(personlist, coords, strenght);
    }

    @Override
    public List<Integer> getPersonList() {
        return this.model.getPersonList();
    }

    @Override
    public void setCoordinatesOfPersonInList(int index, int x, int y) {
        this.model.setCoordinatesOfPersonInList(index, x, y);
    }

    @Override
    public void removePersonFromList(int index) {
       this.model.removePersonFromList(index);
    }

    @Override
    public List<Integer> personList() {
        return this.model.getPersonList();
    }

    @Override
    public void collisionZombiePersons() {
        this.model.collisionZombiePersons();
    }
    
    @Override
    public void setStrenght(final int strenght) {
        this.model.setStrenght(strenght);
    }

    @Override
    public boolean canBreakObstacle(final int zombieStrength) {
        return this.model.canBreakObstacle(zombieStrength);
    }

    @Override
    public int getZombieScreenX() {
        return this.model.getZombieScreenX();
    }

    @Override
    public int getZombieScreenY() {
        return this.model.getZombieScreenY();
    }

    @Override
    public void jumpPress() {
        this.model.jumpPress();
    }

    @Override
    public void updateJumpZombie() {
        this.model.updateJumpZombie();
    }

    @Override
    public boolean isJumping() {
        return this.model.isJumping();
    }

    @Override
    public void updateBomb() {
        this.model.updateBomb();
    }

    @Override
    public void updateBreakable() {
        this.model.updateBreakable();
    }

    @Override
    public List<Integer> obstacleList() {
        return this.model.getObstacleList();
    }

    @Override
    public void setEndPos(final int endX) {
        this.model.setEndPos(endX);
    }

    @Override
    public boolean isWin() {
        return this.model.isWin();
    }

    /**
     * Returns the list of bombs from the map.
     * 
     * @param controller the controller.
     */
    @Override
    public void getBombsFromMap(final List<Integer> bomblist, final List<Pair<Integer, Integer>> coords,
            final Integer strength) {
        this.model.getBombsFromMap(bomblist, coords, strength);
    }

    /**
     * Gets the bomb list.
     * @return the bomb list.
     */
    @Override
    public List<Bomb> getBombList() {
        return this.model.getBombList();
    }

    /**
     * Gets the breakable list.
     * @return the breakable list.
     */
    @Override
    public List<Breakable> getBreakableList() {
        return this.model.getBreakableList();
    }

     /**
     * Sets the X and Y coordinates for the "index" bomb
     * of the list.
     * @param index index of the bomb in the list.
     * @param x X coordinate.
     * @param y Y coordinate.
     */
    @Override
    public void setCoordinatesOfBombInList(final int index, final int x, final int y) {
        this.model.setCoordinatesOfBombInList(index, x, y);
    }

    /**
     * Removes the "index" bomb inside the list.
     * 
     * @param index the index of the bomb.
     */
    @Override
    public void removeBombFromList(final int index) {
        this.model.removeBombFromList(index);
    }

    @Override
    public void getBreakablesFromMap(final List<Integer> breakablelist, final List<Pair<Integer, Integer>> coords,
            final Integer strength) {
        this.model.getBreakablesFromMap(breakablelist, coords, strength);
    }

    @Override
    public void collisionZombieObstacle() {
        this.model.collisionZombieObstacle();
    }

    @Override
    public void removeObstacleListItem(final int index) {
        this.model.removeBombFromList(index);
    }

    @Override
    public boolean isGameOver() {
        return this.model.isGameOver();
    }

    @Override
    public boolean isNotEnough() {
        return this.model.isNotEnough();
    }

    @Override
    public boolean isStrenghtZero() {
        return this.model.isStrenghtZero();
    }

}
