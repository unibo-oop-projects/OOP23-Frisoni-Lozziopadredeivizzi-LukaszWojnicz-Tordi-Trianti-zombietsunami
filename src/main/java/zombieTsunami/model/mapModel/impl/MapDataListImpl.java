package main.java.zombieTsunami.model.mapModel.impl;

import java.util.List;
import java.util.stream.Collectors;

import main.java.zombieTsunami.model.mapModel.api.MapDataList;

public class MapDataListImpl implements MapDataList {

    @Override
    public List<Integer> getMapDataList(List<List<Integer>> mapMatrix) {
        return mapMatrix.stream().flatMap(List::stream).collect(Collectors.toList());
    }

}
