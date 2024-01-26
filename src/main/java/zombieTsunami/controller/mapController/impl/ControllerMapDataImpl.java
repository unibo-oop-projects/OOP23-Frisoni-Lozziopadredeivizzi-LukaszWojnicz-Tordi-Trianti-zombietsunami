package main.java.zombieTsunami.controller.mapController.impl;

import main.java.zombieTsunami.api.MapData;
import main.java.zombieTsunami.controller.mapController.api.ControllerMapData;
import main.java.zombieTsunami.model.MapData;

public class ControllerMapDataImpl implements ControllerMapData{

    private final MapData mapData = new MapData();

    @Override
    public int getMaxScreenCol() {
        return this.mapData.getMaxScCol();
    }

    @Override
    public int getMaxScreenRow() {
        return this.mapData.getMaxScRow();
    }

    @Override
    public int getTitleSize() {
        return this.mapData.getTitSize();
    }

    
    
}
