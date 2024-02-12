package zombietsunami.api;

import java.util.List;

import zombietsunami.Pair;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
/**
 * This interface unify the elements of the model in the MVC pattern, by calling
 * all their useful methods that has to comunicate with the controller
 * interface.
 */
public interface Model {

  /**
   * Returns the list of bombs from the map.
   */
  void getBombsFromMap(List<Integer> bomblist, List<Pair<Integer, Integer>> coords, Integer strength);

  /**
   * Calls the zombie's update method
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   */
  void updateZombie();

  /**
   * @return the List of Integers that contains all the values of the map's txt
   *         file
   */
  List<Integer> getMapList();

  /**
     * Removes an obstacle from the list.
     * @param index
     */
    void removeObstacleListItem(int index);

  /**
   * @return the List that contains the tile's elements file name of the game map
   */
  List<String> getTileElem();

  /**
   * @return the List of Pairs that contains the position of every single tile in
   *         the map
   */
  List<Pair<Integer, Integer>> getScreenTilePos();

  /**
   * @return the zombie's map X coordinate
   */
  int getZombieMapX();

  /**
   * @return the zombie's map Y coordinate
   */
  int getZombieMapY();

  /**
   * @return the speed fo the zombie
   */
  int getSpeed();

  /**
   * @return the Person's map X coordinate
   */
  int getPersonMapX();

  /**
   * @return the Person's map Y coordinate
   */
  int getPersonMapY();

  /**
   * @return the Person list
   */
  List<Integer> getPersonList();

  /**
   * Returns the list of Person from the map
   */
  void getPersonFromMap(List<Integer> personlist, List<Pair<Integer, Integer>> coords, Integer strenght);

  /**
   * Sets the coordinates of the "index" Person
   * @param index index of the Person in the list
   * @param x X coordinate
   * @param y Y coordinate
   */
  void setCoordinatesOfPersonInList(int index, int x, int y);

  /**
   * Updates the state of Person
   */
  void updatePerson();

  /**
   * Removes the "index" Person from the list
   * @param index the index of the Person in the list
   */
  void removePersonFromList(int index);

  /**
   * Removes a Person from the list
   * @param index index of Person
   */
  void removePersonListItem(int index);

  /**
   * @return the strenght of the zombie
   */
  int getStrenght();

  /**
   * Calls the increese strenght method of the zombie
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   */
  void increaseStrenght();

  /**
   * Calls the set strenght method of the zombie
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   * 
   * @param strenght is the strenght that will be setted
   */
  void setStrenght(int strenght);

  /**
   * @return the zombie's screen X coordinate
   */
  int getZombieScreenX();

  /**
   * @return the zombie's screen Y coordinate
   */
  int getZombieScreenY();

  boolean canBreakObstacle(int zombieStrength);

  /**
   * Calls the jumpPress method of the zombie
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   */
  void jumpPress();

  /**
   * Calls the updateJumpZombie method of the zombie
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   */
  void updateJumpZombie();

  /**
   * Calls the getJumping method of the zombie
   * {@link zombietsunami.model.zombiemodel.api.Zombie}.
   * 
   * @return true if zombie is jumping
   */
  boolean isJumping();

  void updateBreakable();

  void updateBomb();

  /**
   * @return the List of Integers that contains all the values of the obstacle
   *         map's txt file
   */
  List<Integer> getObstacleList();

  /**
   * Calls the set end position method in {@link zombietsunami.api.MightWin}.
   * 
   * @param endX is the flag's X coordinate
   */
  void setEndPos(int endX);

  /**
   * @return true if the flag's X position arrives in a certain axis
   */
  boolean isWin();

  /**
   * Returns the bomb list containing the current bombs
   * displayed.
   * @return the bomb list.
   */
  List<Bomb> getBombList();

  /**
   * Returns the breakable list containing the current bombs
   * displayed.
   * @return the breakable list.
   */
  List<Breakable> getBreakableList();

  /**
   * Sets the coordinates of the "index" bomb in the list.
   * @param index index of the bomb inside the list.
   * @param x X coordinate.
   * @param y Y coordinate.
   */
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
     */
    void collisionZombieObstacle();

    /**
     * Checks when the zombie hit a Person.
     */
    void collisionZombiePersons();

    /**
     * Checks if the game is over.
     * @return true if the game is over, false otherwise.
     */
    boolean isGameOver();

    /**
     * @return true if the zombie's strenght is not enough to break the breakable object in the map
     */
    boolean isNotEnough();

    /**
     * @return true if the zombie's strenght is zero
     */
    boolean isStrenghtZero();
}
