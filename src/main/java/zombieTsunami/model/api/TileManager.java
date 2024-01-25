package main.java.zombieTsunami.model.api;

import java.awt.Graphics2D;

public interface TileManager {

    void setTitleImage();

    void drow(Graphics2D g2);
    
    void loadMap(String filePath);
    
}
