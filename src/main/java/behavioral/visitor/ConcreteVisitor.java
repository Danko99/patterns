package behavioral.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void doDog() {
        System.out.println("Гав");
    }

    @Override
    public void doCat() {
        System.out.println("Мяу");
    }
}
