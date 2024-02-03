package zombieTsunami.model.zombieModel.impl;

import zombieTsunami.model.EntityImpl;
import zombieTsunami.model.zombieModel.api.jumpZombie;

public class jumpZombieImpl implements jumpZombie {
    private boolean spriteZombie = false;
    private boolean jumping = false;
    private int initialY = 1;
    private int maxY = 10;
    private boolean down = false;
    private int counterJump;
    private EntityImpl entity;
    private int counterSprite;

    public jumpZombieImpl(EntityImpl entity) {
        this.entity = entity;
    }

    public boolean getSpriteZombie() {
        return spriteZombie;
    }

    public void setMapY(int mapY) {
        this.entity.setY(mapY);
    }

    public void decreaseZombieMapY() {
        entity.setY(entity.getY() - entity.getSpeed());
    }

    @Override
    public void jumpPress() {
        spriteZombie = true;
        jumping = true;
        initialY = entity.getY();// imposto la y in cui deve tornare
        maxY = initialY - maxY;// imposto l'altezza massima
    }

    public void decreaseZombieY() {
        if (entity.getY() >= initialY) {
            setMapY(entity.getY() - entity.getSpeed());
            down = false;
            jumping = true;// ha finito il jump e ora può ripremerlo
        }
        counterJump++;

    }

    public void updateJumpZombie() {
        if (jumping) {// se sta saltando e spriteZombie è true
            jumpUp();// gestire salto verso l'alto
        }

        if (down) {
            jumpDown();
        }
    }

    private void jumpDown() {
        if (entity.getY() < initialY) {// se la y dello zombie è maggiore della maxY(massima y verso l'alto)
            setMapY(entity.getY() + entity.getSpeed());
        } else {
            jumping=false;
        }
    }

    private void jumpUp() {
        if (entity.getY() >= maxY) {// se la y dello zombie è maggiore o uguale della maxY(massima y verso l'alto)
            setMapY(entity.getY() - entity.getSpeed());
        } else {
            down = true;
        }
    }

    public boolean getJumping() {
        return jumping;
    }

}