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

/**
 * Test class for CollisionImpl.
 * 
 * This class contains unit tests for various functionalities of the
 * CollisionImpl
 * class.
 */
public class TestCollision {

    private ZombieImpl zombie = new ZombieImpl();
    private Bomb bomb = new BombImpl();
    private Breakable breakable = new BreakableImpl(1);
    private ObstacleManager obstacleManager = new ObstacleManagerImpl();
    private CollisionImpl collision = new CollisionImpl();
    private GameMap gameMap = new GameMapImpl();
    
    //CHECKSTYLE: MagicNumber OFF
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
