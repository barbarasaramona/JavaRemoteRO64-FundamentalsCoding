package design_patterns.structural.adapter;

public class BirdAdapter implements ToyBirdAction {

    public BirdAction bird;

    public BirdAdapter(BirdAction bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
