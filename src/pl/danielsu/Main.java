package pl.danielsu;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{

        Simulation newSimulation = new Simulation();

        ArrayList<Item> itemsU1 = newSimulation.loadItems("phase-1.txt");
        ArrayList<Item> itemsU2 = newSimulation.loadItems("phase-2.txt");

        System.out.println("Running simulation for U1 rockets:");

        int costU1 = newSimulation.runSimulation(newSimulation.loadU1(itemsU1));
        System.out.println("Total cost for U1 rockets - phase 1: " + costU1 + " millions");
        costU1 = newSimulation.runSimulation(newSimulation.loadU1(itemsU2));
        System.out.println("Total cost for U1 rockets - phase 2: " + costU1 + " millions");

        System.out.println("Running simulation for U2 rockets:");

        int costU2 = newSimulation.runSimulation(newSimulation.loadU2(itemsU1));
        System.out.println("Total cost for U2 rockets - phase 1: " + costU2 + " millions");
        costU2 = newSimulation.runSimulation(newSimulation.loadU2(itemsU2));
        System.out.println("Total cost for U2 rockets - phase 2: " + costU2 + " millions");


    }
}
