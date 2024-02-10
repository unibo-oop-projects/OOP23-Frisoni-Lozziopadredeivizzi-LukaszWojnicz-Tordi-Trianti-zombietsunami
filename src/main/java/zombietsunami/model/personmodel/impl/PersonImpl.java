package zombietsunami.model.personmodel.impl;

import zombietsunami.api.Controller;
import zombietsunami.model.EntityImpl;
import zombietsunami.model.personmodel.api.Person;

/** 
 * Class implementing the Person functionalities.
 * 
 * @see zombietsunami.model.personmodel.api.Person
 * @see zombietsunami.model.EntityImpl
*/
public class PersonImpl implements Person {
    private final EntityImpl entity = new EntityImpl();

    private static int nextId = 0;

    private final int id;
    private int increase;
    
    /** 
     * Constructor that sets default values of the Person.
    */
    public PersonImpl() {
        this.id = nextId;
        nextId++;
    }

    /**
     * Gets the Person Id.
     * @return the Person's Id.
     */
    @Override
    public int getId() {
        return this.id;
    }

    /**
     * Sets the Increase of the Person
     */
    @Override
    public void setIncrease(int increase) {
       if(increase > 0){
            this.increase = increase ;
       }
    }

    /**
     * Method that allowsto continue the game if the Zombie
     * touches the Person
     * @param controller the controller
     */
    @Override
    public void hit(Controller controller) {
        controller.setStrenght(controller.getStrenght() + increase);
    }

    /**
     * Gets the X coordinate of the Person
     */
    @Override
    public int getX() {
        return this.entity.getX();
    }

    /**
     * Gets the Y coordinate of the Person
     */
    @Override
    public int getY() {
       return this.entity.getY();
    }

    /**
     * Sets the X coordinate of the Person
     */
    @Override
    public void setX(int x) {
        this.entity.setX(x);
    }

    /**
     * Sets the Y coordinate of the Person
     */
    @Override
    public void setY(int y) {
        this.entity.setY(y);
    }

}
