package zombieTsunami.model.obstacleModel.api;

public interface Breakable {
    public boolean canBreakObstacle();
    public void breakObstacle();
    public void addForce();
}
