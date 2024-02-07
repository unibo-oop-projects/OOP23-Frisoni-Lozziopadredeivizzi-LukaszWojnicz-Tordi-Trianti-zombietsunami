package zombietsunami.view.obstacleView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import zombietsunami.model.MapData;
import zombietsunami.view.api.VController;
import zombietsunami.view.obstacleView.api.DrawBomb;

public class DrawBombImpl implements DrawBomb{

    private static final String bomb1="src/main/resources/zombietsunami/obstacles/bomb/bomb1.png";

    @Override
    public void drawBombV(Graphics2D g2, VController controller) {
        for(int i = 0; i < controller.obstacleIndexListC().size(); i++){
            if(controller.obstacleIndexListC().get(i) == 1){
                g2.drawImage(getBomb(), 
                controller.screenTilePosC().get(i).getX(), 
                controller.screenTilePosC().get(i).getY(),
                controller.titleSizeC(),
                controller.titleSizeC(),
                null);
            }
        }
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
