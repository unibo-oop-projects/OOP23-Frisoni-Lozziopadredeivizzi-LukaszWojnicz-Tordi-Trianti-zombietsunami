package main.java.zombieTsunami.model.mapModel.api;

import java.util.List;

import main.java.zombieTsunami.api.Pair;

public interface MapPosList {

    List<Pair<Integer, Integer>> getTilePosition(int screenRow, int screenCol, int titleSize);
}
