package designPatterns.behavioral.state;

public class TVStopState implements State{
    @Override
    public void doAction() {
        System.out.println("Turn off TV");
    }
}
