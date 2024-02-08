package zombietsunami.model.obstaclemodel.impl;

import java.util.ArrayList;
import java.util.List;

import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.api.ObstacleManager;

/**
 * Class that manages everything about Obstacles.
 */
public class ObstacleManagerImpl implements ObstacleManager {

    private List<Bomb> bombList;
    private List<Breakable> breakableList;

    /**
     * Method that allows to retrieve a bomb by its id.
     * @param id the bombs id.
     * @return the bomb.
     */
    @Override
    public Bomb getBombById(int id) {
        for (Bomb bomb : bombList) {
            if(bomb.getId() == id) {
                return bomb;
            }
        }
        return null;
    }

    /**
     * Method that allows to retrieve a breakable by its id.
     * @param id the breakables id.
     * @return the breakable.
     */
    @Override
    public Breakable getBreakableById(int id) {
        for (Breakable breakable : breakableList) {
            if(breakable.getId() == id) {
                return breakable;
            }
        }
        return null;
    }

    /**
     * Method that allows to retrieve a bomb by its X and Y coords.
     * @param x the X coordinate of the bomb.
     * @param y the Y coordinate of the bomb.
     * @return the bomb.
     */
    @Override
    public Bomb getBombByCoordinates(int x, int y) {
        for (Bomb bomb : bombList) {
            if(bomb.getX() == x && bomb.getY() == y) {
                return bomb;
            }
        }
        return null;
    }

    /**
     * Method that allows to retrieve a breakable by its X and Y coords.
     * @param x the X coordinate of the breakable.
     * @param y the Y coordinate of the breakable.
     * @return the breakable.
     */
    @Override
    public Breakable getBreakableByCoordinates(int x, int y) {
        for (Breakable breakable : breakableList) {
            if(breakable.getX() == x && breakable.getY() == y) {
                return breakable;
            }
        }
        return null;
    }
    
}
