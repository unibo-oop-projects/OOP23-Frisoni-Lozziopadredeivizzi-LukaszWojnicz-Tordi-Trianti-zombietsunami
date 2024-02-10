package zombietsunami.view.personview.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import zombietsunami.view.api.VController;

public interface DrawPerson{
    
    /**
     * Draws the Person on the graphics context based on the same controller.
     * 
     * @param g2         The graphics context.
     * @param controller The controller with the game-related information.
     */
    void drawPersonV(Graphics2D g2, VController controller);

    /**
     * Gets the image representation of the Person.
     * 
     * @return The BufferedImage representing the Person
     */
    BufferedImage getPerson();
}
