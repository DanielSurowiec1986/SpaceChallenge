package pl.danielsu;

public class U2 extends Rocket{

    int currentWeight;
    int maxWeight;
    int cost;

    public U2() {
        super(100, 18000, 29000);
    }

    @Override
    public boolean lunch() {
        double chance = 0.004*((double)super.getCurrentWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }

    @Override
    public boolean land() {
        double chance = 0.008*((double)super.getCurrentWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }

}
