package design_patterns.creational.factory;

public abstract class Calculator {
    public abstract String getRAM();
    public abstract String getHDD();

    @Override
    public String toString() {
        return getRAM() + " " + getHDD();
    }
}
