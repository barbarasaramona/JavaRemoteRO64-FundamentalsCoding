package design_patterns.creational.abstractFactory;

public class ComputerFactory {
    public static Calculator getComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.creatCalculator();
    }
}
