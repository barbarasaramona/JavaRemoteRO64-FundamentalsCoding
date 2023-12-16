package design_patterns.structural.adapter;

public class Porumbel implements BirdAction{

    @Override
    public void fly() {
        System.out.println("zboara");
    }

    @Override
    public void makeSound() {
        System.out.println("Grrr grrr");
    }
}
