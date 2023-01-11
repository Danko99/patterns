package practice.singleton;

public abstract class Developer {
    protected Developer developer;

    public Developer(Developer developer) {
        this.developer = developer;
    }

    public Developer() {
    }

    public abstract String getResultOfJob();

}
