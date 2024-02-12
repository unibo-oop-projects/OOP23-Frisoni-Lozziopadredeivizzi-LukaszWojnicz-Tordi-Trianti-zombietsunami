package zombietsunami.view.obstacleview.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.util.List;

import zombietsunami.api.Pair;
import zombietsunami.view.api.VController;

/**
 * Interface definining the functions of DrawObstacle.
 */
public interface DrawObstacle {

    /**
     * Draws all the obstacles inside the obstacle list.
     * @param g2 graphics.
     * @param obstacleIndexList obstacle list.
     * @param screenTilePos coordinates.
     * @param titleSize tile size.
     * @param controller the controller.
     */
    void drawObstacleV(Graphics2D g2, List<Integer> obstacleIndexList, 
        List<Pair<Integer, Integer>> screenTilePos, int titleSize, VController controller);

    /**
     * Returns the image of the breakable.
     * @return the image of the breakable.
     */
    BufferedImage getBreakable();

    /**
     * Returns the image of the bomb.
     * @return the image of the bomb.
     */
    BufferedImage getBomb();

    /**
     * Updates the bomb.
     * @param controller the controller.
     */
    void updateBomb(VController controller);

    /**
     * Updates the breakable.
     * @param controller the controller.
     */
    void updateBreakable(VController controller);
}
