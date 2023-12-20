package advanced_coding.interfete_functionale.basket_exercise;

import java.time.LocalDate;

public interface Product {
    double getPrice();
    boolean isAvailable(LocalDate localDate);
}
