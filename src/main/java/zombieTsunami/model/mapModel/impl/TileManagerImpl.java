package main.java.zombieTsunami.model.mapModel.impl;

import java.awt.Graphics2D;
import java.util.List;

import main.java.zombieTsunami.model.mapModel.api.GameMap;
import main.java.zombieTsunami.model.mapModel.api.TileImage;
import main.java.zombieTsunami.model.mapModel.api.TileManager;

public class TileManagerImpl implements TileManager {

    private final GameMap gameMap = new GameMapImpl();
    private final TileImage tileImg = new TileImageImpl();

    @Override
    public void drow(final Graphics2D g2, final int screenCol, final int screenRow, final int titleSize) {
        final List<List<Integer>> mapNum = gameMap.loadMap();
        final var item = tileImg.setTileImage();
        int x = 0;
        int y = 0;

        for (int row = 0; row < screenRow; row++) {
            for (int col = 0; col < screenCol; col++) {
                int tileNum = mapNum.get(row).get(col);
                g2.drawImage(item.get(tileNum).getImage(), x, y, titleSize,
                        titleSize, null);
                x += titleSize;
            }
            x = 0;
            y += titleSize;
        }
    }
}
