package main.java.zombieTsunami.controller;

import main.java.zombieTsunami.view.mapView.api.Map;
import main.java.zombieTsunami.view.mapView.impl.MapImpl;

public class ControllerImpl implements Contoller{

    private final Map gameMap = new MapImpl();

    @Override
    public int getMaxScreenCol() {
        return this.gameMap.getMaxScCol();
    }

    @Override
    public int getMaxScreenRow() {
        return this.gameMap.getMaxScRow();
    }

    @Override
    public int getTitleSize() {
        return this.gameMap.getTitSize();
    }
    
}
