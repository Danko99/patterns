package creational.singleton;

public class Car {
    private static Car carSingleton;
    private String name;



    static {
        carSingleton = new Car();
    }

    public static Car getInstance(){
        return carSingleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
