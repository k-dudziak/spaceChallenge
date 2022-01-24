package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(File file) throws FileNotFoundException {
        Scanner scannedFile = new Scanner(file);
        ArrayList<Item> itemsList = new ArrayList();
        Item item = new Item();

        while (scannedFile.hasNextLine()){
            String [] nameWeightArray = scannedFile.nextLine().split("=");
            item.name = nameWeightArray[0];
            item.weight = Integer.parseInt(nameWeightArray[1])/1000;
            itemsList.add(item);
        }
        return itemsList;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> itemsList) {
        ArrayList<Rocket> u1rockets = new ArrayList();
        Rocket newU1 = new U1();

        for (Item item : itemsList) {
            if (newU1.canCarry(item)) {
                u1rockets.add(newU1);
            } else {
                newU1 = new U1();
                u1rockets.add(newU1);
            }
        }
        return u1rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> itemsList) {
        ArrayList<Rocket> u2rockets = new ArrayList();
        Rocket newU2 = new U2();

        for (Item item : itemsList) {
            if (newU2.canCarry(item)) {
                u2rockets.add(newU2);
            } else {
                newU2 = new U2();
                u2rockets.add(newU2);
            }
        }
        return u2rockets;
    }

    public int runSimulation(ArrayList<Rocket> uXrockets) {

        int totalCost = 0;

        for (Rocket currentRocket : uXrockets) {
            totalCost += currentRocket.cost;

            while (!currentRocket.launch() || !currentRocket.land()) {
                totalCost += currentRocket.cost;
            }
        }
        return totalCost;
    }
}
