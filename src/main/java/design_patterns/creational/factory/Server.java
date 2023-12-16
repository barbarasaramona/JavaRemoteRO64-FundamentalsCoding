package design_patterns.creational.factory;

public class Server extends Calculator{
    private String ram;
    private String hdd;

    public Server(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return "server ram " + ram;
    }

    @Override
    public String getHDD() {
        return "server hdd " + hdd;
    }
}
