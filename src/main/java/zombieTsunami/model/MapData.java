package main.java.zombieTsunami.model;

public class MapData{
    
    private final static int originalTitleSize = 16;
    private final static int scale = 3;
    private final static int titleSize = originalTitleSize * scale;

    private final static int FPS = 60;

    private final static int maxScreenCol = 16;
    private final static int maxScreenRow = 9;
    private final static int screenWidth = titleSize * maxScreenCol;
    private final static int screenHigh = titleSize * maxScreenRow;

    
    public static int getMaxScCol() {
        return maxScreenCol;
    }
    
    public static int getMaxScRow() {
        return maxScreenRow;
    }
    
    public static int getTitSize() {
        return titleSize;
    }
    
    public static int getFPS() {
        return FPS;
    }
    
    public static int getScreenW() {
        return screenWidth;
    }
    
    public static int getScreenH() {
        return screenHigh;
    }

}
