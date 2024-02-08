package zombietsunami.view.zombieview.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import zombietsunami.view.api.KeyHandler;
import zombietsunami.view.api.VController;

/**
 * Interface representing the drawing and updating of the zombie.
 */
public interface DrawZombie {

    /**
     * Draws the zombie on the graphics context based on the same controller.
     * 
     * @param g2         The graphics context.
     * @param controller The controller with the game-related information.
     */
    void drawZombieV(Graphics2D g2, VController controller);

    /**
     * Gets the image representation of the zombie.
     * 
     * @return The BufferedImage representing the zombie.
     */
    BufferedImage getZombie();

    /**
     * Updates the zombie's visual representation based on the same controller.
     * 
     * @param controller The controller with the game-related information.
     */
    void updateZombie(VController controller);

    /**
     * Handles key presses related to the zombie in the game view.
     * 
     * @param controller The controller with the game-related information.
     * @param keyH       The key handler for the key events.
     */
    void handleKeyPress(VController controller, KeyHandler keyH);
}
