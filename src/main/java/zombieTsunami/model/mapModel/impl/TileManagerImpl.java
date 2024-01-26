package main.java.zombieTsunami.model.mapModel.impl;

import java.awt.Graphics2D;
import java.util.List;

import main.java.zombieTsunami.api.MapData;
import main.java.zombieTsunami.model.MapDataImpl;
import main.java.zombieTsunami.model.mapModel.api.GameMap;
import main.java.zombieTsunami.model.mapModel.api.TileImage;
import main.java.zombieTsunami.model.mapModel.api.TileManager;

public class TileManagerImpl implements TileManager {

    private final GameMap gameMap = new GameMapImpl();
    private final TileImage tileImg = new TileImageImpl();
    private final MapData data = new MapDataImpl();

    @Override
    public void drow(final Graphics2D g2) {
        final List<List<Integer>> mapNum = gameMap.loadMap();
        final var item = tileImg.setTileImage();
        int x = 0;
        int y = 0;

        for (int row = 0; row < this.data.getMaxScRow(); row++) {
            for (int col = 0; col < this.data.getMaxScCol(); col++) {
                int tileNum = mapNum.get(row).get(col);
                g2.drawImage(item.get(tileNum).getImage(), x, y, this.data.getTitSize(),
                        this.data.getTitSize(), null);
                x += this.data.getTitSize();
            }
            x = 0;
            y += this.data.getTitSize();
        }
    }
}
