package zombietsunami.view;

import java.util.List;

import zombietsunami.api.Controller;
import zombietsunami.Pair;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.view.api.VController;

/**
 * Implementation of the VController interface for controlling zombies in the
 * Zombie Tsunami game.
 */
public final class VControllerImpl implements VController {

    private Controller control;

    @Override
    public void set(final Controller c) {
        this.control = c;

        View.start(this, getScreenWC(), getScreenHC());
    }

    @Override
    public int getScreenWC() {
        return this.control.getScreenWidth();
    }

    @Override
    public int getScreenHC() {
        return this.control.getScreenHigh();
    }

    @Override
    public int getFPSC() {
        return this.control.getFPS();
    }

    /**
     * Gets the x-coordinate of the zombie in the game map.
     *
     * @return The x-coordinate of the zombie.
     */
    @Override
    public int getZombieMapX() {
        return this.control.getZombieMapX();
    }

    /**
     * Gets the y-coordinate of the zombie in the game map.
     *
     * @return The y-coordinate of the zombie.
     */
    @Override
    public int getZombieMapY() {
        return this.control.getZombieMapY();
    }

    /**
     * Gets the speed of the zombie.
     *
     * @return The speed of the zombie.
     */
    @Override
    public int getSpeed() {
        return this.control.getSpeed();
    }

    @Override
    public List<String> tileElementsC() {
        return this.control.tileElements();
    }

    @Override
    public int screenColC() {
        return this.control.getScreenCol();
    }

    @Override
    public int screenRowC() {
        return this.control.getScreenRow();
    }

    @Override
    public int titleSizeC() {
        return this.control.getTitleSize();
    }

    @Override
    public List<Pair<Integer, Integer>> screenTilePosC() {
        return this.control.screenTilePos();
    }

    @Override
    public List<Integer> mapIndexListC() {
        return this.control.mapList();
    }

    /**
     * Updates the position and state of the zombie in the game.
     */
    @Override
    public void updateZombie() {
        this.control.updateZombie();
    }

    @Override
    public int getWorldColC() {
        return this.control.getWorldCol();
    }

    @Override
    public int getWorldRowC() {
        return this.control.getWorldRow();
    }

    @Override
    public int getWorldWidthC() {
        return this.control.getWorldWidth();
    }

    @Override
    public int getWorldHightC() {
        return this.control.getWorldHight();
    }

    @Override
    public int getPersonMapX() {
        return this.control.getPersonMapX();
    }

    @Override
    public int getPersonMapY() {
        return this.control.getPersonMapY();
    }

    @Override
    public void updatePerson() {
        this.control.updatePerson();
    }

    @Override
    public void getPersonFromMapC(final List<Integer> personlist, final List<Pair<Integer, Integer>> coords,
            final Integer strenght) {
        this.control.getPersonFromMap(personlist, coords, strenght);
    }

    @Override
    public void setCoordinatesOfPersonInListC(final int index, final int x, final int y) {
        this.control.setCoordinatesOfPersonInList(index, x, y);
    }

    @Override
    public void removePersonFromListC(final int index) {
        this.control.removePersonFromList(index);
    }

    @Override
    public List<Integer> getPersonListC() {
        return this.control.getPersonList();
    }

    @Override
    public List<Integer> personIndexListC() {
        return this.control.personList();
    }

    /**
     * Gets the strength of the zombie.
     *
     * @return The strength of the zombie.
     */
    @Override
    public int getStrenght() {
        return this.control.getStrenght();
    }

    /**
     * Increases the strength of the zombie with its speed.
     */
    @Override
    public void increaseStrenght() {
        this.control.increaseStrenght();
    }

    /**
     * Sets the strength of the zombie to the specified value.
     */
    @Override
    public void setStrenght(final int strenght) {
        this.control.setStrenght(strenght);
    }

    /**
     * Gets the x-coordinate of the zombie on the screen.
     *
     * @return The x-coordinate of the zombie on the screen.
     */
    @Override
    public int getZombieScreenX() {
        return this.control.getZombieScreenX();
    }

    /**
     * Gets the y-coordinate of the zombie on the screen.
     *
     * @return The y-coordinate of the zombie on the screen.
     */
    @Override
    public int getZombieScreenY() {
        return this.control.getZombieScreenY();
    }

    /**
     * Signals that the jump action has been initiated for the zombie.
     */
    @Override
    public void jumpPress() {
        this.control.jumpPress();
    }

    /**
     * Updates the jump action for the zombie.
     */
    @Override
    public void updateJumpZombie() {
        this.control.updateJumpZombie();
    }

    /**
     * Checks if the zombie is currently jumping.
     *
     * @return true if the zombie is jumping, false otherwise.
     */
    @Override
    public boolean isJumping() {
        return this.control.isJumping();
    }

    @Override
    public List<Integer> obstacleIndexListC() {
        return this.control.obstacleList();
    }

    @Override
    public void setEndPosC(final int endX) {
        this.control.setEndPos(endX);
    }

    @Override
    public boolean isWinC() {
        return this.control.isWin();
    }

    @Override
    public void fillBombListFromMapC(final List<Integer> bomblist, final List<Pair<Integer, Integer>> coords,
            final Integer strength) {
        this.control.fillBombListFromMap(bomblist, coords, strength);
    }

    @Override
    public List<Bomb> getBombListC() {
        return this.control.getBombList();
    }

    @Override
    public List<Breakable> getBreakableListC() {
        return this.control.getBreakableList();
    }

    @Override
    public void setCoordinatesOfBombInListC(final int index, final int x, final int y) {
        this.control.setCoordinatesOfBombInList(index, x, y);
    }

    @Override
    public void removeBombFromListC(final int index) {
        this.control.removeBombFromList(index);
    }

    @Override
    public void fillBreakableListFromMapC(final List<Integer> breakablelist, final List<Pair<Integer, Integer>> coords,
            final Integer strength) {
        this.control.fillBreakableListFromMap(breakablelist, coords, strength);
    }

    @Override
    public void collisionZombieOstacleC() {
        this.control.collisionZombieObstacle();
    }

    @Override
    public boolean isGameOver() {
        return this.control.isGameOver();
    }

    @Override
    public void collisionZombiePersonsC() {
        this.control.collisionZombiePersons();
    }

    @Override
    public boolean isNotEnoughC() {
        return this.control.isNotEnough();
    }

    @Override
    public boolean isStrenghtZeroC() {
        return this.control.isStrenghtZero();
    }
}
