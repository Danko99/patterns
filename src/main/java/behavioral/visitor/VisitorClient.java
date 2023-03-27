package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorClient {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new MedicalClient("Vasya",25,"dsaad2123"));
        clients.add(new BankClient());

        Visitor visitor = new MessageVisitor();

        visitor.sendMessages(clients);
    }
}
