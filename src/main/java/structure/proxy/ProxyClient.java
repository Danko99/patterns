package structure.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        Proxy proxy = new ProxyImpl();

        proxy.start();
    }
}
