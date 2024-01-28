package main.java.zombieTsunami.model.mapModel.api;

import java.util.List;

import main.java.zombieTsunami.api.Pair;

public interface MapDataList {
    
    /**
     * @param mapMatrix
     * @return a List of Integer from the @param mapMatrix 
     */
    List<Integer> getMapDataList(List<List<Integer>> mapMatrix);

    List<Pair<Integer, Integer>> getTilePosition(int screenRow, int screenCol, int titleSize);
}
