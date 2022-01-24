package com.company;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();

        File phase1file = new File("C:\\Users\\dudzkr1\\Documents\\Bootcamp Java\\SpaceChallenge\\src\\phase-1.txt");
        File phase2file = new File("C:\\Users\\dudzkr1\\Documents\\Bootcamp Java\\SpaceChallenge\\src\\phase-2.txt");

        System.out.println("Total cost for U1 (in millions of $), phase 1: " + simulation.runSimulation(simulation.loadU1(simulation.loadItems(phase1file))));
        System.out.println("Total cost for U1 (in millions of $), phase 2: " + simulation.runSimulation(simulation.loadU1(simulation.loadItems(phase2file))));

        System.out.println("Total cost for U2 (in millions of $), phase 1: " + simulation.runSimulation(simulation.loadU2(simulation.loadItems(phase1file))));
        System.out.println("Total cost for U2 (in millions of $), phase 2: " + simulation.runSimulation(simulation.loadU2(simulation.loadItems(phase2file))));
    }
}
