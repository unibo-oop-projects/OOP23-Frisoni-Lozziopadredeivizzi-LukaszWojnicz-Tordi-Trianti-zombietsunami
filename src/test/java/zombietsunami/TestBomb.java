package zombietsunami;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.impl.BombImpl;
import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;

/**
 * Test class for TestBomb.
 * 
 * This class contains unit tests for various functionalities of the BombImpl
 * class.
 */
public class TestBomb {
    
    private Bomb bomb = new BombImpl();
    private Zombie zombie = new ZombieImpl();

    /**
     * Checks if the damage has been dealt correctly to the zombie.
     */
    @Test
    void checkDamageReduction() {
        zombie.setStrenght(zombie.getStrenght() - bomb.getDamage());
        assertTrue(zombie.getStrenght() == 0);
    }
}
