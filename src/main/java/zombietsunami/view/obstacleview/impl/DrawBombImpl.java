package zombietsunami.view.obstacleview.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.util.List;
import java.util.ArrayList;

import zombietsunami.api.Pair;
import zombietsunami.view.api.VController;
import zombietsunami.view.obstacleview.api.DrawBomb;

/**
 * Implementation of the DrawBomb interface, responsible for drawing and
 * updating the bomb.
 */
public class DrawBombImpl implements DrawBomb {
    private static final String SEP = "/";
    private static final String ROOT = SEP + "zombietsunami" + SEP + "obstacles" + SEP + "bomb" + SEP;
    private static final String BOMB_1 = ROOT + "bomb1.png";

    private Boolean initialiazed = false;
    private Integer nBomb = 0;

    /**
     * Draws the bomb on the graphics context based on the provided controller.
     * 
     * @param g2         The graphics context.
     * @param controller The controller with the game-related information.
     */
    @Override
    public void drawBombV(final Graphics2D g2, final VController controller) {
        for (int i = 0; i < controller.obstacleIndexListC().size(); i++) {
            if (controller.obstacleIndexListC().get(i) == 1 && controller.screenTilePosC().get(i) != null) {
                if(initialiazed){
                    controller.setCoordinatesOfBombInListC(nBomb, controller.screenTilePosC().get(i).getX(), controller.screenTilePosC().get(i).getY());
                }
                g2.drawImage(getBomb(), 
                controller.screenTilePosC().get(i).getX(), 
                controller.screenTilePosC().get(i).getY(),
                controller.titleSizeC(),
                controller.titleSizeC(),
                null);
                nBomb++;
            }
        }
        nBomb = 0;
        if(initialiazed == false) {
           controller.getBombsFromMapC(controller.obstacleIndexListC(), controller.screenTilePosC(), controller.getStrenght());
           initialiazed = true;
        }
    }

    /**
     * Gets the image representation of the bomb.
     * 
     * @return The BufferedImage representing the bomb.
     */
    @Override
    public BufferedImage getBomb() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResource(BOMB_1));
        } catch (Exception e) {
                e.printStackTrace();
        }
        return image;
    }

    /**
     * Updates the bomb's visual representation based on the same controller.
     * 
     * @param controller The controller providing game-related information.
     */
    public void update(final VController controller) {
        controller.updateObstacle();
    }
}
