package zombieTsunami.model.obstacleModel.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import zombieTsunami.api.Model;
import zombieTsunami.model.MapData;
import zombieTsunami.model.obstacleModel.api.*;

public class BombImpl extends ObstacleEntity implements Bomb, Obstacle{

    private ObstacleEntity entity = new ObstacleEntity();
    
    public int damage = 1; //for test

    public BombImpl(){
        setDefaultValue();
    }

    private void setDefaultValue() {
        entity.setX(360); //just for test
        entity.setY(500);
    }

    @Override
    public void update() {
        //if collides with zombie, calls hit()
    }

    @Override
    public void hit() {
        
    }
}
