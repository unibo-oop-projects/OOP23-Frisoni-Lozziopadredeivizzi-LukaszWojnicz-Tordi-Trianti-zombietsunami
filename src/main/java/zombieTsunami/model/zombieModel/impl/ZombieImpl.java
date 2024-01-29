package main.java.zombieTsunami.model.zombieModel.impl;

import main.java.zombieTsunami.model.MapData;
import main.java.zombieTsunami.model.zombieModel.api.Zombie;


public class ZombieImpl implements Zombie{
    private EntityImpl entity = new EntityImpl();
    private final int NUM=4;

    private final int screenX;
    private final int screenY;

    public ZombieImpl() {
        this.screenX =MapData.getScreenW() / 2 - (MapData.getTitSize() / 2);
        this.screenY = MapData.getScreenH() / 2 - (MapData.getTitSize() / 2);
        setDefaultValue();
    }
    private void setDefaultValue() {
        entity.setX(100);
        entity.setY(250);
        entity.setSpeed(1);
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
   
    
}
