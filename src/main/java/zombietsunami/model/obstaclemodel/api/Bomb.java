package zombietsunami.model.obstaclemodel.api;

/**
 * Defines the Bomb object.
 */
public interface Bomb {

    /**
     * If the bomb hits the zombie, it decreases the zombies' strength.
     */
    void hit();

    /**
     * Gets the X coordinate of the Bomb.
     * @return the X coordinate of the Bomb.
     */
    int getX();

    /**
     * Gets the Y coordinate of the Bomb.
     * @return the Y coordinate of the Bomb.
     */
    int getY();

    /**
     * Updates the state of the Bomb.
     */
    void update();

    /**
     * Gets the bombs id.
     * @return the bomb id.
     */
    int getId();
}
