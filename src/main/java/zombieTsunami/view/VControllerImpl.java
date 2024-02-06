package zombieTsunami.view;

import java.util.List;

import zombieTsunami.api.Controller;
import zombieTsunami.api.Pair;
import zombieTsunami.view.api.VController;

public final class VControllerImpl implements VController{
    
    private Controller control;

    @Override
    public void set(final Controller c) {
        this.control = c;

        View.start(this, getScreenWC(), getScreenHC());
    }

    @Override
    public int getScreenWC() {
        return this.control.getScreenWidth();
    }

    @Override
    public int getScreenHC() {
        return this.control.getScreenHigh();
    }

    @Override
    public int getFPSC() {
        return this.control.getFPS();
    }

    @Override
    public int getZombieMapX() {
        return this.control.getZombieMapX();
    }

    @Override
    public int getZombieMapY() {
        return this.control.getZombieMapY();
    }

    @Override
    public int getSpeed() {
        return this.control.getSpeed();
    }

    @Override
    public int getNumX() {
        return this.control.getNumX();
    }

    @Override
    public List<String> tileElementsC() {
        return this.control.tileElements();
    }

    @Override
    public int screenColC() {
        return this.control.getScreenCol();
    }

    @Override
    public int screenRowC() {
        return this.control.getScreenRow();
    }

    @Override
    public int titleSizeC() {
        return this.control.getTitleSize();
    }

    @Override
    public List<Pair<Integer, Integer>> screenTilePosC() {
        return this.control.screenTilePos();
    }

    @Override
    public List<Integer> mapIndexListC() {
        return this.control.mapList();
    }

    @Override
    public void updateZombie() {
        this.control.updateZombie();
    }

    @Override
    public int getWorldColC() {
        return this.control.getWorldCol();
    }

    @Override
    public int getWorldRowC() {
        return this.control.getWorldRow();
    }

    @Override
    public int getWorldWidthC() {
        return this.control.getWorldWidth();
    }

    @Override
    public int getWorldHightC() {
        return this.control.getWorldHight();
    }

    @Override
    public int getPersonMapX() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonMapX'");
    }

    @Override
    public int getPersonMapY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonMapY'");
    }

    @Override
    public void updatePerson() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePerson'");
    }

    @Override
    public int getStrenght() {
        return this.control.getStrenght();
    }

    @Override
    public void increaseStrenght() {
        this.control.increaseStrenght();
    }

    @Override
    public void setStrenght(int strenght) {
        this.control.setStrenght(strenght);
    }

    @Override
    public int getZombieScreenX() {
        return this.control.getZombieScreenX();
    }

    @Override
    public int getZombieScreenY() {
        return this.control.getZombieScreenY();
    }

    @Override
    public void jumpPress() {
        this.control.jumpPress();
    }

    @Override
    public void updateJumpZombie() {
        this.control.updateJumpZombie();
    }

    @Override
    public boolean getJumping() {
        return this.control.getJumping();
    }

    @Override
    public int getObstacleMapX() {
        return this.control.getObstacleMapX();
    }

    @Override
    public int getObstacleMapY() {
        return this.control.getObstacleMapY();
    }

    @Override
    public void updateObstacle() {
        this.control.updateObstacle();
    }

}
