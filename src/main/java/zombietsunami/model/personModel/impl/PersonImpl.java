package zombietsunami.model.personModel.impl;

import zombietsunami.model.MapData;
import zombietsunami.model.personModel.api.Person;

public class PersonImpl implements Person {
    private PositionImpl pos = new PositionImpl();
    private final int NUM=4;

    private final int screenXp;
    private final int screenYp;

    public PersonImpl(){
        this.screenXp = MapData.getScreenW() / 2 - (MapData.getTitSize() / 2);
        this.screenYp = MapData.getScreenH() / 2 - (MapData.getTitSize() / 2);
        setDefaultValue();
    }
    private void setDefaultValue(){
        pos.setXp(100);
        pos.setYp(250); 
    }
    @Override
    public int getXp(){
        return pos.getXp();
    }
    @Override
    public int getYp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getYp'");
    }
    @Override
    public int getNumXp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumXp'");
    }
    @Override
    public int getScreenXp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getScreenXp'");
    }
    @Override
    public int getScreenYp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getScreenYp'");
    }
}
