package main.java.zombieTsunami.controller;

import java.util.List;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.api.Model;
import main.java.zombieTsunami.api.Pair;
import main.java.zombieTsunami.model.MapData;
import main.java.zombieTsunami.model.ModelImpl;
import main.java.zombieTsunami.view.VControllerImpl;
import main.java.zombieTsunami.view.api.VController;

public class ControllerImpl implements Controller{
    
    private Model model;
    private VController viewController;

    @Override
    public void setModel(){
        this.model=new ModelImpl();
        this.model.setController(this);
    }

    @Override
    public void setView(){
        this.viewController=new VControllerImpl();
        this.viewController.set(this);
    }

    @Override
    public int getScreenCol(){
        return MapData.getMaxScCol();
    }

    @Override
    public int getScreenRow(){
        return MapData.getMaxScRow();
    }

    @Override
    public int getTitleSize(){
        return MapData.getTitSize();
    }

    @Override
    public int getFPS(){
        return MapData.getFPS(); 
    }

    @Override
    public int getScreenWidth(){
        return MapData.getScreenW();
    }

    @Override
    public int getScreenHigh(){
        return MapData.getScreenH();
    }

    /*@Override
    public void updateZombie(){
        this.model.updateZombie();
    }
*/
    @Override
    public int getMapX() {
        return this.model.getX();
    }

    @Override
    public List<Integer> mapList() {
        return this.model.getMapList();
    }

    @Override
    public List<String> tileElements() {
        return this.model.getTileElem();
    }

    @Override
    public List<Pair<Integer, Integer>> tilePos() {
        return this.model.getTilePos();
    }

    public int getMapY() {
        return this.model.getY();
    }

    @Override
    public int getSpeed() {
        return this.model.getSpeed();
    }

    @Override
    public int getNumX() {
        return this.model.getNumX();
    }

    @Override
    public void jumpZombie() {
        this.model.jump();
    }

    @Override
    public void updateZombie() {
        this.model.updateZombie();
    }
}
