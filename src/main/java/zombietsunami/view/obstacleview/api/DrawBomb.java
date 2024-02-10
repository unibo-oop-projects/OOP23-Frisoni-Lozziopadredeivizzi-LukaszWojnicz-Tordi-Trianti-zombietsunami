package zombietsunami.view.obstacleview.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.util.List;

import zombietsunami.api.Pair;
import zombietsunami.view.api.VController;

/**
 * Interface representing the drawing and updating of the bomb.
 */
public interface DrawBomb {
    /**
     * Draws the bomb on the graphics context based on the same controller.
     * 
     * @param g2         The graphics context.
     * @param controller The controller with the game-related information.
     */
    void drawBombV(Graphics2D g2, List<Integer> obstacleIndexList, List<Pair<Integer, Integer>> screenTilePos, int titleSize, VController controller);

    /**
     * Gets the image representation of the bomb.
     * 
     * @return The BufferedImage representing the bomb.
     */
    BufferedImage getBomb();
}
