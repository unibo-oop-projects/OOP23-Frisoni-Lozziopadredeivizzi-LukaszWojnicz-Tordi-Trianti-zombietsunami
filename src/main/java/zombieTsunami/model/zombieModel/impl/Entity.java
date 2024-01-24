package main.java.zombieTsunami.model.zombieModel.impl;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Entity {
    private int x, y;
    private int speed;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public BufferedImage getZombie() {
        BufferedImage image=null;
        try {
            return  image = ImageIO.read(new File("src/main/resources/ZombieTsunami/zombie/Zombie.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
        
    }
}

