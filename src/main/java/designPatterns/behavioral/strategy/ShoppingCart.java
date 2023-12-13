package designPatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public int calculateTotal(){
        int totalPlata = 0;
        for (int i = 0; i < items.size(); i ++){
            totalPlata = totalPlata + items.get(i).getPrice();
        }
        return totalPlata;
    }
    public void pay(PaymentStrategy paymentStrategy){
        int suma = calculateTotal();
        paymentStrategy.pay(suma);
    }
}
