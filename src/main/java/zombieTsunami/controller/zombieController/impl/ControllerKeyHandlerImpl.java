package main.java.zombieTsunami.controller.zombieController.impl;

import main.java.zombieTsunami.controller.zombieController.api.ControllerKeyHandler;
import main.java.zombieTsunami.view.zombieView.api.KeyHandler;
public class ControllerKeyHandlerImpl implements ControllerKeyHandler{
   private KeyHandler keyH;

    public ControllerKeyHandlerImpl(KeyHandler keyH) {
        this.keyH = keyH;
    }
    
}
