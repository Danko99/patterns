package behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat , "Admin");

        User firstUser = new SimpleUser(chat,"User 1");
        User secondUser = new SimpleUser(chat,"User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(firstUser);
        chat.addUserToChat(secondUser);


        firstUser.sendMessage("Hello, I am User1");
        System.out.println();
        admin.sendMessage("Hello, I am admin");
    }
}

