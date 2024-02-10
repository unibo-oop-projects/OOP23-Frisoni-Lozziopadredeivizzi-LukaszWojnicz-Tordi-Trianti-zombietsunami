package zombietsunami.view.obstacleview.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.util.List;

import javax.imageio.ImageIO;

import zombietsunami.api.Pair;
import zombietsunami.view.api.VController;
import zombietsunami.view.obstacleview.api.DrawBreakable;

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
    public void drawBreakableV(Graphics2D g2, List<Integer> obstacleIndexList, List<Pair<Integer, Integer>> screenTilePos, int titleSize, VController controller) {
        for (int i = 0; i < obstacleIndexList.size(); i++) {
            if (obstacleIndexList.get(i) == 2 && screenTilePos.get(i) != null) {
                controller.getBreakablesFromMapC(obstacleIndexList, screenTilePos, controller.getStrenght());
                g2.drawImage(getBreakable(), 
                screenTilePos.get(i).getX(), 
                screenTilePos.get(i).getY(),
                titleSize,
                titleSize,
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
        controller.updateBreakable();
    }
}
