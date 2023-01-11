package creational.factory;

public class FactoryClient {
    public static void main(String[] args) {
        Car toyota = new Factory().createCar("Toyota");
        toyota.engineSound();
    }
}
