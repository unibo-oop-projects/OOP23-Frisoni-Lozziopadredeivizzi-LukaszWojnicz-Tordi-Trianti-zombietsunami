package main.java.zombieTsunami.model.zombieModel.impl;


import java.awt.Graphics2D;

import main.java.zombieTsunami.model.MapData;
import main.java.zombieTsunami.model.zombieModel.api.Zombie;


public class ZombieImpl  extends Entity implements Zombie{
    private Entity entity = new Entity();
    private final int NUM=4;
    public ZombieImpl() {
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
    public void drawZombie(Graphics2D g2) {
        g2.drawImage(entity.getZombie(), entity.getX()/NUM, entity.getY(), MapData.getTitSize(),MapData.getTitSize(), null);
        g2.dispose();
    }
   
    
}
