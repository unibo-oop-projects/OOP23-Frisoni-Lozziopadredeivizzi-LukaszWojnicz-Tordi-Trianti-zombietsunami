package main.java.zombieTsunami.view;

import main.java.zombieTsunami.api.Controller;

public class VController {
    
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
