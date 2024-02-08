package zombietsunami.view.obstacleView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import zombietsunami.view.api.VController;
import zombietsunami.view.obstacleView.api.DrawBreakable;

/**
 * Implementation of the DrawBomb interface, responsible for drawing and
 * updating the bomb.
 */
public class DrawBreakableImpl implements DrawBreakable {

    private static final String SEP = "/";
    private static final String ROOT = SEP + "zombietsunami" + SEP + "obstacles" + SEP + "breakable" + SEP;
    private static final String BREAKABLE = ROOT + "barrel.png";

    /**
     * Draws the breakable on the graphics context based on the provided controller.
     * 
     * @param g2         The graphics context.
     * @param controller The controller with the game-related information.
     */
    @Override
    public void drawBreakableV(final Graphics2D g2, final VController controller) {
        for (int i = 0; i < controller.obstacleIndexListC().size(); i++) {
            if (controller.obstacleIndexListC().get(i) == 2 && controller.screenTilePosC().get(i) != null) {
                g2.drawImage(getBreakable(), 
                controller.screenTilePosC().get(i).getX(), 
                controller.screenTilePosC().get(i).getY(),
                controller.titleSizeC(),
                controller.titleSizeC(),
                null);
            }
        }
    }

    /**
     * Gets the image representation of the breakable.
     * 
     * @return The BufferedImage representing the breakable.
     */
    @Override
    public BufferedImage getBreakable() {
       BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResource(BREAKABLE));
        } catch (Exception e) {
                e.printStackTrace();
        }
        return image;
    }

    /**
     * Updates the breakable's visual representation based on the same controller.
     * 
     * @param controller The controller providing game-related information.
     */
    @Override
    public void update(final VController controller) {
        controller.updateObstacle();
    }
}
