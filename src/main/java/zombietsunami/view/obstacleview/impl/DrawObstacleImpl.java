package zombietsunami.view.obstacleview.impl;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import java.util.List;

import javax.imageio.ImageIO;

import zombietsunami.api.Pair;
import zombietsunami.view.api.VController;
import zombietsunami.view.obstacleview.api.DrawObstacle;

public class DrawObstacleImpl implements DrawObstacle{

    private static final String SEP = "/";
    private static final String ROOT_BREAKABLE = SEP + "zombietsunami" + SEP + "obstacles" + SEP + "breakable" + SEP;
    private static final String ROOT_BOMB = SEP + "zombietsunami" + SEP + "obstacles" + SEP + "bomb" + SEP;
    private static final String BOMB_1 = ROOT_BOMB + "bomb1.png";
    private static final String BREAKABLE = ROOT_BREAKABLE + "barrel.png";

    @Override
    public void drawObstacleV(Graphics2D g2, List<Integer> obstacleIndexList,
        List<Pair<Integer, Integer>> screenTilePos, int titleSize, VController controller) {
        for (int i = 0; i < obstacleIndexList.size(); i++) {
            if (obstacleIndexList.get(i) == 1 && screenTilePos.get(i) != null) {
                controller.getBombsFromMapC(obstacleIndexList, screenTilePos, controller.getStrenght());
                draw(getBomb(), g2, obstacleIndexList, screenTilePos, titleSize, i);
            }
            if (obstacleIndexList.get(i) == 2 && screenTilePos.get(i) != null) {
                controller.getBreakablesFromMapC(obstacleIndexList, screenTilePos, controller.getStrenght());
                draw(getBreakable(), g2, obstacleIndexList, screenTilePos, titleSize, i);
            }
        }
    }

    private void draw(BufferedImage image, Graphics2D g2, List<Integer> obstacleIndexList,
    List<Pair<Integer, Integer>> screenTilePos, int titleSize, int i) {
        g2.drawImage(image, 
                screenTilePos.get(i).getX(), 
                screenTilePos.get(i).getY(),
                titleSize,
                titleSize,
                null);
    }

    /**
     * Gets the image representation of the breakable.
     * 
     * @return The BufferedImage representing the breakable.
     */
    @Override
    public BufferedImage getBreakable() {
       BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResource(BREAKABLE));
        } catch (Exception e) {
                e.printStackTrace();
        }
        return image;
    }

    @Override
    public BufferedImage getBomb() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResource(BOMB_1));
        } catch (Exception e) {
                e.printStackTrace();
        }
        return image;
    }
    
    /**
     * Updates the bomb's visual representation based on the same controller.
     * 
     * @param controller The controller providing game-related information.
     */
    @Override
    public void updateBomb(final VController controller) {
        controller.updateBomb();
    }

    /**
     * Updates the breakable's visual representation based on the same controller.
     * 
     * @param controller The controller providing game-related information.
     */
    @Override
    public void updateBreakable(final VController controller) {
        controller.updateBreakable();
    }
}
