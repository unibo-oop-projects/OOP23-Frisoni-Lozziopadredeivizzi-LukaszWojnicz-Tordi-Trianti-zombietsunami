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

    /**
     * Draws the bomb on the graphics context based on the provided controller.
     * 
     * @param g2         The graphics context.
     * @param controller The controller with the game-related information.
     */
    @Override
    public void drawBombV(Graphics2D g2, List<Integer> obstacleIndexList, List<Pair<Integer, Integer>> screenTilePos, int titleSize, VController controller) {
        for (int i = 0; i < obstacleIndexList.size(); i++) {
            if (obstacleIndexList.get(i) == 1 && screenTilePos.get(i) != null) {
                controller.getBombsFromMapC(obstacleIndexList, screenTilePos, controller.getStrenght());
                g2.drawImage(getBomb(), 
                screenTilePos.get(i).getX(), 
                screenTilePos.get(i).getY(),
                titleSize,
                titleSize,
                null);
            }
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
        controller.updateBomb();
    }
}
