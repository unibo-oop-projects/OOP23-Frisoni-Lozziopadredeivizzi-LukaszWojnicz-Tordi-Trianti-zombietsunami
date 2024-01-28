package main.java.zombieTsunami.model.mapModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import main.java.zombieTsunami.api.Pair;
import main.java.zombieTsunami.model.mapModel.api.MapDataList;

public class MapDataListImpl implements MapDataList {

    @Override
    public List<Integer> getMapDataList(List<List<Integer>> mapMatrix) {
        return mapMatrix.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    @Override
    public List<Pair<Integer, Integer>> getTilePosition(final int screenRow, final int screenCol, final int titleSize) {
        final List<Pair<Integer, Integer>> tilePos = new ArrayList<>();
        int x = 0;
        int y = 0;

        for (int row = 0; row < screenRow; row++) {
            for (int col = 0; col < screenCol; col++) {
                tilePos.add(new Pair<Integer, Integer>(x, y));
                x += titleSize;
            }
            x = 0;
            y += titleSize;
        }

        return tilePos;
    }

}
