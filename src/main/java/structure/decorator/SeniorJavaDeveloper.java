package structure.decorator;

public class SeniorJavaDeveloper extends DecoratorDeveloper {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return "codeReview of"+developer.makeJob();
    }
}
