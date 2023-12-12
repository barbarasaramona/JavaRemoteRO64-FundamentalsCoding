package designPatterns.mediator;

public interface ChatMediator {
    public void sendMessage(String mesaj, User user);
    public void addUser(User user);
}
