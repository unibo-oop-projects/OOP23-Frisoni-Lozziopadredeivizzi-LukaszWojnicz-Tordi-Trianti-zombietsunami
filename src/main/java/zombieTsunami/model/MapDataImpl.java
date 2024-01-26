package main.java.zombieTsunami.model;

import main.java.zombieTsunami.api.MapData;

public class MapDataImpl implements MapData{
    
    private final int originalTitleSize = 16;
    private final int scale = 3;
    private final int titleSize = originalTitleSize * scale;

    private final int FPS = 60;
    public final static double NANOSEC = 1000000000;

    private final int maxScreenCol = 16;
    private final int maxScreenRow = 9;
    private final int screenWidth = titleSize * maxScreenCol;
    private final int screenHigh = titleSize * maxScreenRow;

    @Override
    public int getMaxScCol() {
        return this.maxScreenCol;
    }
    @Override
    public int getMaxScRow() {
        return this.maxScreenRow;
    }
    @Override
    public int getTitSize() {
        return this.titleSize;
    }
    @Override
    public int getFPS() {
        return this.FPS;
    }
    @Override
    public int getScreenW() {
        return this.screenWidth;
    }
    @Override
    public int getScreenH() {
        return this.screenHigh;
    }

}
