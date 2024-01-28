package main.java.zombieTsunami.view.zombieView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import main.java.zombieTsunami.model.MapData;
import main.java.zombieTsunami.view.api.VController;
import main.java.zombieTsunami.view.zombieView.api.DrawZombie;

public class DrawZombieImpl implements DrawZombie{
    private boolean sprite = true;
    private int spriteCounter = 0;
    
    @Override
    public void drawZombieV(Graphics2D g2, VController controller) {
        System.out.println("x:" + controller.getMapX() + " y:" + controller.getMapY());
        g2.drawImage(getZombie(), controller.getMapX(),controller.getMapY(), MapData.getTitSize(),MapData.getTitSize(), null);
        g2.dispose();
    }
    @Override
    public BufferedImage getZombie() {
        BufferedImage image=null;
        try {
            if (sprite) {
                image = ImageIO.read(new File("src/main/resources/ZombieTsunami/zombie/Zombie.png"));
                sprite = false;
            } else {
                image = ImageIO.read(new File("src/main/resources/ZombieTsunami/zombie/Zombie2.png"));
                sprite = true;
            }
            spriteCounter++;
                if (spriteCounter>60) {
                    if (sprite) {
                        sprite = false;
                    }else {
                        sprite = true;
                    }
                    spriteCounter = 0;
                }        
            } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
        
    }
}
