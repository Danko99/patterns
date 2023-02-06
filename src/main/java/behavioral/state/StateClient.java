package behavioral.state;

public class StateClient {
    public static void main(String[] args) {
        Developer developer = new Developer(new Sleeping());
        developer.justDoIt();
    }
}
