package pl.danielsu;

public class Rocket implements SpaceShip{
    int cost;
    int currentWeight;
    int maxWeight;

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
        return (currentWeight + item.weight) >= maxWeight;
    }

    @Override
    public void carry(Item item) {
    }
}
