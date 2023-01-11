package behavioral.command;

public class CommandClient {
    public static void main(String[] args) {
        Developer developer = new Developer(new InsertCommand(new Database()), new DeleteCommand(new Database()));
        developer.insertCommand();
    }
}
