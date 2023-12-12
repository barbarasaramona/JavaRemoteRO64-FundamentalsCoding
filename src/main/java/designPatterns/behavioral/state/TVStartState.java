package designPatterns.behavioral.state;

public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("Turn on TV");
    }
}
