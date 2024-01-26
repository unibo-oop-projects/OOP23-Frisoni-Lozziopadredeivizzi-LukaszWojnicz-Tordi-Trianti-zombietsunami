package main.java.zombieTsunami.controller;

import main.java.zombieTsunami.api.Controller;
import main.java.zombieTsunami.api.Model;
import main.java.zombieTsunami.model.ModelImpl;

public class ControllerImpl implements Controller{
    
    private Model model;

    public void setModel(){
        this.model=new ModelImpl();
        this.model.setController(this);
    }
}
