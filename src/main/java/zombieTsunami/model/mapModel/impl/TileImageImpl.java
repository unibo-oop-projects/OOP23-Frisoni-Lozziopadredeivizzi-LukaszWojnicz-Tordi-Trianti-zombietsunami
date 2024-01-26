package main.java.zombieTsunami.model.mapModel.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.zombieTsunami.model.mapModel.api.TileImage;

public class TileImageImpl implements TileImage {

    private final List<TileImpl> itemMap = new ArrayList<>();
    private final List<String> element = new ArrayList<>();
    
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
        this.element.add(0, DIRT);
        this.element.add(1, STREET);
        this.element.add(2, SKY);
        this.element.add(3, BULDING_LEFT);
        this.element.add(4, BULDING_NORTH_LEFT);
        this.element.add(5, BULDING_NORTH);
        this.element.add(6, BULDING_NORTH_RIGHT);
        this.element.add(7, BULDING_RIGHT);
        this.element.add(8, BULDING_DOOR);
        this.element.add(9, BULDING_WINDOW);
    }

    @Override
    public List<TileImpl> setTileImage() {
        for(int i = 0; i<element.size(); i++){
            setSingleTile(i, element.get(i));
        }
        return itemMap;

    }

    private final void setSingleTile(final int index, final String source) {
        this.itemMap.add(index, new TileImpl());
        this.itemMap.get(index).setImage(TileImpl.ROOT + TileImpl.RESOURCES + source);
    }

}
