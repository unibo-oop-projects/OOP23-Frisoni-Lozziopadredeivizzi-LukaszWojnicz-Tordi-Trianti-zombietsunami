package zombietsunami.model;

import zombietsunami.api.Entity;

/**
 * This class represents a generic implementation of Pair<X, Y>, with
 * well-implemented methods
 * for getting and setting values, hashCode, equals, and toString.
 */
public class EntityImpl implements Entity {
    private int strenght;
    private int mapX, mapY;
    private int speed;

    /**
     * Returns the X coordinate of the entity on the map.
     * 
     * @return the X coordinate.
     */
    @Override
    public int getX() {
        return mapX;
    }

    /**
     * Sets the X coordinate of the entity on the map.
     * 
     * @param x the new X coordinate.
     */
    @Override
    public void setX(final int x) {
        this.mapX = x;
    }

    /**
     * Returns the Y coordinate of the entity on the map.
     * 
     * @return the Y coordinate.
     */
    @Override
    public int getY() {
        return mapY;
    }

    /**
     * Sets the Y coordinate of the entity on the map.
     * 
     * @param y the new Y coordinate.
     */
    @Override
    public void setY(final int y) {
        this.mapY = y;
    }

    /**
     * Returns the speed of the entity.
     * 
     * @return the speed.
     */
    @Override
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the entity.
     * 
     * @param speed the new speed.
     */
    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    /**
     * Returns the strength of the entity.
     * 
     * @return the strength.
     */
    @Override
    public int getStrenght() {
        return this.strenght;
    }

    /**
     * Increases the strength of the entity by one.
     */
    @Override
    public void increaseStrenght() {
        this.strenght++;
    }

    /**
     * Sets the strength of the entity.
     * 
     * @param strenght the new strength.
     */
    @Override
    public void setStrenght(final int strenght) {
        this.strenght = strenght;
    }
}
