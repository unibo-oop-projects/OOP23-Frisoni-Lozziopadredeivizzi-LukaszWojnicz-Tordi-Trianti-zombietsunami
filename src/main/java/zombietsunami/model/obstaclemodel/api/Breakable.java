package zombietsunami.model.obstaclemodel.api;

public interface Breakable {
    public boolean canBreakObstacle(int zombieForce);
    public void breakObstacle();
}
