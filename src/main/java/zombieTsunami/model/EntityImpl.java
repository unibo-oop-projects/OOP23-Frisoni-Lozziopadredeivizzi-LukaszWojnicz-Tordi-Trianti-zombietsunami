package zombietsunami.model;

import zombietsunami.api.Entity;

/**
 * This class represents a generic implementation of Pair<X, Y>, with
 * well-implemented methods
 * for getting and setting values, hashCode, equals, and toString.
 *
 * @param strenght is the zombie variable for strength.
 * @param mapX     is the X-coordinate on the map.
 * @param mapY     is the Y-coordinate on the map.
 * @param speed    is the speed of the entity.
 */
public class EntityImpl implements Entity {
    private int strenght;
    private int mapX, mapY;
    private int speed;
    private static final int NUM = 4;

    /**
     * Returns the X coordinate of the entity on the map.
     *
     * @return the X coordinate.
     */
    public int getX() {
        return mapX;
    }

    /**
     * Sets the X coordinate of the entity on the map.
     *
     * @param x the new X coordinate.
     */
    public void setX(final int x) {
        this.mapX = x;
    }

    /**
     * Returns the Y coordinate of the entity on the map.
     *
     * @return the Y coordinate.
     */
    public int getY() {
        return mapY;
    }

    /**
     * Sets the Y coordinate of the entity on the map.
     *
     * @param y the new Y coordinate.
     */
    public void setY(final int y) {
        this.mapY = y;
    }

    /**
     * Returns the speed of the entity.
     *
     * @return the speed.
     */
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
     * Returns the constant NUM.
     *
     * @return the constant NUM.
     */
    public int getNumX() {
        return this.NUM;
    }

    /**
     * Returns the strength of the entity.
     *
     * @return the strength.
     */
    public int getStrenght() {
        return this.strenght;
    }

    /**
     * Increases the strength of the entity by one.
     */
    public void increaseStrenght() {
        this.strenght++;
    }

    /**
     * Sets the strength of the entity.
     *
     * @param strength the new strength.
     */
    public void setStrenght(final int strenght) {
        this.strenght = strenght;
    }
}
