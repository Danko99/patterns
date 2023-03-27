package behavioral.visitor;

import java.util.List;

public class MessageVisitor implements Visitor {
    @Override
    public void sendMessages(List<Client> clients) {
        clients.forEach(client -> {
            client.accept(this);
        });
    }

    @Override
    public void visit(BankClient bankClient) {
        System.out.println("Sending message to bank client");
    }

    @Override
    public void visit(MedicalClient medicalClient) {
        System.out.println("Sending message to medical client");
    }
}
