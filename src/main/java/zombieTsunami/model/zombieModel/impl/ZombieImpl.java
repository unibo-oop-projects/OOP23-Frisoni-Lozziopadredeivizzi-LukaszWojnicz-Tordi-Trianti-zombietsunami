package zombieTsunami.model.zombieModel.impl;

import zombieTsunami.model.EntityImpl;
import zombieTsunami.model.MapData;
import zombieTsunami.model.zombieModel.api.Zombie;


public class ZombieImpl implements Zombie{
    private EntityImpl entity = new EntityImpl();
    private final int NUM=4;

    private final int screenX;
    private final int screenY;
    private final int initialZombieX=360;
    private final int initialZombieY=300;
    private final int initialZombieSpeed=1;

    public ZombieImpl() {
        this.screenX =MapData.getScreenW() / 2 - (MapData.getTitSize() / 2);
        this.screenY = MapData.getScreenH() / 2 - (MapData.getTitSize() / 2);
        setDefaultValue();
    }
    private void setDefaultValue() {
        entity.setX(initialZombieX);
        entity.setY(initialZombieY);
        entity.setSpeed(initialZombieSpeed);
    }
    @Override
    public void jump() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jump'");
    }

    @Override
    public void update() {
        entity.setX(entity.getX()+entity.getSpeed());
    }
    @Override
    public int getX() {
        return entity.getX();
    }

    @Override
    public int getY() {
        return entity.getY();
    
    }
    @Override
    public int getSpeed() {
        return entity.getSpeed();
    }
    @Override
    public int getNumX() {
        return NUM;
    }
    public int getScreenX(){
        return this.screenX;
    }

    public int getScreenY(){
        return this.screenY;
    }
    @Override
    public int getStrenght() {
        return this.entity.getStrenght();
    }
    @Override
    public void increaseStrenght() {
        this.entity.increaseStrenght();
    }
    @Override
    public void setStrenght(int strenght) {
        this.entity.setStrenght(strenght);
    }
   
    
}
