package creational.abstract_factory;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling MsiMonitor");
    }
}
