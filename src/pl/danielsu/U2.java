package pl.danielsu;

public class U2 extends Rocket{

    int cargoCarried;
    int cargoLimit;

    public U2(int cargoCarried, int cargoLimit) {
        this.cargoCarried = cargoCarried;
        this.cargoLimit = cargoLimit;
    }

    @Override
    public boolean lunch() {
        int randomNumber = (int) Math.floor(Math.random()*101);
        return (4*(cargoCarried/cargoLimit)) < randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) Math.floor(Math.random()*101);
        return (5*(cargoCarried/cargoLimit)) < randomNumber;
    }

}
