package zombieTsunami.model.zombieModel.api;

public interface Zombie {
    void jump();

    void update();

    int getX();

    int getY();

    int getSpeed();

    int getNumX();

    int getScreenX();

    int getScreenY();

    int getStrenght();

    void increaseStrenght();

    void setStrenght(int strenght);

    void setScreenY(int y);
}
