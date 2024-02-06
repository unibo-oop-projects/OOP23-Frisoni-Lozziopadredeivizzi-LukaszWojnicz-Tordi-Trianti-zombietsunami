package zombieTsunami.model.zombieModel.impl;

import zombieTsunami.model.EntityImpl;
import zombieTsunami.model.zombieModel.api.JumpZombie;

public class JumpZombieImpl implements JumpZombie {
    private boolean spriteZombie = false;
    private boolean jumping = false;
    private boolean jumpingDown = false;
    private boolean jumpUp = false;
    private int initialY;
    private int maxY;
    private int counterJump;
    private int counterSprite;
    private static final int MAX_Y_VALUE = 90;
    private final EntityImpl entity;

    /**
     * Constructs a jumpZombieImpl with the specified EntityImpl as the underlying
     * entity.
     * @param entity the underlying entity for the jumpZombie behavior.
     */
    public JumpZombieImpl(final EntityImpl entity) {
        this.entity = entity;
    }

    /**
     * Gets the current state of the spriteZombie.
     * @return true if spriteZombie is active.
     */
    public boolean getSpriteZombie() {
        return spriteZombie;
    }

    private void setMapY(final int mapY) {
        this.entity.setY(mapY);
    }

    private void decreaseZombieMapY() {
        entity.setY(entity.getY() - entity.getSpeed());
    }

    private void increaseZombieMapY() {
        entity.setY(entity.getY() + entity.getSpeed());
    }

    /**
     * Initiates the jump action for the zombie.
     */
    @Override
    public void jumpPress() {
        spriteZombie = true;
        jumping = true;
        jumpUp = true;
        initialY = entity.getY();
        maxY = initialY - MAX_Y_VALUE;
    }

    /**
     * Updates the jump action for the zombie.
     */
    public void updateJumpZombie() {
        if (jumping) {
            if (jumpUp) {
                jumpUp();
            } else if (jumpingDown) {
                jumpDown();
            }
        }
    }

    private void jumpDown() {
        if (entity.getY() < initialY) {
            increaseZombieMapY();
        } else {
            jumping = false;
            jumpingDown = false;
        }
    }

    private void jumpUp() {
        if (entity.getY() > maxY) {
            decreaseZombieMapY();
        } else {
            jumpingDown = true;
            jumpUp = false;
        }
    }

    /**
     * Gets the current jumping state of the zombie.
     * @return true if the zombie is currently jumping.
     */
    public boolean getJumping() {
        return jumping;
    }
}