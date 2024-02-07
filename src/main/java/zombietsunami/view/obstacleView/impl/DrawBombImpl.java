package zombietsunami.view.obstacleView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import zombietsunami.view.api.VController;
import zombietsunami.view.obstacleView.api.DrawBomb;

public class DrawBombImpl implements DrawBomb{

    private static final String SEP = "/";
    private static final String ROOT = SEP + "zombietsunami" + SEP + "obstacles" + SEP + "bomb" + SEP;
    private static final String BOMB_1= ROOT + "bomb1.png";

    @Override
    public void drawBombV(Graphics2D g2, VController controller) {
        for(int i = 0; i < controller.obstacleIndexListC().size(); i++){
            if(controller.obstacleIndexListC().get(i) == 1 && controller.screenTilePosC().get(i) != null){
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
            image = ImageIO.read(getClass().getResource(BOMB_1));
        } catch (Exception e) {
                e.printStackTrace();
        }
        return image;
    }

    public void update(final VController controller) {
        controller.updateObstacle();
    }
    
}
