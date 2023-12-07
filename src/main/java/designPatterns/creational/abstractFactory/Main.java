package designPatterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Calculator pc = ComputerFactory.getComputer(new PCFactory("4", "500"));
        Calculator server = ComputerFactory.getComputer(new ServerFactory("8", "500"));
        String test = "         stream       ";
        System.out.println(test.trim());
    }
}
