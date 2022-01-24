package com.company;

public class U2 extends Rocket  {

    public U2(){
        cost = 120;
        currentWeight = 18;
        maxWeight = 29;
    }

    @Override
    public boolean launch(){
        double random = Math.random();
        return random > 0.04*(currentWeight/maxWeight);
    }

    @Override
    public boolean land() {
        double random = Math.random();
        return random > 0.08*(currentWeight/maxWeight);
    }
}
