package designPatterns.behavioral.strategy;

public class PaypalStrategy implements PaymentStrategy{
    private String emialId;
    private String password;

    public PaypalStrategy(String emialId, String password) {
        this.emialId = emialId;
        this.password = password;
    }

    @Override
    public void pay(int suma) {
        System.out.println("Suma platita " + suma + " prin paypal");
    }
}
