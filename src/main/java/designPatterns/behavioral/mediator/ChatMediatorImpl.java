package designPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String mesaj, User user) {
        for(User u : users){
            if(!u.equals(user)){
                u.recieve(mesaj);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
