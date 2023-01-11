package behavioral.strategy;

public class ActivityClient {
    public static void main(String[] args) {
        Developer developer = new Developer(new Coding());
        developer.executeActivity();
        developer.setActivity(new Training());
        developer.executeActivity();
    }
}
