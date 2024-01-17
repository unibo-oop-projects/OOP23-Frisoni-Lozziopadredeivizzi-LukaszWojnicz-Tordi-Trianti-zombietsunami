package main.java.zombieTsunami.view.mapView.impl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import main.java.zombieTsunami.controller.api.ControllerTile;
import main.java.zombieTsunami.controller.impl.ControllerTileImpl;
import main.java.zombieTsunami.view.mapView.api.Map;
import main.java.zombieTsunami.view.mapView.api.MapData;

public class MapImpl extends JPanel implements Map, Runnable {

    private Thread gameThread;
    private final MapData data = new MapDataImpl();
    private final ControllerTile tileControll = new ControllerTileImpl();

    public MapImpl() {
        this.setPreferredSize(new DimensionUIResource(this.data.getScreenW(), this.data.getScreenH()));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    @Override
    public void gameLoop() {
        final double drowIntervall = MapDataImpl.NANOSEC / this.data.getFPS();
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drowCount = 0;

        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drowIntervall;
            timer += (currentTime - lastTime);
            lastTime = currentTime;
            if (delta >= 1) {
                update();
                repaint();
                delta--;
                drowCount++;
            }

            if (timer >= MapDataImpl.NANOSEC) {
                System.out.println("FPS: " + drowCount);
                drowCount = 0;
                timer = 0;
            }
        }
    }

    @Override
    public void update() {
        
    }

    public void paintComponent(final Graphics g) {
        super.paintComponent(g);
        final Graphics2D g2 = (Graphics2D) g;
        this.tileControll.drowMap(g2);
    }

    @Override
    public void run() {
        gameLoop();
    }

    @Override
    public void startGameThread() {
        this.gameThread = new Thread(this);
        this.gameThread.start();
    }
}
