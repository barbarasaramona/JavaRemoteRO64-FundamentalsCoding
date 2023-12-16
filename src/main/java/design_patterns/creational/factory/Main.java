package design_patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Calculator pc = ComputerFactory.getComputer(null, "2", "500");
        Calculator server = ComputerFactory.getComputer(CalculatorType.SERVER, "5", "1000");

        System.out.println(server);
        System.out.println(pc);


    }
}
