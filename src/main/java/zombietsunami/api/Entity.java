package zombietsunami.api;
/**
 * This interface represents an entity in the Zombie Tsunami game.
 */
public interface Entity {
    /**
     * @return The x-coordinate of the entity.
     */
    int getX();

    /**
     * @return The y-coordinate of the entity.
     */
    int getY();

    /**
     * @return The speed of the entity.
     */
    int getSpeed();
    
    /**
     * @return The number to divides the x-screen.
     */
    int getNumX();

    /**
     * @return The strength of the entity.
     */
    int getStrenght();
    
    /**
     * Increases the strength of the entity with the speed value.
     */
    void increaseStrenght();

     /**
     * Sets the strength of the entity.
     * @param strength The new strength value for the entity.
     */
    void setStrenght(int strenght);
}
