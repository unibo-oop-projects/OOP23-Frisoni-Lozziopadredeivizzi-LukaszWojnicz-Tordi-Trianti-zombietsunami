package main.java.zombieTsunami.model.ObstacleModel.api;

import java.awt.Graphics2D;

public interface Obstacle {
    void drawObstacle(Graphics2D g2);
    void update();
}
