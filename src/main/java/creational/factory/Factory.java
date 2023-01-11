package creational.factory;

public class Factory {
    public Car createCar(String typeOfCar){
        switch (typeOfCar){
            case "Toyota":
                return new Toyota();
            default:
                throw new IllegalStateException("Unexpected value: " + typeOfCar);
        }
    }
}
