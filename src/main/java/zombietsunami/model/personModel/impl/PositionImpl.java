package zombietsunami.model.personModel.impl;

public class PositionImpl {
    private int mapXp, mapYp;
    private final int NUM=4;

    public int getXp() {
        return mapXp;
    }

    public void setXp(int x){
        this.mapXp = x;
    }

    public int getYp(){
        return mapYp;
    }

    public void setYp(int y){
        this.mapYp = y;
    }

    public int getNumXp() {
        return NUM;
    }
}
