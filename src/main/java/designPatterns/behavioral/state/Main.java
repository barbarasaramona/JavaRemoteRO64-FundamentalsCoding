package designPatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        State startState = new TVStartState();
        State stopState = new TVStopState();
        tv.setTVState(startState);
        tv.doAction();

        tv.setTVState(stopState);
        tv.doAction();
    }
}
