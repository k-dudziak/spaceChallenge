package com.company;

public class U1 extends Rocket  {

    public U1(){
        cost = 100;
        currentWeight = 10;
        maxWeight = 18;
    }

    @Override
    public boolean launch(){
        double random = Math.random();
        boolean success = random > 0.05*(currentWeight/maxWeight);
        return success;
    }

    @Override
    public boolean land() {
        double random = Math.random();
        boolean success = random > 0.01*(currentWeight/maxWeight);
        return success;
    }
}
