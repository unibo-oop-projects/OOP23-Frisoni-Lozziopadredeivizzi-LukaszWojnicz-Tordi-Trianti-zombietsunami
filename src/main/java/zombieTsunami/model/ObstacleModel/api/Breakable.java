package main.java.zombieTsunami.model.ObstacleModel.api;

public interface Breakable {
    public boolean canBreakObstacle();
    public void breakObstacle();
    public void addForce();
}
