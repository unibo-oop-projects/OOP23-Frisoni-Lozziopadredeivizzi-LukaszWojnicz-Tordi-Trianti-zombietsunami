package zombieTsunami.model.mapModel.api;

import java.util.List;

public interface GameMap {
    
    /**
     * @return a List with the item's number of the map 
     */
    List<Integer> loadMap();

    /**
     * @return the list of Integer with the item's nuber of the map
     */
    List<Integer> getLoadedMapList();
}
