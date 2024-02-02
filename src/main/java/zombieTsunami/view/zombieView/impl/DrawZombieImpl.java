package zombieTsunami.view.zombieView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import zombieTsunami.view.api.KeyHandler;
import zombieTsunami.view.api.VController;
import zombieTsunami.view.zombieView.api.DrawZombie;

public class DrawZombieImpl implements DrawZombie{
    private boolean sprite = true;
    private int spriteCounter;
    private final int FRAMESCHANGE = 15;
    private static final String zombie1="src/main/resources/ZombieTsunami/zombie/Zombie.png";
    private static final String zombie2="src/main/resources/ZombieTsunami/zombie/Zombie2.png";

    @Override
    public void drawZombieV(Graphics2D g2, VController controller) {
        g2.drawImage(getZombie(), controller.getZombieScreenX()/controller.getNumX(),controller.getZombieScreenY(),controller.titleSizeC(),controller.titleSizeC(), null);
    }
    private int getCounter(){
        return spriteCounter;
    }
    private int increaseCounter(){
        return spriteCounter++;
    }
    @Override
    public BufferedImage getZombie() {
        BufferedImage image=null;
        try {
                if (sprite) {
                    //src/main/resources/
                    image = ImageIO.read(new File(zombie1));
                } else {
                    image = ImageIO.read(new File(zombie2));
                }
                increaseCounter();
                if (getCounter()>FRAMESCHANGE) {//se il contatore è maggiore del numero di frame per il cambio sprite
                    sprite = !sprite;  // Inverto il valore di sprite
                    spriteCounter = 0;
                }        
            } catch (Exception e) {
                e.printStackTrace();
            }
        return image;
        
    }
    
    @Override
    public void jump(VController controller) {
        controller.jumpZombie();
    }
    @Override
    public void updateZombie(VController controller) {
        controller.updateZombie();
    }
    @Override
    public void handleKeyPress(VController controller,KeyHandler keyH) {
        if (keyH.isPressed()) {
            System.out.println("Jump"); 
            jump(controller);
        }else {
            updateZombie(controller);
        }
    }
}
