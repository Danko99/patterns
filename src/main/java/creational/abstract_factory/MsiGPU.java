package creational.abstract_factory;

public class MsiGPU implements GPU {
    @Override
    public void assemble() {
        System.out.println("Assembling MsiProduct");
    }
}
