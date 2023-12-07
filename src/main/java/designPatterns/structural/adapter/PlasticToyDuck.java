package designPatterns.structural.adapter;

public class PlasticToyDuck implements ToyBirdAction {

    @Override
    public void squeak() {
        System.out.println("squeak");
    }
}
