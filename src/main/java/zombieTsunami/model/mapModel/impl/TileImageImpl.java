package main.java.zombieTsunami.model.mapModel.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.zombieTsunami.model.mapModel.api.TileImage;

public class TileImageImpl implements TileImage {

    private final Map<String, TileImpl> itemMap = new HashMap<>();
    private final List<String> element;

    private final String ROOT = "../../../../../";
    private final String RESOURCES = "resources/zombieTsunami/";
    private final String DIRT = "dirt.png";
    private final String SKY = "sky.png";
    private final String STREET = "street.png";
    private final String BULDING_LEFT = "buldingLeft.png";
    private final String BULDING_NORTH_LEFT = "buldingNorthLeft.png";
    private final String BULDING_NORTH = "buldingNorth.png";
    private final String BULDING_NORTH_RIGHT = "buldingNorthRight.png";
    private final String BULDING_RIGHT = "buldingRight.png";
    private final String BULDING_DOOR = "buldingDoor.png";
    private final String BULDING_WINDOW = "buldingWindow.png";

    public TileImageImpl() {
        this.element = new ArrayList<>(List.of(DIRT, SKY, STREET, BULDING_LEFT, BULDING_NORTH_LEFT, BULDING_NORTH,
                BULDING_NORTH_RIGHT, BULDING_RIGHT, BULDING_DOOR, BULDING_WINDOW));
    }

    @Override
    public void setTileImage() {

        this.element.forEach(x -> {
            setSingleTile(x);
        });

    }

    private final void setSingleTile(final String source) {
        this.itemMap.put(source, new TileImpl());
        this.itemMap.get(source).setImage(ROOT + RESOURCES + source);
    }

}
