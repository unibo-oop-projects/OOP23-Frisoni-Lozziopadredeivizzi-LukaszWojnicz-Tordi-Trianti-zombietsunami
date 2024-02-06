package zombieTsunami.model.obstacleModel.impl;

import java.awt.Graphics2D;

import zombieTsunami.api.Model;
import zombieTsunami.model.ModelImpl;
import zombieTsunami.model.obstacleModel.api.*;

public class BreakableImpl extends ObstacleEntity implements Breakable, Obstacle{

    public int MINFORCE;

    public BreakableImpl(int minforce){
        this.MINFORCE = minforce;
    }

    @Override
    public void update() {
        //if collides, checks if canBreakObstacle()
    }

    @Override
    public boolean canBreakObstacle(int zombieForce) {
        if (this.MINFORCE <= zombieForce){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void breakObstacle() {
        //break
    }
    
}
