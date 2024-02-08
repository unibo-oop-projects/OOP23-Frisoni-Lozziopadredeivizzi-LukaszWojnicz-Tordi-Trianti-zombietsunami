package zombietsunami.model.obstaclemodel.api;

/**
 * Defines the Breakable object.
 */
public interface Breakable {

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
     * Method that breaks the obstacle.
     */
    void breakObstacle();

    /**
     * Gets the breakables id.
     * @return the breakable id.
     */
    int getId();
}
