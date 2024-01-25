package main.java.zombieTsunami.controller.zombieController.impl;

import java.awt.Graphics2D;

import main.java.zombieTsunami.controller.zombieController.api.ControllerZombie;
import main.java.zombieTsunami.model.zombieModel.api.Zombie;
import main.java.zombieTsunami.model.zombieModel.impl.ZombieImpl;
import main.java.zombieTsunami.view.zombieView.api.KeyHandler;

public class ControllerZombieImpl implements ControllerZombie {
    private Zombie zombie= new ZombieImpl();
    private KeyHandler keyHandler;
    private Graphics2D g2;
    public ControllerZombieImpl( KeyHandler keyHandler, Graphics2D g2) {
        this.keyHandler = keyHandler;
        this.g2 = g2;
    }
    public void handleKeyPress() {
        if (keyHandler.isPressed()) {
            zombie.jump();
        }else {
            zombie.update();
        }
    }
   
    @Override
    public void update() {
        zombie.update();
    }
    @Override
    public void drawZombie(Graphics2D g2) {
        zombie.drawZombie(g2);
    }
}
