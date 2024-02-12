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

    private int id;
    private int damage = 1;

    /**
     * Constructor that sets the default values for the Bomb.
     */
    public BombImpl() {

    }

    /**
     * Gets the bomb Id.
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
    public void setX(final int x) {
        this.entity.setX(x);
    }

    /**
     * Sets the Y coordinate of the Bomb.
     */
    @Override
    public void setY(final int y) {
        this.entity.setY(y);
    }

    /**
     * Sets the damage of the bomb.
     * @param damage the damage of the bomb.
     */
    @Override
    public void setDamage(final int damage) {
        if (damage > 0) {
            this.damage = damage;
        }
    }

    /**
     * Sets the id of the bomb.
     * @param id the id of the bomb.
     */
    @Override
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * Returns the damage of the bomb.
     * @return the bombs damage.
     */
    @Override
    public int getDamage() {
        return this.damage;
    }
}
