package zombietsunami;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
class TestBomb {
    private final Bomb bomb = new BombImpl();
    private final Zombie zombie = new ZombieImpl();

    /**
     * Checks if the damage has been dealt correctly to the zombie.
     */
    @Test
    void checkDamageReduction() {
        zombie.setStrength(zombie.getStrength() - bomb.getDamage());
        assertEquals(zombie.getStrength(),0);
    }
}
