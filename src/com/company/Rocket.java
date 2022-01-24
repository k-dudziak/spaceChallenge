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
        boolean canCarry = (currentWeight+item.weight) <= maxWeight;
        return canCarry;
    }

    public int carry(Item item) {
        this.maxWeight = this.maxWeight+item.weight;
        return this.maxWeight;
    }
}
