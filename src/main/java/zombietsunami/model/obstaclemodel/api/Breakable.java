package zombietsunami.model.obstaclemodel.api;

/**
 * Defines the Breakable object.
 */
public interface Breakable {

    /**
     * Sets the X coordinate of the breakable.
     */
    void setX(int x);

    /**
     * Sets the Y coordinate of the breakable.
     */
    void setY(int y);

    /**
     * Sets the id of the breakable.
     * @param id the id of the breakable.
     */
    void setId(int id);

    /**
     * Gets the X coordinate of the Breakable.
     * @return the X coordinate of the Breakable.
     */
    int getX();

    /**
     * Gets the Y coordinate of the Breakable.
     * @return the Y coordinate of the Breakable.
     */
    int getY();

    /**
     * Checks if the zombie can break the obstacle.
     * @return true if the zombies force is greater than the obstacle one
     * false otherwise.
     * @param zombieForce the force of the zombie.
     */
    boolean canBreakObstacle(int zombieForce);

    /**
     * Gets the breakables id.
     * @return the breakable id.
     */
    int getId();

    /**
     * Updates the state of the Breakable.
     */
    void update();
}
