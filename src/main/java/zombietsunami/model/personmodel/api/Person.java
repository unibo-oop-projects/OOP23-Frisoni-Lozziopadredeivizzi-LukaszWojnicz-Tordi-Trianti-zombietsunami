package zombietsunami.model.personmodel.api;

import zombietsunami.api.Controller;

/**
 * Defines the Person object
 */
public interface Person {

    /**
     * Sets the increase of the Person.
     * @param increase amount of increase that deals to the Zombie.
     */
    void setIncrease(int increase);

    /**
     * If the Person hits the zombie, it increase the Zombie's strenght.
     * @param controller the controller.
     */
    void hit(Controller controller);

    /**
     * Gets the X coordinate of the Person.
     * @return the X coordinate of the Person.
     */
    int getX();

    /**
     * Gets the Y coordinate of the Person
     * @return the Y coordinate of the Person
     */
    int getY();

    /** 
     * Sets the X coordinate of the Person.
    */
    void setX(int x);

    /** 
     * Sets the Y coordinate of the Person.
    */
    void setY(int y);

    /**
     * Gets the Person id
     * @return the Person id
     */
    int getId();
}
