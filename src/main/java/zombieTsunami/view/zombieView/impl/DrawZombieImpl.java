package zombieTsunami.view.zombieView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import zombieTsunami.model.MapData;
import zombieTsunami.view.api.VController;
import zombieTsunami.view.zombieView.api.DrawZombie;

public class DrawZombieImpl implements DrawZombie{
    private boolean sprite = true;
    private int spriteCounter;
    private final int FRAMESCHANGE = 15;

    @Override
    public void drawZombieV(Graphics2D g2, VController controller) {
        g2.drawImage(getZombie(), controller.getMapX()/controller.getNumX(),controller.getMapY(), MapData.getTitSize(),MapData.getTitSize(), null);
        g2.dispose();
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
                    image = ImageIO.read(new File("src/main/resources/ZombieTsunami/zombie/Zombie.png"));
                } else {
                    image = ImageIO.read(new File("src/main/resources/ZombieTsunami/zombie/Zombie2.png"));
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
    public void jump() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jump'");
    }
    @Override
    public void updateZombie(VController controller) {
        controller.updateZombie();
    }
}
