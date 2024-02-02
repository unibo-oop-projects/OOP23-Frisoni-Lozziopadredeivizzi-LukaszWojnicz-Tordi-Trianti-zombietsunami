package zombieTsunami.view.obstacleView.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import zombieTsunami.model.MapData;
import zombieTsunami.view.api.VController;
import zombieTsunami.view.obstacleView.api.DrawBomb;

public class DrawBombImpl implements DrawBomb{

    @Override
    public void drawBombV(Graphics2D g2, VController controller) {
        //bomb sprite doesn't exist yet
    }

    @Override
    public BufferedImage getBomb() {
        //same reason as above
        return null;
    }

    @Override
    public void update() {
        //TBD
    }
    
}
