package main.java.zombieTsunami.view;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.view.api.VController;

public class VControllerImpl implements VController{
    
    private Controller control;

    @Override
    public void set(final Controller c){
        this.control=c;
    }

    @Override
    public int getScreenWC(){
        return this.control.getScreenWidth();
    }

    @Override
    public int getScreenHC(){
        return this.control.getScreenHigh();
    }
}
