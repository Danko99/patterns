package practice.duck;

public class Client {
    public static void main(String[] args) {
        Duck duck = new RedheadDuck();
        duck.quack();
        duck.display();
    }
}
