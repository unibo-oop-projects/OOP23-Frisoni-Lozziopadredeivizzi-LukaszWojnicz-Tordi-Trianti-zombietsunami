package main.java.zombieTsunami.model;

public class MapData {

    // SCREEN SETTINGS
    private final static int originalTitleSize = 16;
    private final static int scale = 3;
    private final static int titleSize = originalTitleSize * scale;

    private final static int maxScreenCol = 16;
    private final static int maxScreenRow = 9;
    private final static int screenWidth = titleSize * maxScreenCol;
    private final static int screenHigh = titleSize * maxScreenRow;

    private final static int FPS = 60;

    //WORLD SETTINGS
    private final static int maxWorldCol = 50;
    private final static int maxWorldRow = 9;
    private final static int worldWidth = titleSize * maxWorldCol;
    private final static int worldHight = titleSize * maxWorldRow;


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

    public static int getMaxWorldCol(){
        return maxWorldCol;
    }

    public static int getMaxWorldRow(){
        return maxWorldRow;
    }

    public static int getWorldWidth(){
        return worldWidth;
    }

    public static int getWorldHight(){
        return worldHight;
    }

}
