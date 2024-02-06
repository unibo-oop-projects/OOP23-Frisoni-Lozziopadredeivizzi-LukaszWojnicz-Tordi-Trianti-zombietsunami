package zombieTsunami.model.obstacleModel.api;

public interface Breakable {
    public boolean canBreakObstacle(int zombieForce);
    public void breakObstacle();
}
