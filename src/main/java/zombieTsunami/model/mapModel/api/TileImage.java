package main.java.zombieTsunami.model.mapModel.api;

import java.util.Map;

import main.java.zombieTsunami.model.mapModel.impl.TileImpl;

public interface TileImage {
   
    /**
     * @return a Map where each String (the element of the Tile) has their associated Tile 
     */
    public Map<String, TileImpl> setTileImage();
}
