package zombietsunami.api;

import java.util.List;

import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.personmodel.api.Person;
import zombietsunami.model.zombiemodel.api.Zombie;

public interface Collision {

    /**
     * Checks whether the zombie has hit an obstacle.
     * @param bombList the bomb list.
     * @param breakableList the breakable list.
     * @param tileSize the size of one tile.
     * @param zombie the zombie entity.
     * @param gameMap the game map.
     */
    public void collisionZombieObstacle(List<Bomb> bombList, List<Breakable> breakableList, int tileSize, Zombie zombie, GameMap gameMap);

    /**
     * Checks when the zombie hit a Person
     * @param personList  the Person list
     * @param tileSize the size of one tile
     * @param zombie the Zombie entity
     * @param gameMap the game map
     */
    public void collisionZombiePersons(List<Person> personList, int tileSize, Zombie zombie, GameMap gameMap);

    /**
     * Checks if the game is over.
     * @return true if the game is over, false otherwise.
     */
    public boolean isGameOver();
}
