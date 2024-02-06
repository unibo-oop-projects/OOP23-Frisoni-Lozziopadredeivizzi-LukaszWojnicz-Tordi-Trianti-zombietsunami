package zombietsunami.api;

public interface Entity {
    
    int getX();

    int getY();

    int getSpeed();
    
    int getNumX();
    
    int getStrenght();
    
    void increaseStrenght();

    void setStrenght(int strenght);
}
