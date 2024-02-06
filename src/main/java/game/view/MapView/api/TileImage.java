package zombieTsunami.view.mapView.api;

import java.util.List;

import zombieTsunami.view.mapView.impl.TileImpl;

public interface TileImage {

    
    /**
     * @param element is the list of element of tiles
     * @return a List where each position of the List (the element's number of the
     *         Tile) has their associated Tile
     */
    List<TileImpl> setTileImage(List<String> element);
}
