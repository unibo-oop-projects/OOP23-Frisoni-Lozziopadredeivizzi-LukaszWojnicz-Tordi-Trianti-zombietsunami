package zombietsunami;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import zombietsunami.model.MapData;
import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.mapmodel.impl.GameMapImpl;

/**
 * This class is the test to check if the values in the map's txt file are
 * correctly readden.
 */
class TestLoadMap {

    private final GameMap gameMap = new GameMapImpl();
    private List<Integer> values;

    /**
     * This method is the check for the first values line of the map.
     */
    @Test
    void checkLineOne() {
        values = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(values.get(i), gameMap.getLoadedMapList().get(i));
        }
    }

    /**
     * This method is the check for the second values line of the map.
     */
    @Test
    void checkLineTwo() {
        values = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol()), values.get(i));
        }
    }

    /**
     * This method is the check for the third values line of the map.
     */
    @Test
    void checkLineThree() {
        values = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 2), values.get(i));
        }
    }

    /**
     * This method is the check for the fourth values line of the map.
     */
    @Test
    void checkLineFour() {
        values = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5,
                6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 3), values.get(i));
        }
    }

    /**
     * This method is the check for the fifth values line of the map.
     */
    @Test
    void checkLineFive() {
        values = List.of(2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9,
                7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2,
                2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2,
                2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 2);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 4), values.get(i));
        }
    }

    /**
     * This method is the check for the sixth values line of the map.
     */
    @Test
    void checkLineSix() {
        values = List.of(2, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9,
                7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2,
                2, 2, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2,
                2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 2);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 5), values.get(i));
        }
    }

    /**
     * This method is the check for the seventh values line of the map.
     */
    @Test
    void checLineSeven() {
        values = List.of(6, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9,
                7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 4,
                5, 6, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2,
                2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 4, 5);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 6), values.get(i));
        }
    }

    /**
     * This method is the check for the eighth values line of the map.
     */
    @Test
    void checkLineEight() {
        values = List.of(7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9,
                7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 3,
                9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2,
                2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 3, 9);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 7), values.get(i));
        }
    }

    /**
     * This method is the check for the nineth values line of the map.
     */
    @Test
    void checkLineNine() {
        values = List.of(7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9,
                7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 3,
                9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2,
                2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 3, 9);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 8), values.get(i));
        }
    }

    /**
     * This method is the check for the tenth values line of the map.
     */
    @Test
    void checkLineTen() {
        values = List.of(7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8,
                7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 3,
                8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2,
                2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 10, 3, 8, 7, 2, 3, 8);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 9), values.get(i));
        }
    }

    /**
     * This method is the check for the eleventh values line of the map.
     */
    @Test
    void checkLineEleven() {
        values = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 10), values.get(i));
        }
    }

    /**
     * This method is the check for the twelveth values line of the map.
     */
    @Test
    void checkLineTwelve() {
        values = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 11), values.get(i));
        }
    }

    /**
     * This method is the check for the thirtheenth values line of the map.
     */
    @Test
    void checkLineThirtheen() {
        values = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 12), values.get(i));
        }
    }

    /**
     * This method is the check for the fourtheenth values line of the map.
     */
    @Test
    void checkLineFourtheen() {
        values = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 13), values.get(i));
        }
    }

    /**
     * This method is the check for the fivetheenth values line of the map.
     */
    @Test
    void checkLineFivetheen() {
        values = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(values.size(), MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertEquals(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 14), values.get(i));
        }
    }

}
