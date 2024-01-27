package main.java.zombieTsunami.model.obstacleModel.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import main.java.zombieTsunami.controller.mapController.api.ControllerMapData;
import main.java.zombieTsunami.controller.mapController.impl.ControllerMapDataImpl;
import main.java.zombieTsunami.model.obstacleModel.api.*;

public class BombImpl extends ObstacleEntity implements Bomb, Obstacle{

    private ObstacleEntity entity = new ObstacleEntity();
    private ControllerMapData data= new ControllerMapDataImpl();

    public BombImpl(){
        setDefaultValue();
    }

    private void setDefaultValue() {
        entity.setX(350); //350 Per testare, poi dovremo gestire la creazione procedurale di Bombe e Ostacoli
        entity.setY(250);
    }

    @Override
    public void drawObstacle(Graphics2D g2) {
        g2.drawImage(getBomb(), entity.getX(), entity.getY(), data.getTitleSize(), data.getTitleSize(), null);
        g2.dispose();
    }

    @Override
    public void update() {
        //Se collide con lo zombie, chiama hit();
    }

    @Override
    public void hit() {
        //Qui dovrebbe esserci il decremento della vita dello zombie.
    }

    @Override
    public BufferedImage getBomb() {
        BufferedImage image=null;
        try {
            return  image = ImageIO.read(new File("src/main/resources/ZombieTsunami/bomb/Bomb.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    
}
