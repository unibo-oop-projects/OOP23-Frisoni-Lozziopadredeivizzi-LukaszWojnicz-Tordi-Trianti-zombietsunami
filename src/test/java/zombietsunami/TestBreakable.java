package zombietsunami;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.api.ObstacleManager;
import zombietsunami.model.obstaclemodel.impl.BreakableImpl;
import zombietsunami.model.obstaclemodel.impl.ObstacleManagerImpl;
import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;

/**
 * Test class for TestBomb.
 * 
 * This class contains unit tests for various functionalities of the BreakableImpl
 * class.
 */
public class TestBreakable {
    private ObstacleManager obstacleManager = new ObstacleManagerImpl();
    private Breakable breakable = new BreakableImpl(1);
    private Zombie zombie = new ZombieImpl();

    /**
     * Checks if the zombie can break the obstacle.
     */
    @Test
    void checkIfCanBreak() {
        obstacleManager.addBreakable(breakable);
        assertTrue(breakable.canBreakObstacle(zombie.getStrength()));

        zombie.setStrength(-1); //Zombie Strenght = -1, Breakable Force = 1.

        assertFalse(breakable.canBreakObstacle(zombie.getStrength()));
    }
}
