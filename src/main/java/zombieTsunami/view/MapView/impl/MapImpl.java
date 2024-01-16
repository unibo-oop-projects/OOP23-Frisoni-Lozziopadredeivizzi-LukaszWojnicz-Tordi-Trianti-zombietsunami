package main.java.zombieTsunami.view.MapView.impl;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

import main.java.zombieTsunami.view.MapView.api.Map;

public class MapImpl extends JPanel implements Map {

    private final int originalTitleSize = 16;
    private final int scale = 3;
    private final int titleSize = originalTitleSize * scale;

    private final int FPS = 60;
    private final static double NANOSEC = 1000000000;

    private Thread gameThread;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public void paintComponent(final Graphics g) {
        super.paintComponent(g);
        final Graphics2D g2 = (Graphics2D) g;
        g2.fillRect(100, 100, 45, 56);
    }


    @Override
    public int getTitleSize() {
        return this.titleSize;
    }

}
