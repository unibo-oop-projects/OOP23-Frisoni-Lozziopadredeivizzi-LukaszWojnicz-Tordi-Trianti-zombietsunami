package zombietsunami.model.obstaclemodel.impl;

import java.util.ArrayList;
import java.util.List;

import zombietsunami.api.Controller;
import zombietsunami.api.Pair;
import zombietsunami.model.obstaclemodel.api.Bomb;
import zombietsunami.model.obstaclemodel.api.Breakable;
import zombietsunami.model.obstaclemodel.api.ObstacleManager;

/**
 * Class that manages everything about Obstacles.
 */
public class ObstacleManagerImpl implements ObstacleManager {

    private List<Bomb> bombList = new ArrayList<Bomb>();
    private List<Breakable> breakableList = new ArrayList<Breakable>();

    /**
     * Method that allows to retrieve a bomb by its id.
     * @param id the bombs id.
     * @return the bomb.
     */
    @Override
    public Bomb getBombById(final int id) {
        for (Bomb bomb : bombList) {
            if(bomb.getId() == id) {
                return bomb;
            }
        }
        return null;
    }

    /**
     * Method that allows to retrieve a breakable by its id.
     * @param id the breakables id.
     * @return the breakable.
     */
    @Override
    public Breakable getBreakableById(final int id) {
        for (Breakable breakable : breakableList) {
            if(breakable.getId() == id) {
                return breakable;
            }
        }
        return null;
    }

    /**
     * Method that allows to retrieve a bomb by its X and Y coords.
     * @param x the X coordinate of the bomb.
     * @param y the Y coordinate of the bomb.
     * @return the bomb.
     */
    @Override
    public Bomb getBombByCoordinates(final int x, final int y) {
        for (Bomb bomb : bombList) {
            if(bomb.getX() == x && bomb.getY() == y) {
                return bomb;
            }
        }
        return null;
    }

    /**
     * Method that allows to retrieve a breakable by its X and Y coords.
     * @param x the X coordinate of the breakable.
     * @param y the Y coordinate of the breakable.
     * @return the breakable.
     */
    @Override
    public Breakable getBreakableByCoordinates(final int x, final int y) {
        for (Breakable breakable : breakableList) {
            if(breakable.getX() == x && breakable.getY() == y) {
                return breakable;
            }
        }
        return null;
    }

    /**
     * Adds a bomb into the bomb list.
     * @param bomb the bomb that needs to be added.
     */
    @Override
    public void addBomb(final Bomb bomb) {
        if(bomb != null) {
            bombList.add(bomb);
        }
    }

    /**
     * Adds a breakable into the breakable list.
     * @param breakable the breakable that needs to be added.
     */
    @Override
    public void addBreakable(final Breakable breakable) {
        if(breakable != null) {
            breakableList.add(breakable);
        }
    }

    /**
     * Returns the list of bombs from the map.
     * @param controller the controller.
     * @return the complete list of the bombs.
     */
    @Override
    public void getBombsFromMap(final List<Integer> bomblist, final List<Pair<Integer, Integer>> coords, final Integer strength) {
        bombList = new ArrayList<>();
        for(int i = 0; i < bomblist.size(); i++){
            if(bomblist.get(i) == 1 && coords.get(i) != null){
                Bomb bomb = new BombImpl();

                bomb.setX(coords.get(i).getX());
                bomb.setY(coords.get(i).getY());
                bomb.setDamage(Math.round(strength * 0.5f));
                bomb.setId(i);

                bombList.add(i, bomb);
            }else {
                bombList.add(i, null);
            }
        }
    }

    /**
     * Returns the list of breakables from the map.
     * @param controller the controller.
     * @return the complete list of the breakables.
     */
    @Override
    public void getBreakablesFromMap(final List<Integer> breakablelist, final List<Pair<Integer, Integer>> coords, final Integer strength) {
        breakableList = new ArrayList<>();
        for(int i = 0; i < breakablelist.size(); i++){
            if(breakablelist.get(i) == 2 && coords.get(i) != null){
                Breakable breakable = new BreakableImpl(Math.round(strength * 0.8f));

                breakable.setX(coords.get(i).getX());
                breakable.setY(coords.get(i).getY());
                breakable.setId(i);

                breakableList.add(i, breakable);
            }else {
                breakableList.add(i, null);
            }
        }
    }

    @Override
    public List<Bomb> getBombList() {
        return bombList;
    }

    @Override
    public List<Breakable> getBreakableList() {
        return breakableList;
    }

    @Override
    public void setCoordinatesOfBombInList(final int index, final int x, final int y) {
        bombList.get(index).setX(x);
        bombList.get(index).setY(y);
    }

    @Override
    public void removeBombFromList(final int index) {
        bombList.set(index, null);
    }

    @Override
    public void removeBreakableFromList(final int index) {
        breakableList.set(index, null);
    }

    @Override
    public void setCoordinatesOfBreakableInList(final int index, final int x, final int y) {
        breakableList.get(index).setX(x);
        breakableList.get(index).setY(y);
    }
}
