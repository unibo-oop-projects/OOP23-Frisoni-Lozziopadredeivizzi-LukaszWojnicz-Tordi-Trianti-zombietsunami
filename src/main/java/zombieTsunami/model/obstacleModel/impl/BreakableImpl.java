package main.java.zombieTsunami.model.obstacleModel.impl;

import main.java.zombieTsunami.model.obstacleModel.api.*;

public class BreakableImpl extends ObstacleEntity implements Breakable, Obstacle{

    @Override
    public void update() {
        //se collide con lo zombie, vede se canBreakObstacle()
    }

    @Override
    public boolean canBreakObstacle() {
        return true; // messo per non dare errori, se lo zombie ha abbastanza forza, lo rompe e gli da forza +1
    }

    @Override
    public void breakObstacle() {
        //break
    }

    @Override
    public void addForce() {
        //aggiunge +1 alla forza dello zombie
    }
    
}
