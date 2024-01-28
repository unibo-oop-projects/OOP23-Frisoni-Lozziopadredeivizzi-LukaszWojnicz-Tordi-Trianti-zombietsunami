package main.java.zombieTsunami.view.mapView.api;

import java.awt.Graphics2D;
import java.util.List;

public interface TileManager {

    /**
     * method to drow the rispective tile of the game map.
     * 
     * @param g2 graphic 2D to drow the tile
     * @param screenCol screen Columns
     * @param screenRow screen rows
     * @param titleSize title's size for the game
     */
    void drow(Graphics2D g2, int screenCol, int screenRow, int titleSize, List<String> element);
    
}
