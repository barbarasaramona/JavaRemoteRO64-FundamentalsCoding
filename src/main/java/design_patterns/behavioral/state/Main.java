package design_patterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        State startState = new TVStartState();
        State stopState = new TVStopState();
        tv.setTvState(startState);
        tv.doAction();

        tv.setTvState(stopState);
        tv.doAction();
    }
}
