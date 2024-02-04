package zombieTsunami.model.zombieModel.impl;

import zombieTsunami.model.EntityImpl;
import zombieTsunami.model.zombieModel.api.jumpZombie;

public class jumpZombieImpl extends EntityImpl implements jumpZombie {
    private boolean spriteZombie = false;
    private boolean jumping = false;
    private int initialY = 1;
    private int maxY = 90;
    private boolean jumpingDown = false;
    private boolean jumpUp = false;
    private int counterJump;
    private EntityImpl entity;
    private int counterSprite;

    public jumpZombieImpl(EntityImpl entity) {
        this.entity = entity;
    }

    public boolean getSpriteZombie() {
        return spriteZombie;
    }

    private void setMapY(int mapY) {
        this.entity.setY(mapY);
    }

    private void decreaseZombieMapY() {
        entity.setY(entity.getY() - entity.getSpeed());
    }

    private void increaseZombieMapY() {
        entity.setY(entity.getY() + entity.getSpeed());
    }

    @Override
    public void jumpPress() {
        //System.out.println("JUmpPress");
        spriteZombie = true;
        jumping = true;// general jump
        jumpUp = true;// jumpUp
        initialY = entity.getY();// imposto la y in cui deve tornare
        System.out.println("initialy: " + initialY);
        System.out.println("prima operazione :" +maxY);
        maxY = initialY - maxY;// imposto l'altezza massima
        System.out.println("dopo operazione :" +maxY);
    }

    public void updateJumpZombie() {
        if (jumping) {// se sta saltando e spriteZombie è true
            if (jumpUp) {
                jumpUp();// gestire salto verso l'alto
            } else if (jumpingDown) {
                jumpDown();
            }
        }
    }

    private void jumpDown() {
        if (entity.getY() < initialY) {// se la y dello zombie è maggiore della maxY(massima y verso l'alto)
            //System.out.println("jumpDown");
            increaseZombieMapY();
        } else {
            jumping = false;
            jumpingDown = false;
        }
    }

    private void jumpUp() {
        if (entity.getY() > maxY) {// se la y dello zombie è maggiore o uguale della maxY(massima y verso l'alto)
            decreaseZombieMapY();
        } else {
            jumpingDown = true;
            jumpUp = false;
        }
    }

    public boolean getJumping() {
        return jumping;
    }

}