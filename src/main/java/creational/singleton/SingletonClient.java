package creational.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Car instance = Car.getInstance();
        Car anotherInstance = Car.getInstance();

        System.out.println(instance==anotherInstance);
    }
}
