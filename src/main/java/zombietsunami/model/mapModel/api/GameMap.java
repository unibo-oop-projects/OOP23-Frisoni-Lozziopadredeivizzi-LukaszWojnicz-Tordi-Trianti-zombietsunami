package zombietsunami.model.mapModel.api;

import java.util.List;

/**
 * This interface loads the map file, whose file type is .txt, and store its data
 * into a List.
 */
public interface GameMap {

    /**
     * @return the list of Integer with the item's number of the map
     */
    List<Integer> getLoadedMapList();

    List<Integer> getLoadedObstacleList();
}
