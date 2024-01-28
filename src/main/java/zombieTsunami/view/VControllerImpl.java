package main.java.zombieTsunami.view;

import java.awt.Graphics2D;
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
    public void updateZombieC() {
        this.control.updateZombie();
    }

    @Override
    public int getFPSC() {
        return this.control.getFPS();
    }

    @Override
    public void drawZombieC(final Graphics2D g2) {
        this.control.drawZombie(g2);
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
        return this.control.mapIndexList();
    }
}
