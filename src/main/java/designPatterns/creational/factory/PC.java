package designPatterns.creational.factory;

public class PC extends Calculator {

    private String ram;
    private String hdd;

    public PC(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return "pc ram " + ram;
    }

    @Override
    public String getHDD() {
        return "pc hdd " + hdd;
    }
}
