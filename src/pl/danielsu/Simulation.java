package pl.danielsu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {


    public Simulation() {
    }

    public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
        ArrayList<Item> items = new ArrayList<>();
        Scanner fileBody = new Scanner(new File(fileName));
        while (fileBody.hasNextLine()) {
            Item newItem = new Item();
            String[] itemLine = fileBody.nextLine().split("=");
            newItem.name = itemLine[0];
            newItem.weight = Integer.parseInt(itemLine[1]);
            items.add(newItem);
        }
        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items){
        ArrayList<Rocket> rocketU1 = new ArrayList<>();
        Rocket newU1 = new U1();

        for (Item thisItem : items){
            if (newU1.canCarry(thisItem)){
                newU1.carry(thisItem);
            }
            rocketU1.add(newU1);
        }return rocketU1;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items){
        ArrayList<Rocket> rocketU2 = new ArrayList<>();
        Rocket newU2 = new U2();

        for (Item thisItem : items){
            if (newU2.canCarry(thisItem)){
                newU2.carry(thisItem);
            }
            rocketU2.add(newU2);
        }return rocketU2;
    }
    public int runSimulation(ArrayList<Rocket> rockets){
        int totalCost=0;
        for (Rocket currentRocket:rockets){
            totalCost += currentRocket.getCost();
            while (!currentRocket.lunch() || !currentRocket.land()){
                totalCost+=currentRocket.getCost();
            }
        }return totalCost;
    }
}
