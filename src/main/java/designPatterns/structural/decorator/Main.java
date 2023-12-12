package designPatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();

        System.out.println("\n");

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        System.out.println("\n");

        Car luxurySportCar = new LuxuryCar(new SportCar(new BasicCar()));
        luxurySportCar.assemble();

        System.out.println("\n");

        Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
    }
}
