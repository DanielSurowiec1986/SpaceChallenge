package pl.danielsu;

public class U1 extends Rocket{

    int currentWeight;
    int maxWeight;
    int cost;

    public U1() {
        super(100,10000,18000);

    }

    @Override
    public boolean lunch() {
        double chance = 0.005*((double)super.getCurrentWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }

    @Override
    public boolean land() {
        double chance = 0.001*((double)super.getCurrentWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }

}
