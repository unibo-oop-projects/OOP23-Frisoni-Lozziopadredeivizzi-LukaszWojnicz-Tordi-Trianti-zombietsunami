package zombietsunami;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import zombietsunami.model.mapmodel.api.TileElement;
import zombietsunami.model.mapmodel.impl.TileElementImpl;

/**
 * This class is the test to check if the List that contains all the elements'
 * names are right and in the right index.
 */
class TestTileElements {

    private final TileElement tileElement = new TileElementImpl();
    private List<String> elements = new ArrayList<>();

    /**
     * Checks all the elements and their indexes.
     */
    @Test
    void checkAllElements() {
        checkElement(0, "dirt.png");
        checkElement(1, "street.png");
        checkElement(2, "sky.png");
        checkElement(3, "buldingLeft.png");
        checkElement(4, "buldingNorthLeft.png");
        checkElement(5, "buldingNorth.png");
        checkElement(6, "buldingNorthRight.png");
        checkElement(7, "buldingRight.png");
        checkElement(8, "buldingDoor.png");
        checkElement(9, "buldingWindow.png");
        checkElement(10, "flag.png");
    }

    /**
     * This method checks that there is the right elmenet in the right index of the
     * list.
     * 
     * @param index   is the index of the list
     * @param element is the string of the element
     */
    void checkElement(final int index, final String element) {
        this.elements.add(index, element);
        assertEquals(this.elements.get(index), tileElement.getTileElement().get(index));
    }

}
