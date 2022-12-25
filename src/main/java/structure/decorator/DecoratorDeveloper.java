package structure.decorator;

public abstract class DecoratorDeveloper implements Developer {
    protected Developer developer;

    public DecoratorDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
