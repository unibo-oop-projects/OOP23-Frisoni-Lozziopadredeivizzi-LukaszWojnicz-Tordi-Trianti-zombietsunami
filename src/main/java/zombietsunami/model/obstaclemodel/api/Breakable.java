package zombietsunami.model.obstaclemodel.api;

/**
 * Defines the Breakable object.
 */
public interface Breakable {

    /**
     * Sets the X coordinate of the breakable.
     * @param x the X coordinate.
     */
    void setX(int x);

    /**
     * Sets the Y coordinate of the breakable.
     * @param y the Y coordinate.
     */
    void setY(int y);

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
     * Returns the minimum force to break the obstacle.
     * @return the minimum force to break it the breakable.
     */
    int getMinForce();
}
