package zombieTsunami.model.zombieModel.impl;

import zombieTsunami.model.EntityImpl;
import zombieTsunami.model.MapData;
import zombieTsunami.model.zombieModel.api.Zombie;

public class ZombieImpl implements Zombie {
    private EntityImpl entity = new EntityImpl();
    private static final int NUM = 4;

    private final int screenX;
    private final int screenY;
    private static final int initialZombieX = 360;
    private static final int initialZombieY = 300;
    private static final int initialZombieSpeed = 1;

    public ZombieImpl() {
        this.screenX = MapData.getScreenW() / 2 - (MapData.getTitSize() / 2);
        this.screenY = MapData.getScreenH() - (MapData.getTitSize() * 3);
        setDefaultValue();
    }

    private void setDefaultValue() {
        entity.setX(initialZombieX);
        entity.setY(initialZombieY);
        entity.setSpeed(initialZombieSpeed);
    }

    @Override
    public void jump() {
        this.entity.setY(entity.getY()+entity.getSpeed());
    }

    @Override
    public void update() {
        entity.setX(entity.getX() + entity.getSpeed());
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

    public int getScreenX() {
        return this.screenX;
    }

    public int getScreenY() {
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
