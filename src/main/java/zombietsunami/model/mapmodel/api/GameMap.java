package zombietsunami.model.mapmodel.api;

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

    /**
     * @return the list of Integer with the item's number of the obstacles
     */
    List<Integer> getLoadedObstacleList();

    /**
     * Removes an obstacle from the list.
     * @param index
     */
    void removeObstacleListItem(int index);

    /**
     * @return the list of Integer with the item's number of the Person
     */
    List<Integer> getLoadedPersonList();

    /**
     * Removes a Person from the list
     * @param index index of Person
     */
    void removePersonListItem(int index);
}
