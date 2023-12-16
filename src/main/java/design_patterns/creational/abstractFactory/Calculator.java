package design_patterns.creational.abstractFactory;

public abstract class Calculator {
    public abstract String getRAM();
    public abstract String getHDD();

    @Override
    public String toString() {
        return getRAM() + " " + getHDD();
    }
}
