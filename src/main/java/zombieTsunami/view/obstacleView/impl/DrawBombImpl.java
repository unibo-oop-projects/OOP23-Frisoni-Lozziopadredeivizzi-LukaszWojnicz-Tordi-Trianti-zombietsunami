package zombietsunami.view.obstacleView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import zombietsunami.model.MapData;
import zombietsunami.view.api.VController;
import zombietsunami.view.obstacleView.api.DrawBomb;

public class DrawBombImpl implements DrawBomb{

    private static final String bomb1="src/main/resources/ZombieTsunami/obstacles/bomb/bomb1.png";

    @Override
    public void drawBombV(Graphics2D g2, VController controller) {
        g2.drawImage(getBomb(), 
            controller.getObstacleMapX(),
            controller.getObstacleMapY(),
            controller.titleSizeC(),
            controller.titleSizeC(), 
            null);
    }

    @Override
    public BufferedImage getBomb() {
        BufferedImage image=null;
        try {      
            image = ImageIO.read(new File(bomb1));
        } catch (Exception e) {
                e.printStackTrace();
        }
        return image;
    }

    public void update(final VController controller) {
        controller.updateObstacle();
    }
    
}
