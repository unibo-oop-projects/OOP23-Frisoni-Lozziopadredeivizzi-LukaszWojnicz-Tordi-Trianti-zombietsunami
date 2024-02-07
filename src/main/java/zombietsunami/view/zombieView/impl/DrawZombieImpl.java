package zombietsunami.view.zombieView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import zombietsunami.view.api.KeyHandler;
import zombietsunami.view.api.VController;
import zombietsunami.view.zombieView.api.DrawZombie;

/**
 * Implementation of the DrawZombie interface, responsible for drawing and
 * updating the zombie.
 */
public class DrawZombieImpl implements DrawZombie {
    private boolean sprite = true;
    private int spriteCounter;
    private static final int FRAMESCHANGE = 15;
    private static final String ROOT = "src"+File.separator+"main"+File.separator+"resources"+File.separator+"zombietsunami"+File.separator+"zombie"+File.separator;

    private static final String ZOMBIE_1 = ROOT+"Zombie.png";
    private static final String ZOMBIE_2 = ROOT+"Zombie2.png";

    /**
     * Draws the zombie on the graphics context based on the provided controller.
     * 
     * @param g2         The graphics context.
     * @param controller The controller with the game-related information.
     */
    @Override
    public void drawZombieV(final Graphics2D g2, final VController controller) {
        g2.drawImage(getZombie(), controller.getZombieScreenX() / controller.getNumX(), controller.getZombieScreenY(),
                controller.titleSizeC(), controller.titleSizeC(), null);
    }

    private int getCounter() {
        return spriteCounter;
    }

    private int increaseCounter() {
        return spriteCounter++;
    }

    /**
     * Gets the image representation of the zombie.
     * 
     * @return The BufferedImage representing the zombie.
     */
    @Override
    public BufferedImage getZombie() {
        BufferedImage image = null;
        try {
            if (sprite) {
                // src/main/resources/
                image = ImageIO.read(new File(ZOMBIE_1));
            } else {
                image = ImageIO.read(new File(ZOMBIE_2));
            }
            increaseCounter();
            if (getCounter() > FRAMESCHANGE) {
                sprite = !sprite;
                spriteCounter = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;

    }

    /**
     * Updates the zombie's visual representation based on the same controller.
     * 
     * @param controller The controller providing game-related information.
     */
    @Override
    public void updateZombie(final VController controller) {
        controller.updateZombie();
    }

    /**
     * Handles key presses related to the zombie .
     * 
     * @param controller The controller with the game-related information.
     * @param keyH       The key handler for processing key events.
     */
    @Override
    public void handleKeyPress(final VController controller, final KeyHandler keyH) {
        if (keyH.isPressed() && (!controller.getJumping())) {
            controller.jumpPress();
        }
        if (controller.getJumping()) {
            controller.updateJumpZombie();
        }
        updateZombie(controller);
    }
}
