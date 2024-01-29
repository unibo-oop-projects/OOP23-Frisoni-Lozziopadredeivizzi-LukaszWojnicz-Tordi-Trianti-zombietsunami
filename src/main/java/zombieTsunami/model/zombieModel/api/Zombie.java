package main.java.zombieTsunami.model.zombieModel.api;

public interface Zombie {
    void jump();
    void update();
    int getX();
    int getY();
    int getSpeed();
    int getNumX();
    int getScreenX();
    int getScreenY();
}
