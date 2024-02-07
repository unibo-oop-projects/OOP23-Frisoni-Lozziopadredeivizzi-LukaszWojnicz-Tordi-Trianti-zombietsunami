package zombietsunami.model.mapModel.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import zombietsunami.model.MapData;
import zombietsunami.model.mapModel.api.GameMap;

/**
 * This class implements the GameMap interface
 * {@link zombietsunami.model.mapModel.api.GameMap}.
 */
public final class GameMapImpl implements GameMap {

    private static final String SEP = "/";
    private static final String MAP1 = "maps/map01.txt";
    private static final String OBST = "obstaclemap/obstacleMap.txt";
    private static final String ROOT = SEP + "zombietsunami" + SEP;

    private final String filePathMap = ROOT + MAP1;
    private final String filePathObst = ROOT + OBST;


    private final List<Integer> mapOfNumberTile;
    private final List<Integer> mapOfNumberObstacle;

    /**
     * Assigns the List of Integers with the map values at a new List.
     */
    public GameMapImpl() {
        this.mapOfNumberTile = loadMap(this.filePathMap);
        this.mapOfNumberObstacle = loadMap(filePathObst);
    }

    /**
     * This method reads the map's txt file and take all the numbers written into it
     * to then register them firstly into a List of integer's List (like a matrix),
     * then transform it into a List of Integers.
     * 
     * @param filePath is the path where to catch the txt file where the map is
     *                 written
     * @return a List of Integers with all the item's numbers of the map
     */
    private List<Integer> loadMap(final String filePath) {
        final List<List<Integer>> mapTileNum = new ArrayList<>();
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            for (int row = 0; row < MapData.getMaxWorldRow(); row++) {
                final String line = br.readLine();
                final List<Integer> list = new ArrayList<>();

                for (int col = 0; col < MapData.getMaxWorldCol(); col++) {
                    final List<String> numbers = List.of(line.split(" "));
                    list.add(Integer.parseInt(numbers.get(col)));
                }

                mapTileNum.add(row, list);
            }

            br.close();

        } catch (Exception e) {
            e.getMessage();
        }

        return mapTileNum.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    @Override
    public List<Integer> getLoadedMapList() {
        return this.mapOfNumberTile;
    }

    @Override
    public List<Integer> getLoadedObstacleList() {
        return this.mapOfNumberObstacle;
    }

}
