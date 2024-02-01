package zombieTsunami.model;

public class MapData {

    // SCREEN SETTINGS
    private final static int originalTitleSize = 16;
    private final static int scale = 3;
    private final static int titleSize = originalTitleSize * scale;

    private final static int maxScreenCol = 16;
    private final static int maxScreenRow = 9;
    private final static int screenWidth = titleSize * maxScreenCol;
    private final static int screenHigh = titleSize * maxScreenRow;

    //FPS
    private final static int FPS = 60;

    //WORLD SETTINGS
    private final static int maxWorldCol = 50;
    private final static int maxWorldRow = 12;
    private final static int worldWidth = titleSize * maxWorldCol;
    private final static int worldHight = titleSize * maxWorldRow;


    /**
     * @return the screen's cols
     */
    public static int getMaxScCol() {
        return maxScreenCol;
    }

    /**
     * @return the screen's rows
     */
    public static int getMaxScRow() {
        return maxScreenRow;
    }

    /**
     * @return the title's size
     */
    public static int getTitSize() {
        return titleSize;
    }

    /**
     * @return the FPS' value
     */
    public static int getFPS() {
        return FPS;
    }

    /**
     * @return the screen width
     */
    public static int getScreenW() {
        return screenWidth;
    }

    /**
     * @return the screen height
     */
    public static int getScreenH() {
        return screenHigh;
    }

    /**
     * @return the map's (world) cols
     */
    public static int getMaxWorldCol(){
        return maxWorldCol;
    }

    /**
     * @return the map's (world) rows
     */
    public static int getMaxWorldRow(){
        return maxWorldRow;
    }

    /**
     * @return the map (world) width
     */
    public static int getWorldWidth(){
        return worldWidth;
    }

    /**
     * @return the map (world) height
     */
    public static int getWorldHeight(){
        return worldHight;
    }

}
