package zombietsunami.view.obstacleView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import zombietsunami.view.api.VController;
import zombietsunami.view.obstacleView.api.DrawBreakable;

public class DrawBreakableImpl implements DrawBreakable{

    private static final String SEP = "/";
    private static final String ROOT = SEP + "zombietsunami" + SEP + "obstacles" + SEP + "breakable" + SEP;
    private static final String BREAKABLE = ROOT + "barrel.png";

    @Override
    public void drawBreakableV(Graphics2D g2, VController controller) {
        for(int i = 0; i < controller.obstacleIndexListC().size(); i++){
            if(controller.obstacleIndexListC().get(i) == 2 && controller.screenTilePosC().get(i) != null){
                g2.drawImage(getBreakable(), 
                controller.screenTilePosC().get(i).getX(), 
                controller.screenTilePosC().get(i).getY(),
                controller.titleSizeC(),
                controller.titleSizeC(),
                null);
            }
        }
    }

    @Override
    public BufferedImage getBreakable() {
       BufferedImage image=null;
        try {      
            image = ImageIO.read(getClass().getResource(BREAKABLE));
        } catch (Exception e) {
                e.printStackTrace();
        }
        return image;
    }

    @Override
    public void update(final VController controller) {
        controller.updateObstacle();
    }
    
}
