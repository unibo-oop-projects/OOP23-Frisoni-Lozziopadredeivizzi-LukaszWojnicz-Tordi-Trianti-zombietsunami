package zombietsunami.api;

import java.util.List;

import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;

/**
 * This interface is the controller of the MVC pattern, and it allows to
 * comunicate with the model classes and with the view classes.
 */
public interface Controller {

  /**
   * This method sets a new Model and sets this controller as the model
   * controller.
   */
  void setModel();

  /**
   * This method sets a new VConreoller (view's controller) and sets this
   * controller as the VController controller.
   */
  void setView();

  /**
   * @return the screen's cols
   */
  int getScreenCol();

  /**
   * @return the screen's rows
   */
  int getScreenRow();

  /**
   * @return the title's size
   */
  int getTitleSize();

  /**
   * @return the FPS value
   */
  int getFPS();

  /**
   * @return the screen width
   */
  int getScreenWidth();

  /**
   * @return the screen height
   */
  int getScreenHigh();

  /**
   * @return the List of Integers with all the values in the map's txt file
   */
  List<Integer> mapList();

  /**
     * Removes an obstacle from the list.
     * @param index
     */
    void removeObstacleListItem(int index);

  /**
   * @return the List of Strings with the file's name of the different tile
   *         elements
   */
  List<String> tileElements();

  /**
   * @return the List of Pair of Integers with the positions of all the tiles in
   *         the map
   */
  List<Pair<Integer, Integer>> screenTilePos();

  /**
   * @return the zombie's map X coordinate
   */
  int getZombieMapX();

  /**
   * @return the zombie's map Y coordinate
   */
  int getZombieMapY();

  /**
   * @return the zombie's speed value
   */
  int getSpeed();

  /**
   * Calls the update method of the zombie
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   */
  void updateZombie();

  /**
   * @return the map's (world) cols
   */
  int getWorldCol();

  /**
   * @return the map's (world) rows
   */
  int getWorldRow();

  /**
   * @return the map (world) width
   */
  int getWorldWidth();

  /**
   * @return the map (world) height
   */
  int getWorldHight();

  /**
   * @return the strenght of the zombie
   *         {@link zombietsunami.model.zombiemodel.api.Zombie}.
   */
  int getStrenght();

  /**
   * Calls the increases strenght method of the zombie
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   */
  void increaseStrenght();

  /**
   * @return the person's map X coordinate
   */
  int getPersonMapX();

  /**
   * @return the person's map Y coordinate
   */
  int getPersonMapY();

  /**
   * Calls the set strenght method of the zombie
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   * 
   * @param strenght is the strenght that wants to be setted
   */
  void setStrenght(int strenght);

  boolean canBreakObstacle(int zombieStrength);

  /**
   * @return the zombie's screen X coordiante
   *         {@link zombietsunami.model.zombiemodel.api.Zombie}
   */
  int getZombieScreenX();

  /**
   * @return the zombie's screen Y coordiante
   *         {@link zombietsunami.model.zombiemodel.api.Zombie}
   */
  int getZombieScreenY();

  /**
   * Initiates the jump action by invoking the setStrength method of the
   * jumpZombie model.
   * {@link zombietsunami.model.zombiemodel.api.Zombie}
   */
  void jumpPress();

  /**
   * Updates the state of the jumpZombie, adjusting its properties based on the
   * game's progression.
   * {@link zombietsunami.model.zombiemodel.api.Zombie}
   */
  void updateJumpZombie();

  /**
   * Retrieves the current jumping status of the jumpZombie.
   * 
   * @return true if the jumpZombie is currently in a jumping state, false
   *         otherwise.
   *         {@link zombietsunami.model.zombiemodel.api.Zombie}
   */
  boolean isJumping();

  void updateBreakable();

  void updateBomb();

  List<Integer> obstacleList();

  /**
   * Calls the set end position method in {@link zombietsunami.api.Model}.
   * 
   * @param endX is the flag's X coordinate
   */
  void setEndPos(int endX);

  /**
   * @return true if the flag's X position arrives in a certain axis
   */
  boolean isWin();

  void getBombsFromMap(List<Integer> bomblist, List<Pair<Integer, Integer>> coords, Integer strength);

  List<Bomb> getBombList();

  List<Breakable> getBreakableList();

  void setCoordinatesOfBombInList(int index, int x, int y);

  /**
     * Removes the "index" bomb from the list.
     * @param index the index of the bomb in the list.
     */
    void removeBombFromList(int index);

    /**
     * Returns the list of breakables from the map.
     * @param controller the controller.
     */
    void getBreakablesFromMap(List<Integer> breakablelist, List<Pair<Integer, Integer>> coords, Integer strength);

    /**
     * Checks collision between zombie and obstacles.
     * @return true if collides, false otherwise.
     */
    void collisionZombieObstacle();
}
