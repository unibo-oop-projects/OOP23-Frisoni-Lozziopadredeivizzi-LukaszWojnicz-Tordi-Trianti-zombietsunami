package zombietsunami;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

import zombietsunami.model.MapData;
import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.mapmodel.impl.GameMapImpl;

class TestLoadMap {

    private final GameMap gameMap = new GameMapImpl();
    private List<Integer> values;

    @Test
    void checkLineOne() {
        values = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i) == values.get(i));
        }
    }

    @Test
    void checkLineTwo() {
        values = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol()) == values.get(i));
        }
    }

    @Test
    void checkLineThree() {
        values = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 2) == values.get(i));
        }
    }

    @Test
    void checkLineFour() {
        values = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5,
                6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 3) == values.get(i));
        }
    }

    @Test
    void checkLineFive() {
        values = List.of(2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9,
                7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2,
                2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2,
                2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 4, 5, 6, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 2);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 4) == values.get(i));
        }
    }

    @Test
    void checkLineSix() {
        values = List.of(2, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9,
                7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2,
                2, 2, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2,
                2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 2, 2, 2, 2, 2, 2, 2, 3, 9, 7, 2, 2, 2);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 5) == values.get(i));
        }
    }

    @Test
    void checLineSeven() {
        values = List.of(6, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9,
                7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 4,
                5, 6, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2,
                2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 4, 5, 6, 2, 2, 2, 2, 3, 9, 7, 2, 4, 5);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 6) == values.get(i));
        }
    }

    @Test
    void checkLineEight() {
        values = List.of(7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9,
                7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 3,
                9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2,
                2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 4, 5, 6, 2, 3, 9, 7, 2, 3, 9);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 7) == values.get(i));
        }
    }

    @Test
    void checkLineNine() {
        values = List.of(7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9,
                7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 3,
                9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2,
                2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 2, 3, 9, 7, 2, 3, 9, 7, 3, 9, 7, 2, 3, 9, 7, 2, 3, 9);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 8) == values.get(i));
        }
    }

    @Test
    void checkLineTen() {
        values = List.of(7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8,
                7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 3,
                8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2,
                2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 2, 3, 8, 7, 2, 2, 3, 8, 7, 2, 3, 8, 7, 3, 8, 7, 10, 3, 8, 7, 2, 3, 8);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 9) == values.get(i));
        }
    }

    @Test
    void checkLineEleven() {
        values = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 10) == values.get(i));
        }
    }

    @Test
    void checkLineTwelve() {
        values = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 11) == values.get(i));
        }
    }

    @Test
    void checkLineThirtheen() {
        values = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 12) == values.get(i));
        }
    }

    @Test
    void checkLineFourtheen() {
        values = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 13) == values.get(i));
        }
    }

    @Test
    void checkLineFivetheen() {
        values = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(values.size() == MapData.getMaxWorldCol());
        for (int i = 0; i < MapData.getMaxWorldCol(); i++) {
            assertTrue(gameMap.getLoadedMapList().get(i + MapData.getMaxWorldCol() * 14) == values.get(i));
        }
    }

}
