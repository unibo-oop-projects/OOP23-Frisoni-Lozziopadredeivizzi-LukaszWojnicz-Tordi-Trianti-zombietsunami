package zombietsunami.model;

import java.util.List;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.api.Collision;
import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.personmodel.api.Person;
public class CollisionImpl implements Collision{

    @SuppressFBWarnings
    private static final int THRESHOLD_1 = 60;
    private static final int THRESHOLD_2 = 104;

    private boolean gameOver = false;

    @Override
    public void collisionZombieObstacle(final List<Bomb> bombList, final List<Breakable> breakableList, final int tileSize, final Zombie zombie, final GameMap gameMap) {
        for(int i = 0; i < bombList.size() - 1; i++)  {
            if(bombList.size() != 0) {
                if(bombList.get(i) != null) {
                    if(bombList.get(i).getX() > THRESHOLD_1 &&
                        bombList.get(i).getX() < THRESHOLD_2 &&
                        zombie.getScreenY() > bombList.get(i).getY() - tileSize &&
                        zombie.getScreenY() < bombList.get(i).getY() + tileSize) {
                            if(zombie.getStrenght() - zombie.getSpeed() < 0) {
                                gameOver = true;
                            }
                            gameMap.removeObstacleListItem(i);
                            bombList.set(i, null);
                            zombie.setStrenght(zombie.getStrenght() - zombie.getSpeed());
                    } 
                }
            }
        }
        for(int i = 0; i < breakableList.size(); i++)  {
            if(breakableList.size() != 0) {
                if(breakableList.get(i) != null) {
                    if(breakableList.get(i).getX() > THRESHOLD_1 &&
                        breakableList.get(i).getX() < THRESHOLD_2 &&
                        zombie.getScreenY() > breakableList.get(i).getY() - tileSize &&
                        zombie.getScreenY() < breakableList.get(i).getY() + tileSize) {
                            if(breakableList.get(i).canBreakObstacle(zombie.getStrenght())) {
                                gameMap.removeObstacleListItem(i);
                                breakableList.set(i, null);
                            } else {
                                gameOver = true;
                            }
                    } 
                }
            }
        }
    }

    @Override
    public boolean isGameOver() {
        return gameOver;
    }


    /**
     * Checks when the zombie hit a Person
     * @param personList  the Person list
     * @param tileSize the size of one tile
     * @param zombie the Zombie entity
     * @param gameMap the game map
     */
    @Override
    public void collisionZombiePersons(List<Person> personList, int tileSize, Zombie zombie, GameMap gameMap) {
        for(int i = 0; i < personList.size() - 1; i++) {
            if(personList.size() != 0) {
                if(personList.get(i).getX() > THRESHOLD_1 && 
                personList.get(i).getX() < THRESHOLD_2 && 
                zombie.getScreenY() > personList.get(i).getY() - tileSize &&
                zombie.getScreenY() < personList.get(i).getY() + tileSize) {
                    gameMap.removePersonListItem(i);
                    personList.set(i, null);
                    zombie.setStrenght(zombie.getStrenght() + zombie.getSpeed());
                }
            }
        }
    }
}
