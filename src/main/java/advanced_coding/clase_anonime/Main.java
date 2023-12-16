package advanced_coding.clase_anonime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car mercedes1 = new Car(20000, CarType.MERCEDES, 2010);
        Car mercedes2 = new Car(35000, CarType.MERCEDES, 2015);
        Car fiat1 = new Car(3500, CarType.FIAT, 2008);
        Car fiat2 = new Car(7000, CarType.FIAT, 2010);
        Car skoda1 = new Car(12000, CarType.SKODA, 2015);
        Car skoda2 = new Car(25000, CarType.SKODA, 2021);

        System.out.println("-----Task1 & Task2-----");
        System.out.println("-----------------------");
        Dealership dealership = new Dealership();
        System.out.println("-----Mercedes 1-----");
        System.out.println("Pretul dupa cele doua oferte: " + dealership.getFinalPrice(mercedes1));
        System.out.println("-----Mercedes 2-----");
        System.out.println("Pretul dupa cele doua oferte: " + dealership.getFinalPrice(mercedes2));
        System.out.println("-----Fiat 1-----");
        System.out.println("Pretul dupa cele doua oferte: " + dealership.getFinalPrice(fiat1));
        System.out.println("-----Fiat 2-----");
        System.out.println("Pretul dupa cele doua oferte: " + dealership.getFinalPrice(fiat2));
        System.out.println("-----Skoda 1-----");
        System.out.println("Pretul dupa cele doua oferte: " + dealership.getFinalPrice(skoda1));
        System.out.println("-----Skoda 2----");
        System.out.println("Pretul dupa cele doua oferte: " + dealership.getFinalPrice(skoda2));

        System.out.println("-----Task3-----");
        System.out.println("---------------");
        dealership.negotiate(mercedes1, new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 5;
            }
        });

        System.out.println("-----Task4-----");
        System.out.println("---------------");
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car(30000, CarType.MERCEDES, 2019);
        Car car2 = new Car(50000, CarType.MERCEDES, 2021);
        Car car3 = new Car(10000, CarType.FIAT, 2018);
        Car car4 = new Car(20000, CarType.SKODA, 2019);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        System.out.println("Lista de masini inainte de modificare:");
        System.out.println(carList);

        System.out.println("Lista masinilor cu pret peste 25000:");
        System.out.println(carList.stream().filter(car -> car.getPrice() > 25000).collect(Collectors.toList()));

        carList.removeIf(car -> car.getPrice() > 25000);
        System.out.println("Lista de masini dupa de modificare:");
        System.out.println(carList);

    }
}