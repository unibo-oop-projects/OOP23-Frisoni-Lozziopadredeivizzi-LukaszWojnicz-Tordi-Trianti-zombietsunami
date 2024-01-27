package main.java.zombieTsunami.view.mapView.impl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import main.java.zombieTsunami.view.zombieView.impl.KeyHandlerImpl;
import main.java.zombieTsunami.view.VControllerImpl;
import main.java.zombieTsunami.view.api.VController;
import main.java.zombieTsunami.view.mapView.api.Map;
import main.java.zombieTsunami.view.zombieView.api.KeyHandler;
import main.java.zombieTsunami.controller.zombieController.api.ControllerZombie;
import main.java.zombieTsunami.controller.zombieController.impl.ControllerZombieImpl;

public class MapImpl extends JPanel implements Map, Runnable {

    private final static long NANOSEC = 100000000;

    private Thread gameThread;
    private VController controller;
    KeyHandler keyH = new KeyHandlerImpl();
    //set zombie position
    private ControllerZombie zombie;
    public MapImpl(final VController c) {
        this.controller=c;
        this.setPreferredSize(new DimensionUIResource(controller.getScreenWC(), controller.getScreenHC()));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener((KeyListener) this.keyH);
        this.setFocusable(true);
    }

    @Override
    public void gameLoop() {
        final double drowIntervall = NANOSEC / controller.getFPSC();
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
        zombie.handleKeyPress();
    }

    public void paintComponent(final Graphics g) {
        super.paintComponent(g);
        final Graphics2D g2 = (Graphics2D) g;
        this.controller.drowMapC(g2);
        zombie= new ControllerZombieImpl(keyH,g2);
        zombie.drawZombie(g2);
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
