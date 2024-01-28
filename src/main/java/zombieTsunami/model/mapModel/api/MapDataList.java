package main.java.zombieTsunami.model.mapModel.api;

import java.util.List;

public interface MapDataList {
    
    /**
     * @param mapMatrix
     * @return a List of Integer from the @param mapMatrix 
     */
    List<Integer> getMapDataList(List<List<Integer>> mapMatrix);
}
