package zombieTsunami.api;

import java.util.List;

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
   * @return the List of Strings with the file's name of the different tile elements
   */
  List<String> tileElements();

  /**
   * @return the List of Pair of Integers with the positions of all the tiles in the map
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
   * @return the NUM value of zombie
   */
  int getNumX();

  /**
   * Calls the update method of the zombie
   * {@link zombieTsunami.model.zombieModel.api.Zombie}.
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
   * {@link zombieTsunami.model.zombieModel.api.Zombie}.
   */
  int getStrenght();

  /**
   * Calls the increases strenght method of the zombie
   * {@link zombieTsunami.model.zombieModel.api.Zombie}.
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

  int getNumXp();

  /**
   * Calls the set strenght method of the zombie
   * {@link zombieTsunami.model.zombieModel.api.Zombie}.
   * @param strenght is the strenght that wants to be setted
   */
  void setStrenght(int strenght);

  /**
   * @return the obstacle's map X coordinate
   */
  int getObstacleMapX();

  /**
   * @return the obstacle's map Y coordiante
   */
  int getObstacleMapY();

  boolean canBreakObstacle(int zombieStrength);

  /**
   * @return the zombie's screen X coordiante
   * {@link zombieTsunami.model.zombieModel.api.Zombie}
   */
  int getZombieScreenX();

  /**
   * @return the zombie's screen Y coordiante
   * {@link zombieTsunami.model.zombieModel.api.Zombie}
   */
  int getZombieScreenY();

  /**
   * Initiates the jump action by invoking the setStrength method of the
   * jumpZombie model.
   * @param jumpPress Indicates whether the jump action should be triggered.
   * {@link zombieTsunami.model.zombieModel.api.Zombie}
   */
  void jumpPress();

  /**
   * Updates the state of the jumpZombie, adjusting its properties based on the
   * game's progression.
   * {@link zombieTsunami.model.zombieModel.api.Zombie}
   */
  void updateJumpZombie();

  /**
   * Retrieves the current jumping status of the jumpZombie.
   * @return true if the jumpZombie is currently in a jumping state, false otherwise.
   *{@link zombieTsunami.model.zombieModel.api.Zombie}
   */
  boolean getJumping();
}