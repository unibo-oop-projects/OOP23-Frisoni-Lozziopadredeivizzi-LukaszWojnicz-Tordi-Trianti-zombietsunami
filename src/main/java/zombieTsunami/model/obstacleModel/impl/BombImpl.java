package main.java.zombieTsunami.model.obstacleModel.impl;

import main.java.zombieTsunami.model.obstacleModel.api.*;

public class BombImpl extends ObstacleEntity implements Bomb, Obstacle{

    private ObstacleEntity entity = new ObstacleEntity();

    public BombImpl(){
        setDefaultValue();
    }

    private void setDefaultValue() {
        entity.setX(350); //350 Per testare, poi dovremo gestire la creazione procedurale di Bombe e Ostacoli
        entity.setY(250);
    }

    @Override
    public void update() {
        //Se collide con lo zombie, chiama hit();
    }

    @Override
    public void hit() {
        //Qui dovrebbe esserci il decremento della vita dello zombie.
    }
}
