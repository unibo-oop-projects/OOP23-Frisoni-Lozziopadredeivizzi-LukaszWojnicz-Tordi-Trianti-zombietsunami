package main.java.zombieTsunami.model.mapModel.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.zombieTsunami.model.mapModel.api.TileManager;

public class TileManagerImpl implements TileManager{

    private final List<TileImpl> itemMap = new ArrayList<>();
    private final List<List<Integer>> mapTileNum = new ArrayList<>();

    public TileManagerImpl(){
        setTitleImage();
        loadMap();
    }

    @Override
    public void setTitleImage() {
        this.itemMap.add(new TileImpl());
        this.itemMap.get(0).setImage("");

        this.itemMap.add(new TileImpl());
        this.itemMap.get(1).setImage("");

        this.itemMap.add(new TileImpl());
        this.itemMap.get(2).setImage("");
    }

    @Override
    public void drow() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drow'");
    }

    @Override
    public void loadMap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadMap'");
    }
    
}
