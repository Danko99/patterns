package structure.bridge;

public class BankProgram extends Program {
    public BankProgram(Programmer programmer) {
        super(programmer);
    }

    @Override
    public void programmerWriteCode() {
        programmer.writeCode();
    }
}
