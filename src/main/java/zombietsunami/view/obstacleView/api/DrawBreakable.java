package zombietsunami.view.obstacleView.api;

import zombietsunami.view.api.VController;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public interface DrawBreakable {
    void drawBreakableV(final Graphics2D g2, final VController controller);
    BufferedImage getBreakable();
    void update(final VController controller);
}
