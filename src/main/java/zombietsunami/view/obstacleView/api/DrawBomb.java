package zombietsunami.view.obstacleView.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import zombietsunami.view.api.VController;

public interface DrawBomb {
    void drawBombV(final Graphics2D g2, final VController controller);
    BufferedImage getBomb();
}
