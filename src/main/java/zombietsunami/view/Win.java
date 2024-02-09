package zombietsunami.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 * This utility class is used to put the win scene in the game.
 */
public final class Win {

    private static final int FONT_SIZE = 50;
    private static final int RECT_POS_X = 240;
    private static final int RECT_POS_Y = 130;
    private static final int RECT_WIDTH = 300;
    private static final int RECT_HEIGHT = 100;
    private static final int PAUSE_POS_X = 280;
    private static final int PAUSE_POS_Y = 200;

    private Win() {
    }

    /**
     * This method draw the elements to obtain the win scene in the game.
     * 
     * @param g2 is the Graphic to drow the element of the win scene
     */
    public static void win(final Graphics2D g2) {
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(RECT_POS_X, RECT_POS_Y, RECT_WIDTH, RECT_HEIGHT);
        g2.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));
        g2.setColor(Color.WHITE);
        g2.drawString("WINNER", PAUSE_POS_X, PAUSE_POS_Y);
    }
}
