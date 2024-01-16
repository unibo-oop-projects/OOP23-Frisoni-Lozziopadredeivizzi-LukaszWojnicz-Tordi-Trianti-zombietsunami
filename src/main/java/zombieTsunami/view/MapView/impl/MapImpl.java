package main.java.zombieTsunami.view.mapView.impl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import main.java.zombieTsunami.view.mapView.api.Map;

public class MapImpl extends JPanel implements Map, Runnable {

    private final int originalTitleSize = 16;
    private final int scale = 3;
    private final int titleSize = originalTitleSize * scale;

    private final int FPS = 60;
    private final static double NANOSEC = 1000000000;

    private final int maxScreenCol = 16;
    private final int maxScreenRow = 12;
    private final int screenWidth = titleSize * maxScreenCol;
    private final int screenHigh = titleSize * maxScreenRow;

    private Thread gameThread;

    public MapImpl() {
        this.setPreferredSize(new DimensionUIResource(this.screenWidth, this.screenHigh));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    @Override
    public void gameLoop() {
        final double drowIntervall = NANOSEC / this.FPS;
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

            if (timer >= NANOSEC) {
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
        g2.fillRect(100, 100, 45, 56);
        g2.setColor(Color.WHITE);
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
