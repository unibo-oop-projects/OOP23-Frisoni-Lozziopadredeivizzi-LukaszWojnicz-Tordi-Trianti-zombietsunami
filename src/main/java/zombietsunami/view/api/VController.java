package zombietsunami.view.api;

import java.awt.image.BufferedImageOp;
import java.util.List;

import zombietsunami.api.Controller;
import zombietsunami.api.Pair;

/**
 * Interface representing the View Controller in the Zombie Tsunami game.
 * It provides methods to retrieve and update various game-related information.
 */
public interface VController {

    void set(Controller c);

    int getScreenWC();

    int getScreenHC();

    int screenColC();

    int screenRowC();

    int titleSizeC();

    int getFPSC();

    List<String> tileElementsC();

    List<Pair<Integer, Integer>> screenTilePosC();

    List<Integer> mapIndexListC();

    /**
     * Gets the current X-coordinate of the zombie on the map.
     *
     * @return The X-coordinate of the zombie on the map.
     */
    int getZombieMapX();

    /**
     * Gets the current Y-coordinate of the zombie on the map.
     *
     * @return The Y-coordinate of the zombie on the map.
     */
    int getZombieMapY();

    /**
     * Gets the speed of the zombie in the game.
     *
     * @return The speed of the zombie.
     */
    int getSpeed();

    /**
     * Gets the constant representing the number of X units.
     *
     * @return The constant value for the number of X units.
     */
    int getNumX();

    /**
     * Updates the position and state of the zombie in the game.
     */
    void updateZombie();

    int getWorldColC();

    int getWorldRowC();

    int getWorldWidthC();

    int getWorldHightC();

    int getPersonMapX();

    int getPersonMapY();

    void updatePerson();

    /**
     * Gets the current strength of the zombie character in the game.
     *
     * @return The strength of the zombie character.
     */
    int getStrenght();

    /**
     * Increases the strength of the player character by one.
     */
    void increaseStrenght();

    /**
     * Sets the strength of the player character to the specified value.
     *
     * @param strenght The new strength value.
     */
    void setStrenght(int strenght);

    /**
     * Gets the current X-coordinate of the zombie on the screen.
     *
     * @return The X-coordinate of the zombie on the screen.
     */
    int getZombieScreenX();

    /**
     * Gets the current Y-coordinate of the zombie on the screen.
     *
     * @return The Y-coordinate of the zombie on the screen.
     */
    int getZombieScreenY();

    /**
     * Initiates a jump action for the zombie in the game.
     */
    void jumpPress();

    /**
     * Updates the jump action for the zombie in the game.
     * This method is called to handle the animation and position update during a
     * zombie jump.
     */
    void updateJumpZombie();

    /**
     * Checks if the zombie in the game is currently jumping.
     *
     * @return True if the zombie is jumping, otherwise false.
     */
    boolean isJumping();

    int getObstacleMapX();

    int getObstacleMapY();

    void updateObstacle();

    List<Integer> obstacleIndexListC();

}
