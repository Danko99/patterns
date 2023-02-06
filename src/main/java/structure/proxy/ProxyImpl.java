package structure.proxy;

public class ProxyImpl implements Proxy {
    private RealImplementation realImplementation = new RealImplementation();

    @Override
    public void start() {
        System.out.println("Above method");
        realImplementation.start();
        System.out.println("Below method");
    }
}
