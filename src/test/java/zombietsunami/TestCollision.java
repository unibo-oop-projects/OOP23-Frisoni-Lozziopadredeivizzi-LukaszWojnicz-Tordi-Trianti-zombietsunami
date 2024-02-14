package zombietsunami;

import org.junit.jupiter.api.Test;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.api.ObstacleManager;
import zombietsunami.model.obstaclemodel.impl.BombImpl;
import zombietsunami.model.obstaclemodel.impl.BreakableImpl;
import zombietsunami.model.obstaclemodel.impl.ObstacleManagerImpl;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;
import zombietsunami.model.CollisionImpl;
import zombietsunami.model.MapData;
import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.mapmodel.impl.GameMapImpl;

// CHECKSTYLE: MagicNumber OFF
/**
 * Test class for CollisionImpl.
 * 
 * This class contains unit tests for various functionalities of the
 * CollisionImpl
 * class.
 */
class TestCollision {

    private final  ZombieImpl zombie = new ZombieImpl();
    private final Bomb bomb = new BombImpl();
    private final Breakable breakable = new BreakableImpl(1);
    private final ObstacleManager obstacleManager = new ObstacleManagerImpl();
    private final CollisionImpl collision = new CollisionImpl();
    private final GameMap gameMap = new GameMapImpl();

    @Test
    void checkIfCollides() {
        bomb.setX(70);
        bomb.setY(320);
        bomb.setDamage(1);

        breakable.setX(70);
        breakable.setY(320);

        obstacleManager.addBreakable(breakable);
        obstacleManager.addBomb(bomb);
        zombie.setStrength(5);
        collision.collisionZombieObstacle(obstacleManager.getBombList(), obstacleManager.getBreakableList(),
                MapData.getTitSize(), zombie, gameMap);
    }
}
