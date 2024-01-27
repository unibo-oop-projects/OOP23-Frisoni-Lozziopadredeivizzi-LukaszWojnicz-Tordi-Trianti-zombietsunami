package main.java.zombieTsunami.model.obstacleFolder.api;

public interface Breakable {
    public boolean canBreakObstacle();
    public void breakObstacle();
    public void addForce();
}
