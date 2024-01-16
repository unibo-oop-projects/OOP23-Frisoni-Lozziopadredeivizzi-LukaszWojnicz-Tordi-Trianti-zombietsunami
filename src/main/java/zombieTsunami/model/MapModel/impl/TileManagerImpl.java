package main.java.zombieTsunami.model.mapModel.impl;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import main.java.zombieTsunami.controller.Contoller;
import main.java.zombieTsunami.controller.ControllerImpl;
import main.java.zombieTsunami.model.mapModel.api.TileManager;

public class TileManagerImpl implements TileManager {

    private final List<TileImpl> itemMap = new ArrayList<>();
    private final List<List<Integer>> mapTileNum = new ArrayList<>();

    private final Contoller gameController = new ControllerImpl();

    private final String FILE_PATH = "";

    public TileManagerImpl() {
        setTitleImage();
        loadMap(FILE_PATH);
    }

    @Override
    public void setTitleImage() {
        this.itemMap.add(new TileImpl());
        this.itemMap.get(0).setImage("");

        this.itemMap.add(new TileImpl());
        this.itemMap.get(1).setImage("");

        this.itemMap.add(new TileImpl());
        this.itemMap.get(2).setImage("");
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
