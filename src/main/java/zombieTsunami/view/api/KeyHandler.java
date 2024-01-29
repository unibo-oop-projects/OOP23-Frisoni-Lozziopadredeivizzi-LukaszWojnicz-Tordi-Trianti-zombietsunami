package zombieTsunami.view.api;

import java.awt.event.KeyEvent;

public interface KeyHandler {
    void keyPressed(KeyEvent e);
    void keyReleased(KeyEvent e);
    void keyTyped(KeyEvent e);
    boolean isPressed();
    void handleKeyPressed(KeyEvent e);
}
