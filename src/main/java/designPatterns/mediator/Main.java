package designPatterns.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl("Amalia", mediator);
        User user2 = new UserImpl("Mircea", mediator);
        User user3 = new UserImpl("Bogadn", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Salut!");
    }
}
