package structure.proxy;

public class RealImplementation implements Proxy {
    @Override
    public void start() {
        System.out.println("Hello from real object");
    }
}
