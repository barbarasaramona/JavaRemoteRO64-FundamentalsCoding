package designPatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        ShopppingCart cosCumparaturi = new ShopppingCart();
        Item item1 = new Item("1001", 320);
        Item item2 = new Item("1002", 460);

        cosCumparaturi.addItem(item1);
        cosCumparaturi.addItem(item2);
        System.out.println(cosCumparaturi.calculateTotal());
        PaymentStrategy plataCard = new CreditCardStrategy("Andrei", "2154645485", "249", "07/25");
        cosCumparaturi.pay(plataCard);
        PaymentStrategy plataPaypal = new PaypalStrategy("andrei@yahoo", "1234567");
        cosCumparaturi.pay(plataPaypal);
    }
}
