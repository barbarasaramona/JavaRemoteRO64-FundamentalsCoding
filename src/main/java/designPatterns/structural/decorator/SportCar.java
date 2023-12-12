package designPatterns.structural.decorator;

public class SportCar extends CarDecorator {
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + Features of sport car");
    }

    public SportCar(Car car) {
        super(car);
    }
}
