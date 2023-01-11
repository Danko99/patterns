package behavioral.visitor;

public class VisitorClient {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.doJob(new ConcreteVisitor());
    }
}
