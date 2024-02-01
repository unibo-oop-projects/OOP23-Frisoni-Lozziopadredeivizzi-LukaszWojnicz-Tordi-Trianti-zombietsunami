package zombieTsunami.model.mapModel.api;

import java.util.List;

import zombieTsunami.api.Pair;

public interface MapPosList {

    /**
     * This method represents the moving camera of the game.
     *  
     * @param worldRow      the map's (world) row
     * @param worldCol      the map's (world) col
     * @param titleSize     the size of title
     * @param zombieWorldX  the zombie's X coordinate on the map (world)
     * @param zombieWorldY  the zombie's Y coordinate on the map (world)
     * @param zombieScreenX the zombie's X coordinate on the screen
     * @param zombieScreenY the zombie's Y coordinate on the screen
     * @return a List of Pair of Integers, where the pair are the positions of every
     *         single tile that has to be putten into the graphic.
     */
    List<Pair<Integer, Integer>> getScreenTilePosition(int worldRow, int worldCol, int titleSize,
            final int zombieWorldX, final int zombieWorldY, final int zombieScreenX,
            final int zombieScreenY);

}
