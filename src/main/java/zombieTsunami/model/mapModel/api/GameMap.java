package main.java.zombieTsunami.model.mapModel.api;

import java.util.List;

public interface GameMap {
    
    /**
     * @return a List of Lists (Matrix alike) with the item's number of the map 
     */
    List<List<Integer>> loadMap();
}
