package com.company;

public class Rocket implements SpaceShip {

    double cost;
    int currentWeight;
    int maxWeight;
    double chanceLaunchExplosion;
    double chanceLandCrash;

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item) {
        return (currentWeight+item.weight) <= maxWeight;
    }

    public int carry(Item item) {
        return maxWeight = maxWeight+item.weight;
    }
}
