package main.java.zombieTsunami.model.MapModel.impl;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.java.zombieTsunami.model.MapModel.api.Tile;

public class TileImpl implements Tile{

    private BufferedImage image;
    private boolean collision = false;

    @Override
    public void setImage(String string) {
        try {
            this.image = ImageIO.read(getClass().getResourceAsStream(string));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BufferedImage getImage() {
        return this.image;
    }
    
}
