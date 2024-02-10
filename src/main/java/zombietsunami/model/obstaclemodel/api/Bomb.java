package zombietsunami.model.obstaclemodel.api;

import zombietsunami.api.Controller;

/**
 * Defines the Bomb object.
 */
public interface Bomb {

    /**
     * Sets the damage of the bomb.
     * @param damage amount of damage that deals to the zombie.
     */
    void setDamage(int damage);

    /**
     * If the bomb hits the zombie, it decreases the zombies' strength.
     * @param controller the controller.
     */
    void hit(Controller controller);

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
     */
    void setX(int x);

    /**
     * Sets the Y coordinate of the Bomb.
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
