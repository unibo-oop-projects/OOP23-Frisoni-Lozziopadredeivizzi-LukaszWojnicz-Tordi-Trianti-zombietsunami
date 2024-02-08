package zombietsunami.view.mapview.impl;

import java.awt.Graphics2D;
import java.util.List;

import zombietsunami.api.Pair;
import zombietsunami.view.mapview.api.TileImage;
import zombietsunami.view.mapview.api.TileManager;

/**
 * This class implements the TileManager interface
 * {@link zombietsunami.view.mapview.api.TileManager}.
 */
public final class TileManagerImpl implements TileManager {

    private final TileImage tileImg = new TileImageImpl();

    @Override
    public void drawMap(final Graphics2D g2, final int titleSize,
            final List<String> element, final List<Integer> mapIndex,
            final List<Pair<Integer, Integer>> screenTilePos) {

        final var item = tileImg.setTileImage(element);
        for (int i = 0; i < screenTilePos.size(); i++) {
            if (screenTilePos.get(i) != null) {
                g2.drawImage(item.get(mapIndex.get(i)).getImage(), screenTilePos.get(i).getX(),
                        screenTilePos.get(i).getY(),
                        titleSize,
                        titleSize,
                        null);
            }

        }
    }
}
