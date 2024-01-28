package main.java.zombieTsunami.view.mapView.impl;

import java.awt.Graphics2D;
import java.util.List;

import main.java.zombieTsunami.api.Pair;
import main.java.zombieTsunami.view.mapView.api.TileImage;
import main.java.zombieTsunami.view.mapView.api.TileManager;

public class TileManagerImpl implements TileManager {

    private final TileImage tileImg = new TileImageImpl();

    @Override
    public void drow(final Graphics2D g2, final int titleSize,
            List<String> element, List<Integer> mapIndex, List<Pair<Integer, Integer>> tilePos) {
        final var item = tileImg.setTileImage(element);
        for (int i = 0; i < tilePos.size(); i++) {
            g2.drawImage(item.get(mapIndex.get(i)).getImage(), tilePos.get(i).getX(), tilePos.get(i).getY(), titleSize,
                    titleSize,
                    null);
        }
    }
}
