package designPatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Porumbel porumbel = new Porumbel();
        System.out.println("Porumbel");
        porumbel.makeSound();
        porumbel.fly();

        System.out.println();

        PlasticToyDuck duck = new PlasticToyDuck();
        System.out.println("Duck");
        duck.squeak();

        System.out.println();

        ToyBirdAction toyPorumbel = new BirdAdapter(porumbel);
        System.out.println("Toy porumbel");
        toyPorumbel.squeak();
    }
}
