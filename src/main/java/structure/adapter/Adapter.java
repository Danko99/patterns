package structure.adapter;

public class Adapter implements Sender {
    private final Request request;

    public Adapter() {
        request = new Request();
    }

    public void sendRequest() {
        request.sendRequest();
    }

    @Override
    public void send() {
    }

}
