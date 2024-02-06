package zombietsunami.view.api;

import java.awt.event.KeyEvent;

public interface KeyHandler {
    void keyPressed(KeyEvent e);

    void keyReleased(KeyEvent e);

    void keyTyped(KeyEvent e);

    boolean isPressed();

    /**
     * @return if the game is on pause or not
     */
    boolean isOnPause();
}
