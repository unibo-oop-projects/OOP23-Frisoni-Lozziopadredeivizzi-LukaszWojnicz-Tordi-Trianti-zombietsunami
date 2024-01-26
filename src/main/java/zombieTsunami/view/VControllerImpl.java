package main.java.zombieTsunami.view;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.view.api.VController;

public class VControllerImpl implements VController{
    
    private Controller control;

    public void set(final Controller c){
        this.control=c;
    }

    public int getScreenWC(){
        return this.control.getScreenWidth();
    }

    public int getScreenHC(){
        return this.control.getScreenHigh();
    }
}
