package zombietsunami.view.mapview.impl;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import zombietsunami.view.mapview.api.Tile;
/**
 * This class implements the Tile interface {@link zombietsunami.view.mapview.api.Tile}.
 */
public final class TileImpl implements Tile {

    private BufferedImage image;

    @Override
    public void setImage(final String string) {
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
