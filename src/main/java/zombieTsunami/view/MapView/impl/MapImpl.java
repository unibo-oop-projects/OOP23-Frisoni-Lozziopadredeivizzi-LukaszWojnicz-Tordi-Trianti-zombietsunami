package zombieTsunami.view.mapView.impl;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import zombieTsunami.view.Pause;
import zombieTsunami.view.api.KeyHandler;
import zombieTsunami.view.api.VController;
import zombieTsunami.view.mapView.api.Map;
import zombieTsunami.view.mapView.api.TileManager;
import zombieTsunami.view.obstacleView.api.DrawBomb;
import zombieTsunami.view.obstacleView.impl.DrawBombImpl;
import zombieTsunami.view.zombieView.api.DrawZombie;
import zombieTsunami.view.zombieView.impl.DrawZombieImpl;

public final class MapImpl extends JPanel implements Map, Runnable {

    private static final long NANOSEC = 1000000000;
    private static final int FONT_SIZE = 20;
    private static final int RECT_WIDTH = 130;
    private static final int RECT_HEIGHT = 40;
    private static final int INFO_POS_X = 5;
    private static final int INFO_POS_Y = 25;

    private Thread gameThread;
    private VController controller;

    private final TileManager drowMap;
    private final DrawZombie drawZombie;
    private final DrawBomb drawBomb;
    private final KeyHandler keyH;

    public MapImpl(final VController c, final KeyHandler keyH) {
        this.controller = c;
        this.keyH = keyH;
        this.drowMap = new TileManagerImpl();
        this.drawZombie = new DrawZombieImpl();
        this.drawBomb = new DrawBombImpl();
        this.setPreferredSize(new DimensionUIResource(controller.getScreenWC(), controller.getScreenHC()));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

    }

    @Override
    public void gameLoop() {
        final double drowIntervall = NANOSEC / controller.getFPSC();
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drowCount = 0;

        while (!isPause()) {
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
        this.drawZombie.handleKeyPress(this.controller, this.keyH);
    }

    @Override
    public void paintComponent(final Graphics g) {
        super.paintComponent(g);
        final Graphics2D g2 = (Graphics2D) g;
        this.drowMap.drawMap(g2, controller.titleSizeC(), controller.tileElementsC(), controller.mapIndexListC(),
                controller.screenTilePosC());
        this.drawZombie.drawZombieV(g2, controller);
        this.drawBomb.drawBombV(g2, controller);
        drawInfo(g2);
        if (isPause()) {
            Pause.pause(g2);
        }
        g2.dispose();
    }

    @Override
    public void run() {
        while (gameThread != null) {
            if (isPause()) {
                repaint();
            } else {
                gameLoop();
            }
        }
    }

    @Override
    public void startGameThread() {
        this.gameThread = new Thread(this);
        this.gameThread.start();
    }

    private void drawInfo(final Graphics2D g2) {
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(0, 0, RECT_WIDTH, RECT_HEIGHT);
        g2.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));
        g2.setColor(Color.WHITE);
        g2.drawString("Forza   x " + controller.getStrenght(), INFO_POS_X, INFO_POS_Y);
    }

    /**
     * @return if the game is on pause or not
     */
    private boolean isPause() {
        return this.keyH.isOnPause();
    }
}
