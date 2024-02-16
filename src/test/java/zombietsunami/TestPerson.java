package zombietsunami;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;

/**
 * Test class for Person.
 * 
 * This class tests the funcionalities of the Person class.
 */
class TestPerson {
    private final Zombie zombie = new ZombieImpl();

    /**
     * Checks if the increase has been dealt correctly to the zombie.
     */
    @Test
    void checkIncrease(){
        zombie.increaseStrength();
        assertEquals(zombie.getStrength(), 2);

    }
    
}
