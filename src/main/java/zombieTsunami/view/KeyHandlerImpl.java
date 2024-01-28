package main.java.zombieTsunami.view;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.java.zombieTsunami.view.api.KeyHandler;

public class KeyHandlerImpl implements KeyListener, KeyHandler{

    public boolean jump;
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code= e.getKeyCode();
        if (code== KeyEvent.VK_SPACE) {
            jump=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code= e.getKeyCode();
        if (code== KeyEvent.VK_SPACE) {
            jump=false;
        }
        
    }
    @Override
    public boolean isPressed() {
        return jump;
    }

   
    
}
