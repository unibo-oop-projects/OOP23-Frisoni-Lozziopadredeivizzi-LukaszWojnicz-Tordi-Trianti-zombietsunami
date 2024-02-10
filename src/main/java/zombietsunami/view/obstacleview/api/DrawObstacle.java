package zombietsunami.view.obstacleview.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.util.List;

import zombietsunami.api.Pair;
import zombietsunami.view.api.VController;

public interface DrawObstacle {

    void drawObstacleV(Graphics2D g2, List<Integer> obstacleIndexList, List<Pair<Integer, Integer>> screenTilePos, int titleSize, VController controller);

    BufferedImage getBreakable();

    BufferedImage getBomb();

    void updateBomb(final VController controller);

    void updateBreakable(final VController controller);
}
