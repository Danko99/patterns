package practice.singleton;

public class ClientDecorator {
    public static void main(String[] args) {
        Developer developer = new DecoratorDeveloper(new JavaDeveloper());
        String resultOfJob = developer.getResultOfJob();
        System.out.println(resultOfJob);
    }
}
