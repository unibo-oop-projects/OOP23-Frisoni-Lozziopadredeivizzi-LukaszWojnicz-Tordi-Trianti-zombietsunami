package zombietsunami.model;

import java.util.List;

import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;
import zombietsunami.api.Collision;
import zombietsunami.model.mapmodel.api.GameMap;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
public class CollisionImpl implements Collision{

    private static final int THRESHOLD_1 = 80;
    private static final int THRESHOLD_2 = 100;

    private boolean collision = false;

    @Override
    public void collisionZombieObstacle(final List<Bomb> bombList, final List<Breakable> breakableList, final int tileSize, final Zombie zombie, final GameMap gameMap) {
        for(int i = 0; i < bombList.size() - 1; i++)  {
            if(bombList.size() != 0) {
                if(bombList.get(i) != null) {
                    if(bombList.get(i).getX() > THRESHOLD_1 &&
                        bombList.get(i).getX() < THRESHOLD_2 &&
                        zombie.getScreenY() > bombList.get(i).getY() &&
                        zombie.getScreenY() < bombList.get(i).getY() + tileSize) {
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
                        zombie.getScreenY() > breakableList.get(i).getY() &&
                        zombie.getScreenY() < breakableList.get(i).getY() + tileSize) {
                            gameMap.removeObstacleListItem(i);
                            breakableList.set(i, null);
                            zombie.setStrenght(zombie.getStrenght() - zombie.getSpeed());
                    } 
                }
            }
        }
    }
}
