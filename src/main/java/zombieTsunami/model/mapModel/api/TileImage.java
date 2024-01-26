package main.java.zombieTsunami.model.mapModel.api;

import java.util.List;

import main.java.zombieTsunami.model.mapModel.impl.TileImpl;

public interface TileImage {

    /**
     * @return a List where each position of the List (the element's number of the
     *         Tile) has their associated Tile
     */
    public List<TileImpl> setTileImage();
}
