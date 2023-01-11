package creational.abstract_factory;

public class MsiFactory extends FactoryProducts {
    @Override
    public GPU createGpu() {
        return new MsiGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
