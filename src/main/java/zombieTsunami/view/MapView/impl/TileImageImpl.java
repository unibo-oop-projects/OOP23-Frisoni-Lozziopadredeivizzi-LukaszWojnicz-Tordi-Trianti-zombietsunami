package main.java.zombieTsunami.view.mapView.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.zombieTsunami.view.mapView.api.TileImage;

public class TileImageImpl implements TileImage {

    private static final String DOT = "..";
    private static final String SEP = "/";
    private static final String ROOT = DOT + SEP + DOT + SEP + DOT + SEP + DOT + SEP + DOT + SEP;
    private static final String RESOURCES = "resources/zombieTsunami/tile/";

    private final List<TileImpl> itemMap = new ArrayList<>();

    @Override
    public List<TileImpl> setTileImage(final List<String> element) {
        for(int i = 0; i<element.size(); i++){
            setSingleTile(i, element.get(i));
        }
        return itemMap;

    }

    private final void setSingleTile(final int index, final String source) {
        this.itemMap.add(index, new TileImpl());
        this.itemMap.get(index).setImage(ROOT + RESOURCES + source);
    }

}
