package design_patterns.behavioral.mediator;

public abstract class User {
    protected String name;
    protected ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }
    public abstract void send(String mesaj);
    public abstract void recieve(String mesaj);
}
