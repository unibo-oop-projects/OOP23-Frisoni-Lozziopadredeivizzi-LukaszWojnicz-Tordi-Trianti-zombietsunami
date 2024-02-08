package zombietsunami.view.mapview.api;

import java.util.List;

import zombietsunami.view.mapview.impl.TileImpl;

/**
 * Allows you to sets the imgages to their relative tiles.
 */
public interface TileImage {

    /**
     * @param element is the list of element of tiles
     * @return a List where each position of the List (the element's number of the
     *         Tile) has their associated Tile
     */
    List<TileImpl> getTileImage(List<String> element);
}
