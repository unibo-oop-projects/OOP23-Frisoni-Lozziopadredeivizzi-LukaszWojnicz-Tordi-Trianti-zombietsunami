package zombieTsunami.controller;

import java.util.List;

import zombieTsunami.api.Controller;
import zombieTsunami.api.Model;
import zombieTsunami.api.Pair;
import zombieTsunami.model.MapData;
import zombieTsunami.model.ModelImpl;
import zombieTsunami.view.VControllerImpl;
import zombieTsunami.view.api.VController;

/**
 * This class is the Controller of the MVC and implements the Controller
 * interface
 * {@link zombieTsunami.api.Controller}.
 */
public final class ControllerImpl implements Controller {

    private Model model;
    private VController viewController;

    @Override
    public void setModel() {
        this.model = new ModelImpl();
        this.model.setController(this);
    }

    @Override
    public void setView() {
        this.viewController = new VControllerImpl();
        this.viewController.set(this);
    }

    @Override
    public int getScreenCol() {
        return MapData.getMaxScCol();
    }

    @Override
    public int getScreenRow() {
        return MapData.getMaxScRow();
    }

    @Override
    public int getTitleSize() {
        return MapData.getTitSize();
    }

    @Override
    public int getFPS() {
        return MapData.getFPS();
    }

    @Override
    public int getScreenWidth() {
        return MapData.getScreenW();
    }

    @Override
    public int getScreenHigh() {
        return MapData.getScreenH();
    }

    @Override
    public int getZombieMapX() {
        return this.model.getZombieMapX();
    }

    @Override
    public List<Integer> mapList() {
        return this.model.getMapList();
    }

    @Override
    public List<String> tileElements() {
        return this.model.getTileElem();
    }

    @Override
    public List<Pair<Integer, Integer>> screenTilePos() {
        return this.model.getScreenTilePos();
    }

    @Override
    public int getZombieMapY() {
        return this.model.getZombieMapY();
    }

    @Override
    public int getSpeed() {
        return this.model.getSpeed();
    }

    @Override
    public int getNumX() {
        return this.model.getNumX();
    }

    @Override
    public void jumpZombie() {
        this.model.jump();
    }

    @Override
    public void updateZombie() {
        this.model.updateZombie();
    }

    @Override
    public int getWorldCol() {
        return MapData.getMaxWorldCol();
    }

    @Override
    public int getWorldRow() {
        return MapData.getMaxWorldRow();
    }

    @Override
    public int getWorldWidth() {
        return MapData.getWorldWidth();
    }

    @Override
    public int getWorldHight() {
        return MapData.getWorldHeight();
    }

    @Override
    public int getStrenght() {
        return this.model.getStrenght();
    }

    @Override
    public void increaseStrenght() {
        this.model.increaseStrenght();
    }

    @Override
    public int getPersonMapX() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonMapX'");
    }

    @Override
    public int getPersonMapY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonMapY'");
    }

    @Override
    public int getNumXp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumXp'");
    }

    @Override
    public void setStrenght(final int strenght) {
        this.model.setStrenght(strenght);
    }

    @Override
    public int getObstacleMapX() {
        return this.model.getObstacleMapX();
    }

    @Override
    public int getObstacleMapY() {
        return this.model.getObstacleMapX();
    }

    @Override
    public boolean canBreakObstacle(final int zombieStrength) {
        return this.model.canBreakObstacle(zombieStrength);
    }

    @Override
    public int getZombieScreenX() {
        return this.model.getZombieScreenX();
    }

    @Override
    public int getZombieScreenY() {
        return this.model.getZombieScreenY();
    }

}
