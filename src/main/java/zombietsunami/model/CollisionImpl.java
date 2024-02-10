package zombietsunami.model;

import java.util.List;

import zombietsunami.model.zombiemodel.api.Zombie;
import zombietsunami.model.zombiemodel.impl.ZombieImpl;
import zombietsunami.api.Collision;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
public class CollisionImpl implements Collision{

    private static final int THRESHOLD_1 = 80;
    private static final int THRESHOLD_2 = 100;

    private boolean collision = false;

    @Override
    public void collisionZombieObstacle(final List<Bomb> bombList, final List<Breakable> breakableList, final int tileSize, final Zombie zombie) {
        for(int i = 0; i < bombList.size(); i++)  {
            if(bombList.get(i) != null) {
                if(bombList.get(i).getX() > THRESHOLD_1 &&
                    bombList.get(i).getX() < THRESHOLD_2 &&
                    zombie.getScreenY() > bombList.get(i).getY() &&
                    zombie.getScreenY() < bombList.get(i).getY() + tileSize) {
                        zombie.setStrenght(zombie.getStrenght() - zombie.getSpeed());
                            
                }
            }
        }
             
        for(int i = 0; i < breakableList.size(); i++)  {
            if(breakableList.get(i) != null) {
                if(breakableList.get(i).getX() > THRESHOLD_1 &&
                    breakableList.get(i).getX() < THRESHOLD_2 &&
                    zombie.getScreenY() > breakableList.get(i).getY() &&
                    zombie.getScreenY() < breakableList.get(i).getY() + tileSize) {
                        System.out.println("breakable");
                }
            }
        }
    }
}
