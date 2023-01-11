package practice.singleton;

public class DecoratorDeveloper extends Developer {
    public DecoratorDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String getResultOfJob() {
        return developer.getResultOfJob();
    }
}
