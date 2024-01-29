package main.java.zombieTsunami.view;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.java.zombieTsunami.view.api.KeyHandler;

public class KeyHandlerImpl implements KeyListener, KeyHandler{

    private boolean jump;
    private boolean onPause = false;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code= e.getKeyCode();
        if (code== KeyEvent.VK_SPACE) {
            jump=true;
        }

        if(code == KeyEvent.VK_ESCAPE && !this.onPause){
            this.onPause = true;
        }
        else if (code == KeyEvent.VK_ESCAPE && this.onPause){
            this.onPause = false;
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

    @Override
    public void handleKeyPressed(KeyEvent e) {
        if (isPressed()) {
            //zombie.jump();
        }else {
            //zombie.update();
        }
    }

   
    
}
