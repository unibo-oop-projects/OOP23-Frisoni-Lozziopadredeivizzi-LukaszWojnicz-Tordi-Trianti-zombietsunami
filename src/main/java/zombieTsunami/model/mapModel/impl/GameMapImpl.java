package main.java.zombieTsunami.model.mapModel.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import main.java.zombieTsunami.api.MapData;
import main.java.zombieTsunami.model.MapDataImpl;
import main.java.zombieTsunami.model.mapModel.api.GameMap;

public class GameMapImpl implements GameMap {

    private final String MAP1 = "maps/map01.txt";
    private final String filePath = TileImpl.ROOT + TileImpl.RESOURCES + MAP1;
    
    private final MapData data = new MapDataImpl();
    private final List<List<Integer>> mapTileNum = new ArrayList<>();

    @Override
    public List<List<Integer>> loadMap() {
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            for (int row = 0; row < this.data.getMaxScRow(); row++) {
                final String line = br.readLine();
                final List<Integer> list = new ArrayList<>();

                for (int col = 0; col < this.data.getMaxScCol(); col++) {
                    final List<String> numbers = List.of(line.split(" "));
                    list.add(Integer.parseInt(numbers.get(col)));
                }

                this.mapTileNum.add(row, list);
            }

            br.close();

        } catch (Exception e) {
            e.getMessage();
        }
        
        return mapTileNum;
    }

}
