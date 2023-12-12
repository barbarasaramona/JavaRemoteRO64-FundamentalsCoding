package designPatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("1001", 320);
        Item item2 = new Item("1002", 460);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        System.out.println(shoppingCart.calculateTotal());
        PaymentStrategy plataCard = new CreditCardStrategy("Andrei", "123456789", "111", "11/27");
        shoppingCart.pay(plataCard);

        PaymentStrategy plataPaypal = new PaypalStrategy("user@paypal.com", "password");
        shoppingCart.pay(plataPaypal);
    }
}
