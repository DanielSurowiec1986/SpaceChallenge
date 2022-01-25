package pl.danielsu;

public class Rocket implements SpaceShip {
    int cost;
    int currentWeight;
    int maxWeight;

    public Rocket() {

    }

    public Rocket(int cost, int currentWeight, int maxWeight) {
        this.cost = cost;
        this.currentWeight = currentWeight;
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight(){
        return currentWeight;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public int getCost() {
        return cost;
    }

    @Override
    public boolean lunch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return currentWeight + item.weight <= maxWeight;
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.weight;
    }

}
