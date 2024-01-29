package main.java.zombieTsunami.view;

import java.util.List;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.api.Pair;
import main.java.zombieTsunami.view.api.VController;

public class VControllerImpl implements VController{
    
    private Controller control;
    @Override
    public void set(final Controller c){
        this.control=c;

        View.start(this, getScreenWC(), getScreenHC());
    }

    @Override
    public int getScreenWC(){
        return this.control.getScreenWidth();
    }

    @Override
    public int getScreenHC(){
        return this.control.getScreenHigh();
    }

   

    @Override
    public int getFPSC() {
        return this.control.getFPS();
    }

    
    @Override
    public int getMapX() {
        return this.control.getMapX();
    }

    @Override
    public int getMapY() {
        return this.control.getMapY();
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
    public List<Pair<Integer, Integer>> tilePosC() {
        return this.control.tilePos();
    }

    @Override
    public List<Integer> mapIndexListC() {
        return this.control.mapList();
    }
    
    @Override
    public void jumpZombie() {
        this.control.jumpZombie();
    }

    @Override
    public void updateZombie() {
        this.control.updateZombie();
    }
}
