package zombietsunami.model.obstaclemodel.api;

import java.util.List;

import zombietsunami.api.Pair;

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
     * Method that allows to retrieve a bomb by its id.
     * @param id the bombs id.
     * @return the bomb.
     */
    Bomb getBombById(int id);

    /**
     * Method that allows to retrieve a breakable by its id.
     * @param id the breakables id.
     * @return the breakable.
     */
    Breakable getBreakableById(int id);

    /**
     * Method that allows to retrieve a bomb by its X and Y coords.
     * @param x the X coordinate of the bomb.
     * @param y the Y coordinate of the bomb.
     * @return the bomb.
     */
    Bomb getBombByCoordinates(int x, int y);

    /**
     * Method that allows to retrieve a breakable by its X and Y coords.
     * @param x the X coordinate of the breakable.
     * @param y the Y coordinate of the breakable.
     * @return the breakable.
     */
    Breakable getBreakableByCoordinates(int x, int y);
}
