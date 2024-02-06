package zombietsunami.view.mapView.api;

import java.awt.image.BufferedImage;

public interface Tile {

    /**
     * This method assigns at the BufferedImage fild its image.
     * 
     * @param string is the path to take the image resource.
     */
    void setImage(String string);

    /**
     * @return the setted image of the Tile class.
     */
    BufferedImage getImage();
}
