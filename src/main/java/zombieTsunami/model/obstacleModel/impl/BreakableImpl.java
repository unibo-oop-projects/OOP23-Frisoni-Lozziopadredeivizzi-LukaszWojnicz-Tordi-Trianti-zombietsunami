package zombieTsunami.model.obstacleModel.impl;

import java.awt.Graphics2D;

import zombieTsunami.api.Model;
import zombieTsunami.model.ModelImpl;
import zombieTsunami.model.obstacleModel.api.*;

public class BreakableImpl extends ObstacleEntity implements Breakable, Obstacle{

    public int MINFORCE = 1; //messa a 1 per test

    @Override
    public void update() {
        //se collide con lo zombie, vede se canBreakObstacle()
    }

    @Override
    public boolean canBreakObstacle() {
        /*
        if (this.MINFORCE <= Model.getStrenght()){
            return true;
        }else{
            return false;
        }
        */
        return true;
    }

    @Override
    public void breakObstacle() {
        //break
    }
    
}
