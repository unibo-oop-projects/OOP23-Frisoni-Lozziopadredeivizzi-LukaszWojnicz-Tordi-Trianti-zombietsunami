package zombietsunami.model.obstacleModel.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import zombietsunami.api.Model;
import zombietsunami.model.EntityImpl;
import zombietsunami.model.MapData;
import zombietsunami.model.obstacleModel.api.*;

public class BombImpl implements Bomb, Obstacle{

    private ObstacleEntity entity = new ObstacleEntity();
    
    public int damage = 1; //for test

    public BombImpl(){
        setDefaultValue();
    }

    private void setDefaultValue() {
        entity.setX(350); //just for test
        entity.setY(350);
    }

    @Override
    public void update() {
    }

    @Override
    public void hit() {
        //Gameover
    }

    @Override
    public int getX() {
        return this.entity.getX();
    }

    @Override
    public int getY() {
        return this.entity.getY();
    }
}
