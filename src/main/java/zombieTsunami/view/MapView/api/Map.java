package main.java.zombieTsunami.view.mapView.api;

public interface Map {
    
    void update();

    void gameLoop();

    void startGameThread();

    int getMaxScCol();

    int getMaxScRow();

    int getTitSize();
}
