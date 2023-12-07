package designPatterns.creational.abstractFactory;

import designPatterns.creational.factory.CalculatorType;

public class ComputerFactory {
    public static Calculator getComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.creatCalculator();
    }
}
