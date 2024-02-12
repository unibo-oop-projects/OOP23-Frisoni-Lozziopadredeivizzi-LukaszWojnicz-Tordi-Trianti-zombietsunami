package zombietsunami.model.obstaclemodel.impl;

import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.api.Obstacle;

/**
 * Class implementing the Bomb functionalities.
 * 
 * @see zombietsunami.model.obstaclemodel.api.Breakable
 * @see zombietsunami.model.obstaclemodel.api.Obstacle
 */
public class BreakableImpl extends ObstacleEntity implements Breakable, Obstacle {

    private ObstacleEntity entity = new ObstacleEntity();

    private int id;
    private final int minforce;

    /**
     * Constructor that sets the default values for the Breakable.
     * 
     * @param minforce the minimum force to break the Breakable.
     */
    public BreakableImpl(final int minforce) {
        this.minforce = minforce;
    }

    /**
     * Updates the Breakable.
     */
    @Override
    public void update() {
        //if collides, checks if canBreakObstacle()
    }

    /**
     * Method that checks if the zombie can break the obstacle.
     * @return true if the zombies force is greater than the obstacle one
     * false otherwise.
     * @param zombieForce the force of the zombie.
     */
    @Override
    public boolean canBreakObstacle(final int zombieForce) {
        if (this.minforce <= zombieForce) {
            return true;
        }
        return false;
    }

    /**
     * Gets the X coordinate of the Breakable.
     */
    @Override
    public int getX() {
        return this.entity.getX();
    }

    /**
     * Gets the Y coordinate of the Breakable.
     */
    @Override
    public int getY() {
        return this.entity.getY();
    }

    /**
     * Sets the X coordinate of the Breakable.
     */
    @Override
    public void setX(final int x) {
        this.entity.setX(x);
    }

    /**
     * Sets the Y coordinate of the Breakable.
     */
    @Override
    public void setY(final int y) {
        this.entity.setY(y);
    }

    /**
     * Returns the breakables id.
     * @return the breakable id.
     */
    @Override
    public int getId() {
        return this.id;
    }

    /**
     * Sets the id of the breakable.
     * @param id the id of the breakable.
     */
    @Override
    public void setId(final int id) {
        this.id = id;
    }
}
