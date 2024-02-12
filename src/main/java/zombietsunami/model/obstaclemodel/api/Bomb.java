package zombietsunami.model.obstaclemodel.api;

/**
 * Defines the Bomb object.
 */
public interface Bomb {

    /**
     * Sets the id of the bomb.
     * @param id the id of the bomb.
     */
    void setId(int id);

    /**
     * Sets the damage of the bomb.
     * @param damage amount of damage that deals to the zombie.
     */
    void setDamage(int damage);

    /**
     * Gets the bombs damage.
     * @return the damage of the bomb.
     */
    int getDamage();

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
     * Sets the X coordinate of the Bomb.
     * @param x the X coordinate of the bomb.
     */
    void setX(int x);

    /**
     * Sets the Y coordinate of the Bomb.
     * @param y the Y coordinate of the bomb.
     */
    void setY(int y);

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
