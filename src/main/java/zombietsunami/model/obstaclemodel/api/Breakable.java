package zombietsunami.model.obstaclemodel.api;

/**
 * Defines the Breakable object.
 */
public interface Breakable {

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
}
