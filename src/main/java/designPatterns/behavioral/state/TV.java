package designPatterns.behavioral.state;

public class TV implements State{
    private State tvState;

    public void setTVState(State TVState) {
        this.tvState = TVState;
    }

    @Override
    public void doAction() {
        tvState.doAction();
    }
}
