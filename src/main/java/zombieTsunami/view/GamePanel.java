package main.java.zombieTsunami.view;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import main.java.zombieTsunami.view.mapView.api.Map;
import main.java.zombieTsunami.view.mapView.impl.MapImpl;

public class GamePanel extends JPanel implements Runnable{

    private final Map gameMap = new MapImpl();
    private Thread gameThread;

    private final int maxScreenCol = 16;
    private final int maxScreenRow = 12;
    private final int screenWidth = this.gameMap.getTitleSize() * maxScreenCol;
    private final int screenHigh = this.gameMap.getTitleSize() * maxScreenRow;

    
    public GamePanel(){
        this.setPreferredSize(new DimensionUIResource(this.screenWidth, this.screenHigh));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    @Override
    public void run() {
        this.gameMap.gameLoop();
    }

    public void startGameThread(){
        this.gameThread = new Thread(this);
        this.gameThread.start();
    }
    
}
