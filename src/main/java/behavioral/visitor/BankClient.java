package behavioral.visitor;

public class BankClient extends Client{
    private String accountNumber;

    public BankClient(String name, Integer age, String accountNumber) {
        super(name, age);
        this.accountNumber = accountNumber;
    }

    public BankClient() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
