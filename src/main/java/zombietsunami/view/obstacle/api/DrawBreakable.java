package zombietsunami.view.obstacleView.api;

import zombietsunami.view.api.VController;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * Interface representing the drawing and updating of the zombie.
 */
public interface DrawBreakable {

    /**
     * Draws the breakable on the graphics context based on the same controller.
     * 
     * @param g2         The graphics context.
     * @param controller The controller with the game-related information.
     */
    void drawBreakableV(Graphics2D g2, VController controller);

    /**
     * Gets the image representation of the breakable.
     * 
     * @return The BufferedImage representing the breakable.
     */
    BufferedImage getBreakable();

    /**
     * Updates the breakable's visual representation based on the same controller.
     * 
     * @param controller The controller with the game-related information.
     */
    void update(VController controller);
}
