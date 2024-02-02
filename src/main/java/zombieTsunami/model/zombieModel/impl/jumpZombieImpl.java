package zombieTsunami.model.zombieModel.impl;

import zombieTsunami.model.EntityImpl;
import zombieTsunami.model.zombieModel.api.jumpZombie;

public class jumpZombieImpl implements jumpZombie{
    private boolean spriteZombie = false;
    private boolean jumping = false;
    private int initialY = 1;
    private int maxY = 10;
    private boolean decrease = false;
    private int counterJump;
    private EntityImpl entity;
    private int counterSprite;

    public jumpZombieImpl(EntityImpl entity) {
        this.entity = entity;
    }

    public boolean getSpriteZombie() {
        return spriteZombie;
    }

    @Override
    public void setMapY(int mapY){
        this.entity.setY(mapY);
    }

    @Override
    public void decreaseZombieMapY() {
        entity.setY(entity.getY()-entity.getSpeed());
    }

    @Override
    public void jumpPress() {
        spriteZombie = true;
        jumping = true;
        initialY = entity.getY();// imposto la y in cui deve tornare
        maxY = initialY - maxY;// imposto l'altezza massima
    }

    public boolean getDecresing() {
        return decrease;
    }

    public void jumpZombie() {
        if (counterJump > counterSprite) {// ogni "giro" aumenti la y in contemporanea della x
            decreaseZombieMapY();// diminuisce l'altezza con la velocità una volta
            System.out.println("couterSprite " + counterSprite);
            System.out.println("counterJump " + counterJump);
            counterSprite += counterSprite;
        }
        if (entity.getY() <= maxY) {// entro quando il mio zombie è alla altezza massima o oltre
            decrease = true;
            spriteZombie = false;
        }
    }

    public void decreaseZombieScreenY(){
        if (entity.getY()  >= initialY) {
            setMapY(entity.getY() - entity.getSpeed());
            decrease = false;
            jumping = true;// ha finito il jump e ora può ripremerlo
        }
        counterJump++;

    }


}