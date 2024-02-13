package zombietsunami.model.obstaclemodel.impl;

import java.util.ArrayList;
import java.util.List;

import zombietsunami.Pair;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.api.ObstacleManager;

/**
 * Class that manages everything about Obstacles.
 */
public class ObstacleManagerImpl implements ObstacleManager {

    private List<Bomb> bombList = new ArrayList<Bomb>();
    private List<Breakable> breakableList = new ArrayList<Breakable>();

    /**
     * Adds a bomb into the bomb list.
     * @param bomb the bomb that needs to be added.
     */
    @Override
    public void addBomb(final Bomb bomb) {
        if (bomb != null) {
            bombList.add(bomb);
        }
    }

    /**
     * Adds a breakable into the breakable list.
     * @param breakable the breakable that needs to be added.
     */
    @Override
    public void addBreakable(final Breakable breakable) {
        if (breakable != null) {
            breakableList.add(breakable);
        }
    }

    /**
     * Gets the list of bombs from the map.
     * @param bomblist the list of the bombs.
     * @param coords the list of the coordinates of every single bomb.
     * @param strength the zombies strength.
     */
    @Override
    public void getBombsFromMap(final List<Integer> bomblist, 
        final List<Pair<Integer, Integer>> coords, final Integer strength) {
        bombList = new ArrayList<>();
        for (int i = 0; i < bomblist.size(); i++) {
            if (bomblist.get(i) == 1 && coords.get(i) != null) {
                Bomb bomb = new BombImpl();

                bomb.setX(coords.get(i).getX());
                bomb.setY(coords.get(i).getY());
                bomb.setDamage(Math.round(strength * 0.5f));

                bombList.add(i, bomb);
            } else {
                bombList.add(i, null);
            }
        }
    }

    /**
     * Gets the list of breakables from the map.
     * @param breakablelist the list of the breakables.
     * @param coords the list of the coordinates of every single breakable.
     * @param strength the zombies strength.
     */
    @Override
    public void getBreakablesFromMap(final List<Integer> breakablelist, 
        final List<Pair<Integer, Integer>> coords, final Integer strength) {
        breakableList = new ArrayList<>();
        for (int i = 0; i < breakablelist.size(); i++) {
            if (breakablelist.get(i) == 2 && coords.get(i) != null) {
                Breakable breakable = new BreakableImpl(3);

                breakable.setX(coords.get(i).getX());
                breakable.setY(coords.get(i).getY());

                breakableList.add(i, breakable);
            } else {
                breakableList.add(i, null);
            }
        }
    }

    /**
     * Returns the bomb list.
     * @return the bomb list.
     */
    @Override
    public List<Bomb> getBombList() {
        return bombList;
    }

    /**
     * Returns the breakable list.
     * @return the breakable list.
     */
    @Override
    public List<Breakable> getBreakableList() {
        return breakableList;
    }

    /**
     * Sets the coordinates of the "index" bomb.
     * @param index index of the bomb in the list.
     * @param x X coordinate.
     * @param y Y coordinate.
     */
    @Override
    public void setCoordinatesOfBombInList(final int index, final int x, final int y) {
        bombList.get(index).setX(x);
        bombList.get(index).setY(y);
    }

    /**
     * Removes the "index" bomb from the list.
     * @param index the index of the bomb in the list.
     */
    @Override
    public void removeBombFromList(final int index) {
        bombList.set(index, null);
    }

    /**
     * Removes the "index" breakable from the list.
     * @param index the index of the breakable in the list.
     */
    @Override
    public void removeBreakableFromList(final int index) {
        breakableList.set(index, null);
    }

    /**
     * Sets the coordinates of the "index" breakable.
     * @param index index of the breakable in the list.
     * @param x X coordinate.
     * @param y Y coordinate.
     */
    @Override
    public void setCoordinatesOfBreakableInList(final int index, final int x, final int y) {
        breakableList.get(index).setX(x);
        breakableList.get(index).setY(y);
    }

    /**
     * Method that checks if the zombie can break the obstacle.
     * @return true if the zombies force is greater than the obstacle one
     * false otherwise.
     * @param zombieForce the force of the zombie.
     * @param index the index of the breakable in the list.
     */
    @Override
    public boolean canBreakObstacle(final int zombieForce, final int index) {
        if (breakableList.get(index).getMinForce() <= zombieForce) {
            return true;
        }
        return false;
    }
}
