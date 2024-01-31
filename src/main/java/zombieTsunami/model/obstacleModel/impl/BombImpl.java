package zombieTsunami.model.obstacleModel.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import zombieTsunami.model.MapData;
import zombieTsunami.model.obstacleModel.api.*;

public class BombImpl extends ObstacleEntity implements Bomb, Obstacle{

    private ObstacleEntity entity = new ObstacleEntity();

    private Model model;
    
    public int damage = 1; //per test

    public BombImpl(){
        setDefaultValue();
    }

    private void setDefaultValue() {
        entity.setX(350); //350 Per testare, poi dovremo gestire la creazione procedurale di Bombe e Ostacoli
        entity.setY(250);
    }

    @Override
    public void update() {
        //Se collide con lo zombie, chiama hit();
    }

    @Override
    public void hit() {
        
    }
}
