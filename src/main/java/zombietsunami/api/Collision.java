package zombietsunami.api;

import java.util.List;

import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.zombiemodel.api.Zombie;

public interface Collision {

    public void collisionZombieObstacle(List<Bomb> bombList, List<Breakable> breakableList, int tileSize, Zombie zombie);
}
