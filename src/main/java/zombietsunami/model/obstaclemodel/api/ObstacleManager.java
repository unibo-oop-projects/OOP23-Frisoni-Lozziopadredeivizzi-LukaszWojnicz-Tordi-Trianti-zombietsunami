package zombietsunami.model.obstaclemodel.api;

import java.util.List;

import zombietsunami.Pair;

/**
 * Interface whose purpose is to manage all obstacles.
 */
public interface ObstacleManager {

    /**
     * Removes the "index" breakable from the list.
     * @param index the index of the breakable in the list.
     */
    void removeBreakableFromList(int index);

    /**
     * Sets the coordinates of the "index" breakable.
     * @param index index of the breakable in the list.
     * @param x X coordinate.
     * @param y Y coordinate.
     */
    void setCoordinatesOfBreakableInList(int index, int x, int y);

    /**
     * Removes the "index" bomb from the list.
     * @param index the index of the bomb in the list.
     */
    void removeBombFromList(int index);

    /**
     * Sets the coordinates of the "index" bomb.
     * @param index index of the bomb in the list.
     * @param x X coordinate.
     * @param y Y coordinate.
     */
    void setCoordinatesOfBombInList(int index, int x, int y);

    /**
     * Returns the bomb list.
     * @return the bomb list.
     */
    List<Bomb> getBombList();

    /**
     * Returns the breakable list.
     * @return the breakable list.
     */
    List<Breakable> getBreakableList();

    /**
     * Gets the list of bombs from the map.
     * @param bomblist the list of the bombs.
     * @param coords the list of the coordinates of every single bomb.
     * @param strength the zombies strength.
     */
    void getBombsFromMap(List<Integer> bomblist, List<Pair<Integer, Integer>> coords, Integer strength);

    /**
     * Gets the list of breakables from the map.
     * @param breakablelist the list of the breakables.
     * @param coords the list of the coordinates of every single breakable.
     * @param strength the zombies strength.
     */
    void getBreakablesFromMap(List<Integer> breakablelist, List<Pair<Integer, Integer>> coords, Integer strength);

    /**
     * Adds a bomb into the bomb list.
     * @param bomb the bomb that needs to be added.
     */
    void addBomb(Bomb bomb);

    /**
     * Adds a breakable into the breakable list.
     * @param breakable the breakable that needs to be added.
     */
    void addBreakable(Breakable breakable);

    /**
     * Checks if the zombie can break the obstacle.
     * @return true if the zombies force is greater than the obstacle one
     * false otherwise.
     * @param zombieForce the force of the zombie.
     * @param index the index of the breakable in the list.
     */
    boolean canBreakObstacle(int zombieForce, int index);
}
