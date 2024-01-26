package main.java.zombieTsunami.model.mapModel.api;

import java.awt.Graphics2D;

public interface TileManager {

    /**
     * method to drow the rispective tile of the game map.
     * 
     * @param g2 graphic 2D to drow the tile
     * @param screenCol screen Columns
     * @param screenRow screen rows
     * @param titleSize title's size for the game
     */
    void drow(Graphics2D g2, int screenCol, int screenRow, int titleSize);
    
}
