package creational.abstract_factory;

public class AsusFactory extends FactoryProducts {
    @Override
    public GPU createGpu() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
