package structure.bridge;

public abstract class Program {
    protected Programmer programmer;

    protected Program(Programmer programmer) {
        this.programmer = programmer;
    }

    public abstract void programmerWriteCode();
}
