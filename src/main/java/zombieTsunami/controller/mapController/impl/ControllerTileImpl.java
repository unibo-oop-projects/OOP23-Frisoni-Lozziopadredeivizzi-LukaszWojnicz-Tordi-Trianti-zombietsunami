package main.java.zombieTsunami.controller.mapController.impl;

import java.awt.Graphics2D;

import main.java.zombieTsunami.controller.mapController.api.ControllerTile;
import main.java.zombieTsunami.model.api.TileManager;
import main.java.zombieTsunami.model.impl.TileManagerImpl;

public class ControllerTileImpl implements ControllerTile{

    private final TileManager tileMan = new TileManagerImpl();

    @Override
    public void drowMap(Graphics2D g2) {
        this.tileMan.drow(g2);
    }
    
}
