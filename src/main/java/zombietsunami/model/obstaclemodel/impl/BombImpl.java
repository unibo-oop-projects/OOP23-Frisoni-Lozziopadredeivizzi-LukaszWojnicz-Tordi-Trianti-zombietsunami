package zombietsunami.model.obstaclemodel.impl;

import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Obstacle;

/**
 * Class implementing the Bomb functionalities.
 * 
 * @see zombietsunami.model.obstaclemodel.api.Bomb
 * @see zombietsunami.model.obstaclemodel.api.Obstacle
 */
public class BombImpl implements Bomb, Obstacle {

    private ObstacleEntity entity = new ObstacleEntity();

    private final int damage = 1; //for test
    private final int testcoord = 350; //test

    /**
     * Constructor that sets the default values for the Bomb.
     */
    public BombImpl() {
        setDefaultValue();
    }

    /**
     * Sets the default values for the Bomb.
     */
    private void setDefaultValue() {
        entity.setX(testcoord); //just for test
        entity.setY(testcoord);
    }

    /**
     * Updates the Bomb.
     */
    @Override
    public void update() {

    }

    /**
     * Method which sends the game into a state of gameover
     * if the zombie touches the bomb.
     */
    @Override
    public void hit() {
        //Gameover
    }

    /**
     * Gets the X coordinate of the Bomb.
     */
    @Override
    public int getX() {
        return this.entity.getX();
    }

    /**
     * Gets the Y coordinate of the Bomb.
     */
    @Override
    public int getY() {
        return this.entity.getY();
    }
}
