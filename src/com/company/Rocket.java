package com.company;

public class Rocket implements SpaceShip {

    double cost;
    int currentWeight;
    int maxWeight;

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public boolean canCarry(int weight) {
        return (this.currentWeight+weight) <= this.maxWeight;
    }

    public void carry(int weight) {
        this.currentWeight = this.currentWeight+weight;
    }
}
