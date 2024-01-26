package main.java.zombieTsunami.controller;

import java.awt.Graphics2D;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.api.Model;
import main.java.zombieTsunami.model.MapData;
import main.java.zombieTsunami.model.ModelImpl;

public class ControllerImpl implements Controller{
    
    private Model model;

    public void setModel(){
        this.model=new ModelImpl();
        this.model.setController(this);
    }

    public int getScreenCol(){
        return MapData.getMaxScCol();
    }

    public int getScreenRow(){
        return MapData.getMaxScRow();
    }

    public int getTitleSize(){
        return MapData.getTitSize();
    }

    public long getFPS(){
        return MapData.getFPS(); 
    }

    public int getScreenWidth(){
        return MapData.getScreenW();
    }

    public int getScreenHigh(){
        return MapData.getScreenH();
    }

    public void drowMap(final Graphics2D g2){
        this.model.drowMap(g2);
    }

    public void updateZombie(){
        this.model.updateZombie();
    }
}
