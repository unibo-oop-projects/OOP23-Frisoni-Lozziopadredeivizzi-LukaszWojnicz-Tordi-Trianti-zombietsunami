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

    private int id;
    private int increase = 1;

    /**
     * Constructor that sets the default values for the Person
     */
    public PersonImpl() {

    }

    /**
     * Gets the Person Id
     * @return the Person's Id
     */
    @Override
    public int getId() {
        return this.id;
    }

    /**
     * Updates the Person
     */
    @Override
    public void update() {

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

    /**
     * Sets the id
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }
}
