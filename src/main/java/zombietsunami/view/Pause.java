package zombieTsunami.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 * This utility class is used to put the pause scene in the game.
 */
public final class Pause {

    private static final int FONT_SIZE = 50;
    private static final int RECT_POS_X = 240;
    private static final int RECT_POS_Y = 130;
    private static final int RECT_WIDTH = 300;
    private static final int RECT_HEIGHT = 100;
    private static final int PAUSE_POS_X = 300;
    private static final int PAUSE_POS_Y = 200;

    private Pause() {
    }

    /**
     * This method draw the elements to obtain the pause scene in the game.
     * 
     * @param g2 is the Graphic to drow the element of the pause scene
     */
    public static void pause(final Graphics2D g2) {
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(RECT_POS_X, RECT_POS_Y, RECT_WIDTH, RECT_HEIGHT);
        g2.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));
        g2.setColor(Color.WHITE);
        g2.drawString("PAUSA", PAUSE_POS_X, PAUSE_POS_Y);
    }

}
