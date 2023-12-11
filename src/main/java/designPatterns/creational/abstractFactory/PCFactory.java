package designPatterns.creational.abstractFactory;

public class PCFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;

    public PCFactory(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Calculator creatCalculator() {
        return new PC(ram, hdd);
    }
}
