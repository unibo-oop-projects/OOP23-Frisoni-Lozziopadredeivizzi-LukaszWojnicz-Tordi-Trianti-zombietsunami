package zombietsunami.model.obstaclemodel.impl;

import zombietsunami.api.Controller;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Obstacle;
import zombietsunami.model.zombiemodel.api.Zombie;

/**
 * Class implementing the Bomb functionalities.
 * 
 * @see zombietsunami.model.obstaclemodel.api.Bomb
 * @see zombietsunami.model.obstaclemodel.api.Obstacle
 */
public class BombImpl implements Bomb, Obstacle {

    private ObstacleEntity entity = new ObstacleEntity();

    private int id;
    private int damage = 1;

    /**
     * Constructor that sets the default values for the Bomb.
     */
    public BombImpl() {

    }

    /**
     * Gets the bomb Id.
     * @param bomb the bomb object.
     * @return the bomb's Id.
     */
    @Override
    public int getId() {
        return this.id;
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

    /**
     * Sets the X coordinate of the Bomb.
     */
    @Override
    public void setX(int x) {
        this.entity.setX(x);
    }

    /**
     * Sets the Y coordinate of the Bomb.
     */
    @Override
    public void setY(int y) {
        this.entity.setY(y);
    }

    @Override
    public void setDamage(int damage) {
        if(damage > 0){
            this.damage = damage;
        }
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
