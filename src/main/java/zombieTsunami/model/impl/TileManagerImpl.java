package main.java.zombieTsunami.model.impl;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import main.java.zombieTsunami.controller.mapController.api.ControllerMapData;
import main.java.zombieTsunami.controller.mapController.impl.ControllerMapDataImpl;
import main.java.zombieTsunami.model.api.TileManager;

public class TileManagerImpl implements TileManager {

    private final List<TileImpl> itemMap = new ArrayList<>();
    private final List<List<Integer>> mapTileNum = new ArrayList<>();

    private final ControllerMapData gameController = new ControllerMapDataImpl();

    private final String ROOT = "../../../../../";
    private final String RESOURCES = "resources/zombieTsunami/";
    private final String MAP1 = "maps/map01.txt";
    private final String DIRT = "dirt.png";
    private final String SKY = "sky.png";
    private final String STREET = "street.png";
    private final String BULDING_LEFT = "buldingLeft.png";
    private final String BULDING_NORTH_LEFT = "buldingNorthLeft.png";
    private final String BULDING_NORTH = "buldingNorth.png";
    private final String BULDING_NORTH_RIGHT = "buldingNorthRight.png";
    private final String BULDING_RIGHT = "buldingRight.png";
    private final String BULDING_DOOR = "buldingDoor.png";
    private final String BULDING_WINDOW = "buldingWindow.png";

    private final String FILE_PATH = ROOT + RESOURCES + MAP1;

    public TileManagerImpl() {
        setTitleImage();
        loadMap(FILE_PATH);
    }

    @Override
    public void setTitleImage() {
        this.itemMap.add(new TileImpl());
        this.itemMap.get(0).setImage(ROOT + RESOURCES + DIRT);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(1).setImage(ROOT + RESOURCES + STREET);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(2).setImage(ROOT + RESOURCES + SKY);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(3).setImage(ROOT + RESOURCES + BULDING_LEFT);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(4).setImage(ROOT + RESOURCES + BULDING_NORTH_LEFT);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(5).setImage(ROOT + RESOURCES + BULDING_NORTH);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(6).setImage(ROOT + RESOURCES + BULDING_NORTH_RIGHT);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(7).setImage(ROOT + RESOURCES + BULDING_RIGHT);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(8).setImage(ROOT + RESOURCES + BULDING_DOOR);

        this.itemMap.add(new TileImpl());
        this.itemMap.get(9).setImage(ROOT + RESOURCES + BULDING_WINDOW);
    }

    @Override
    public void drow(final Graphics2D g2) {
        int x = 0;
        int y = 0;

        for (int row = 0; row < this.gameController.getMaxScreenRow(); row++) {
            for (int col = 0; col < this.gameController.getMaxScreenCol(); col++) {
                int tileNum = this.mapTileNum.get(row).get(col);
                g2.drawImage(itemMap.get(tileNum).getImage(), x, y, this.gameController.getTitleSize(),
                        this.gameController.getTitleSize(), null);
                x += this.gameController.getTitleSize();
            }
            x = 0;
            y += this.gameController.getTitleSize();
        }
    }

    @Override
    public void loadMap(final String filePath) {
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            for (int row = 0; row < this.gameController.getMaxScreenRow(); row++) {
                final String line = br.readLine();
                final List<Integer> list = new ArrayList<>();

                for (int col = 0; col < this.gameController.getMaxScreenCol(); col++) {
                    final List<String> numbers = List.of(line.split(" "));
                    list.add(Integer.parseInt(numbers.get(col)));
                }

                this.mapTileNum.add(row, list);
            }

            br.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }

}
