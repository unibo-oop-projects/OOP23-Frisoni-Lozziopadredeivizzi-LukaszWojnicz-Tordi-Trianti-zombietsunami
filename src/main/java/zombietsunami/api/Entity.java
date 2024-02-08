package zombietsunami.api;

/**
 * This interface represents an entity in the Zombie Tsunami game.
 */
public interface Entity {
    /**
     * @return The x-coordinate of the zombie.
     */
    int getX();

    /**
     * @return The y-coordinate of the zombie.
     */
    int getY();

    /**
     * @return The speed of the zombie.
     */
    int getSpeed();

    /**
     * @return The strength of the zombie.
     */
    int getStrenght();

    /**
     * Increases the strength of the zombie with the speed value.
     */
    void increaseStrenght();

    /**
     * Sets the strength of the zombie.
     * 
     * @param strenght The new strength value for the zombie.
     */
    void setStrenght(int strenght);

    /**
     * Sets the X-coordinate of zombie.
     * 
     * @param x The new X-coordinate value for the zombie.
     */
    void setX(int x);

    /**
     * Sets the Y-coordinate of zombie.
     * 
     * @param y The new Y-coordinate value for the zombie.
     */
    void setY(int y);
}
