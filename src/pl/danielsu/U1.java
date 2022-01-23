package pl.danielsu;

public class U1 extends Rocket{

    int cargoCarried;
    int cargoLimit;

    public U1(int cargoCarried, int cargoLimit) {
        this.cargoCarried = cargoCarried;
        this.cargoLimit = cargoLimit;
    }

    @Override
    public boolean lunch() {
        int randomNumber = (int) Math.floor(Math.random()*101);
        return (5*(cargoCarried/cargoLimit)) < randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) Math.floor(Math.random()*101);
        return (cargoCarried/cargoLimit) < randomNumber;
    }

}
