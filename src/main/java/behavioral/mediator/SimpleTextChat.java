package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    private User admin;
    private List<User> users;

    public SimpleTextChat() {
        users = new ArrayList<>();
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user){
        users.add(user);

    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream().forEach( u -> {
            if(u!=user){
                u.getMessage(message);
            }
        });
        admin.getMessage(message);
    }
}
