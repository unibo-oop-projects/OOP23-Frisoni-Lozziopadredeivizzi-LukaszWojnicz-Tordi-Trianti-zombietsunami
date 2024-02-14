package zombietsunami.model.zombiemodel.impl;

import zombietsunami.model.EntityImpl;
import zombietsunami.model.MapData;
import zombietsunami.model.zombiemodel.api.Zombie;

/**
 * Implementation of the Zombie interface, representing a zombie entity in the
 * Zombie Tsunami game.
 *
 * @see zombietsunami.model.EntityImpl
 * @see zombietsunami.model.zombiemodel.api.Zombie
 */
public class ZombieImpl implements Zombie {
    private final EntityImpl entity = new EntityImpl();
    private final JumpZombieImpl jumpZombie = new JumpZombieImpl(this.entity);
    private final int screenX;
    private final int screenY;
    private static final int NUM = 4;
    private static final int INITIALZOMBIE_X = 380;
    private static final int INITIALZOMBIE_Y = 450;
    private static final int INITIALZOMBIE_SPEED = 1;

    /**
     * Updates the zombie's position based on its speed.
     */
    public ZombieImpl() {
        this.screenX = MapData.getScreenW() / 2 - MapData.getTitSize() / 2;
        this.screenY = MapData.getScreenH() - (MapData.getTitSize() * 3);
        setDefaultValue();
    }

    private void setDefaultValue() {
        entity.setX(INITIALZOMBIE_X);
        entity.setY(INITIALZOMBIE_Y);
        entity.setSpeed(INITIALZOMBIE_SPEED);
    }

    /**
     * Updates the zombie's position based on its speed.
     */
    @Override
    public void update() {
        entity.setX(entity.getX() + entity.getSpeed());
    }

    /**
     * Gets the X-coordinate of the zombie on the map.
     *
     * @return the X-coordinate of the zombie.
     */
    @Override
    public int getX() {
        return entity.getX();
    }

    /**
     * Gets the Y-coordinate of the zombie on the map.
     *
     * @return the Y-coordinate of the zombie.
     */
    @Override
    public int getY() {
        return entity.getY();

    }

    /**
     * Gets the speed of the zombie.
     *
     * @return the speed of the zombie.
     */
    @Override
    public int getSpeed() {
        return entity.getSpeed();
    }

    /**
     * Gets the constant NUM.
     *
     * @return the constant NUM.
     */
    @Override
    public int getNumX() {
        return NUM;
    }

    /**
     * Gets the screen X-coordinate where the zombie is initially placed on the
     * screen.
     *
     * @return the screen X-coordinate.
     */
    @Override
    public int getScreenX() {
        return this.screenX;
    }

    /**
     * Gets the screen Y-coordinate where the zombie is initially placed on the
     * screen.
     *
     * @return the screen Y-coordinate.
     */
    @Override
    public int getScreenY() {
        return this.screenY;
    }

    /**
     * Gets the strength of the zombie.
     *
     * @return the strength of the zombie.
     */
    @Override
    public int getStrenght() {
        return this.entity.getStrenght();
    }

    /**
     * Increases the strength of the zombie by one.
     */
    @Override
    public void increaseStrenght() {
        this.entity.increaseStrenght();
    }

    /**
     * Sets the strength of the zombie.
     *
     * @param strenght the new strength of the zombie.
     */
    @Override
    public void setStrenght(final int strenght) {
        this.entity.setStrenght(strenght);
    }

    /**
     * Initiates a jump action for the zombie.
     */
    @Override
    public void jumpPress() {
        this.jumpZombie.jumpPress();
    }

    /**
     * Updates the jump action for the zombie.
     */
    @Override
    public void updateJumpZombie() {
        this.jumpZombie.updateJumpZombie();
    }

    /**
     * Checks if the zombie is currently jumping.
     *
     * @return true if the zombie is jumping.
     */
    @Override
    public boolean isJumping() {
        return jumpZombie.isJumping();
    }
}
