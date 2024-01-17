package main.java.zombieTsunami.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import main.java.zombieTsunami.controller.api.ControllerMapData;
import main.java.zombieTsunami.controller.impl.ControllerMapDataImpl;
import main.java.zombieTsunami.view.mapView.api.MapData;
import main.java.zombieTsunami.view.mapView.impl.MapDataImpl;

public class StartMenu extends JPanel{

    private final JButton startButtonGame = new JButton("START PLAY");
    private final JButton rulesButton = new JButton("RULES");

    private final MapData data = new MapDataImpl();


    public StartMenu(){
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new DimensionUIResource(this.data.getScreenW(), this.data.getScreenH()));
    }


    
}
