package zombietsunami.model.obstaclemodel.api;

import java.util.List;

import zombietsunami.api.Controller;

/**
 * Interface whose purpose is to manage all obstacles.
 */
public interface ObstacleManager {

    /**
     * Returns the list of bombs from the map.
     * @param controller the controller.
     */
    void getBombsFromMap(Controller controller);

    /**
     * Returns the list of breakables from the map.
     * @param controller the controller.
     */
    void getBreakablesFromMap(Controller controller);

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
    Bomb getBombById(final int id);

    /**
     * Method that allows to retrieve a breakable by its id.
     * @param id the breakables id.
     * @return the breakable.
     */
    Breakable getBreakableById(final int id);

    /**
     * Method that allows to retrieve a bomb by its X and Y coords.
     * @param x the X coordinate of the bomb.
     * @param y the Y coordinate of the bomb.
     * @return the bomb.
     */
    Bomb getBombByCoordinates(final int x, final int y);

    /**
     * Method that allows to retrieve a breakable by its X and Y coords.
     * @param x the X coordinate of the breakable.
     * @param y the Y coordinate of the breakable.
     * @return the breakable.
     */
    Breakable getBreakableByCoordinates(final int x, final int y);
}
