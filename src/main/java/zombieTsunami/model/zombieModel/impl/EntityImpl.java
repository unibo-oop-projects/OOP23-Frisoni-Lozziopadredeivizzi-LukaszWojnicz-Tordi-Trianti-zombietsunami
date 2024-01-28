package main.java.zombieTsunami.model.zombieModel.impl;


public class EntityImpl {
    private int MapX, MapY;
    private int speed;
    private final int NUM=4;

    private enum Direction {
        UP, RIGHT,NONE
    };

    private Direction dir = Direction.RIGHT;
    public Direction getDir() {
        return dir;
    }
    protected void setDirUp() {
        this.dir = Direction.UP;
    }
    protected void setDirRight() {
        this.dir = Direction.RIGHT;
    }
    public int getX() {
        return MapX;
    }

    public void setX(int x) {
        this.MapX = x;
    }

    public int getY() {
        return MapY;
    }

    public void setY(int y) {
        this.MapY = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getNumX() {
        return NUM;
    }
}

