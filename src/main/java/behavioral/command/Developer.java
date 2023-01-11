package behavioral.command;

public class Developer {
    private Command insert;
    private Command delete;

    public Developer(Command insert, Command delete) {
        this.insert = insert;
        this.delete = delete;
    }

    public void insertCommand(){
        insert.execute();
    }

    public void deleteCommand(){
        delete.execute();
    }
}
