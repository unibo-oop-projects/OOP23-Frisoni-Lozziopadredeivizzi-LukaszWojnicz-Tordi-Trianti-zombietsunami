package zombietsunami.model.zombieModel.api;

/**
 * This interface represents a zombie in the Zombie Tsunami game.
 * Zombies move horizontally across the screen and may interact with the
 * environment.
 */
public interface Zombie {
    /**
     * Updates the state of the zombie.
     */
    void update();

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
     * @return The number to divide the x-screen.
     */
    int getNumX();

    /**
     * @return The x-coordinate of the zombie on the screen.
     */
    int getScreenX();

    /**
     * @return The y-coordinate of the zombie on the screen.
     */
    int getScreenY();

    /**
     * @return The strength of the zombie.
     */
    int getStrenght();

    /**
     * Increases the strength of the zombie.
     */
    void increaseStrenght();

    /**
     * Sets the strength of the zombie.
     * @param strength The new strength value for the zombie.
     */
    void setStrenght(int strenght);

    /**
     * Signals that the jump action has been initiated for the zombie.
     */
    void jumpPress();

    /**
     * Updates the jump state of the zombie.
     */
    void updateJumpZombie();

    /**
     * Checks if the zombie is currently jumping.
     * @return True if the zombie is jumping, false otherwise.
     */
    boolean getJumping();
}
