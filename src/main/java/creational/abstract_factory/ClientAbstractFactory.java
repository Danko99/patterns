package creational.abstract_factory;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        FactoryProducts factoryProducts = new AsusFactory();
        GPU gpu = factoryProducts.createGpu();
        gpu.assemble();
    }
}
