package zombietsunami;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.api.ObstacleManager;
import zombietsunami.model.obstaclemodel.impl.BombImpl;
import zombietsunami.model.obstaclemodel.impl.BreakableImpl;
import zombietsunami.model.obstaclemodel.impl.ObstacleManagerImpl;
import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;
import zombietsunami.model.CollisionImpl;
import zombietsunami.model.MapData;
import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.mapmodel.impl.GameMapImpl;

/**
 * Test class for CollisionImpl.
 * 
 * This class contains unit tests for various functionalities of the
 * CollisionImpl
 * class.
 */
public class TestCollision {

    private final static ZombieImpl zombie = new ZombieImpl();
    private Bomb bomb = new BombImpl();
    private Breakable breakable = new BreakableImpl(1);
    private ObstacleManager obstacleManager = new ObstacleManagerImpl();
    private CollisionImpl collision = new CollisionImpl();
    private GameMap gameMap = new GameMapImpl();
    

    @Test
    void checkIfCollides() {
        bomb.setX(70);
        bomb.setY(320);
        bomb.setDamage(1);

        breakable.setX(70);
        breakable.setY(320);

        obstacleManager.addBreakable(breakable);
        obstacleManager.addBomb(bomb);
        zombie.setStrenght(5);
        collision.collisionZombieObstacle(MapData.getTitSize(), zombie, 
            gameMap, obstacleManager);

        assertEquals(obstacleManager.getBombList().get(0), null);
        assertEquals(obstacleManager.getBreakableList().get(0), null);
    }
}
