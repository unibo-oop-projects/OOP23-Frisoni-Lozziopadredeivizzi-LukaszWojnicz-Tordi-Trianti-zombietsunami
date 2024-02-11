
package zombietsunami;

import org.junit.jupiter.api.Test;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for ZombieImpl.
 * 
 * This class contains unit tests for various functionalities of the ZombieImpl
 * class.
 */
class TestZombie {

    private final ZombieImpl zombie = new ZombieImpl();

    /**
     * Test method to verify the default position of the zombie.
     * 
     * This test ensures that the zombie's initial position is correctly set to
     * (380, 450)
     * and its speed is set to 1.
     */
    @Test
    void checkDefaultPosition() {
        assertEquals(zombie.getX(), 380);
        assertEquals(zombie.getY(), 450);
        assertEquals(zombie.getSpeed(), 1);
    }

    /**
     * Test method to verify the update of the zombie's position.
     * 
     * This test checks if the zombie's position is correctly updated after
     * calling the update method twice. It verifies that the zombie moves two units
     * to the right along the X-axis while maintaining its Y position.
     */

    @Test
    void checkUpdatePosition() {
        zombie.update();
        zombie.update();
        assertEquals(zombie.getX(), 382);
        assertEquals(zombie.getY(), 450);
    }

    /**
     * Test method to verify the jumping behavior of the zombie.
     * 
     * This test validates the jumping functionality of the zombie by:
     * 1. Triggering the jump action and ensuring the zombie enters the jumping
     * state.
     * 2. Simulating the zombie's jump to its maximum height (Y = 360), checking its
     * X position remains unchanged.
     * 3. Verifying that the zombie's Y position is not greater than 360 after
     * reaching the maximum height.
     * 4. Confirming that the zombie returns to its original position after
     * completing the jump.
     * 5. Ensuring the zombie exits the jumping state after completing the jump.
     */

    @Test
    void checkJumpPosition() {
        zombie.jumpPress();
        assertTrue(zombie.isJumping());

        for (int i = 450; i >= 360; i--) {
            assertEquals(zombie.getX() , 380);
            zombie.updateJumpZombie();
        }

        assertFalse(zombie.getY() > 360);
        assertEquals(zombie.getY(), 360);
        assertEquals(zombie.getX(), 380);

        for (int i = 360; i <= 450; i++) {
            assertEquals(zombie.getX(), 380);
            zombie.updateJumpZombie();
        }
        assertEquals(zombie.getY(), 450);
        assertFalse(zombie.isJumping());
    }
}
