package zombieTsunami.model.zombieModel.api;

public interface Zombie {

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

    void jumpPress();

    void updateJumpZombie();

    boolean getJumping();
}
