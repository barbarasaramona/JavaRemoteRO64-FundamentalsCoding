package designPatterns.creational.factory;

public class ComputerFactory {
    public static Calculator getComputer(CalculatorType type, String ram, String hdd){
        if (CalculatorType.PC.equals(type)){
            return new PC(ram, hdd);
        }else if (CalculatorType.SERVER.equals(type)){
            return new Server(ram, hdd);
        }
        return new Calculator() {
            @Override
            public String getRAM() {
                return "Tipul calculatorului nu este cunoscut";
            }

            @Override
            public String getHDD() {
                return "Tipul calculatorului nu este cunoscut";
            }
        };
    }
}
