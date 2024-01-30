package main.java.zombieTsunami.model.mapModel.api;

import java.util.List;

import main.java.zombieTsunami.api.Pair;

public interface MapPosList {

    List<Pair<Integer, Integer>> getScreenTilePosition(int worldRow, int worldCol, int titleSize,
            final int zombieWorldX, final int zombieWorldY, final int zombieScreenX,
            final int zombieScreenY);
}
