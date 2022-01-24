package com.company;

public class U2 extends Rocket{

    public U2(){
        cost = 120;
        currentWeight = 18;
        maxWeight = 29;
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
