package zombieTsunami.view.mapView.impl;

import java.awt.Graphics2D;
import java.util.List;

import zombieTsunami.api.Pair;
import zombieTsunami.view.mapView.api.TileImage;
import zombieTsunami.view.mapView.api.TileManager;

public class TileManagerImpl implements TileManager {

    private final TileImage tileImg = new TileImageImpl();

    @Override
    public void drawMap(final Graphics2D g2, final int titleSize,
            List<String> element, List<Integer> mapIndex, List<Pair<Integer, Integer>> screenTilePos) {
            
        final var item = tileImg.setTileImage(element);
        for (int i = 0; i < screenTilePos.size(); i++) {
            g2.drawImage(item.get(mapIndex.get(i)).getImage(), screenTilePos.get(i).getX(), screenTilePos.get(i).getY(),
                    titleSize,
                    titleSize,
                    null);
        }
    }
}
