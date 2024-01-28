package main.java.zombieTsunami.model.mapModel.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import main.java.zombieTsunami.model.MapData;
import main.java.zombieTsunami.model.mapModel.api.GameMap;

public class GameMapImpl implements GameMap {

    private final String MAP1 = "maps/map01.txt";
    private final String ROOT = "../../../../../";
    private final String RESOURCES = "resources/zombieTsunami/";

    private final String filePath = ROOT + RESOURCES + MAP1;
    
    private final List<List<Integer>> mapTileNum = new ArrayList<>();

    @Override
    public List<List<Integer>> loadMap() {
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            for (int row = 0; row < MapData.getMaxScRow(); row++) {
                final String line = br.readLine();
                final List<Integer> list = new ArrayList<>();

                for (int col = 0; col < MapData.getMaxScCol(); col++) {
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
