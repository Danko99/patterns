package behavioral.visitor;

import java.util.List;

public interface Visitor {

    void sendMessages(List<Client> clients);

    void visit(BankClient bankClient);

    void visit(MedicalClient medicalClient);
}
