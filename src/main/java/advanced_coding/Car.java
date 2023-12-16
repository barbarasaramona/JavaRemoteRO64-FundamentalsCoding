package advanced_coding;

public class Car {
    private double price;
    private CarType type;
    private int year;

    public Car(double price, CarType type, int year) {
        this.price = price;
        this.type = type;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", type=" + type +
                ", year=" + year +
                '}';
    }

    public CarType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
