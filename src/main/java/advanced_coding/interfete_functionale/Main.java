package advanced_coding.interfete_functionale;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        SumInterface suma = new SumInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b + 10;
            }
        };
        System.out.println(suma.sum(4, 5));

        SumInterface suma2 = (x, y) -> x + y + 100;
        System.out.println(suma2.sum(4, 5));


        // Interfata functionala: Consumer

        List<String> orase = Arrays.asList("Bucuresti", "Constanta", "Brasov", "Cluj");

        Consumer<List<String>> oraseUpperCase = (listaOrase) -> {
            for (int i = 0; i < listaOrase.size(); i++) {
                String orasCurent = listaOrase.get(i).toUpperCase();
                listaOrase.set(i, orasCurent);
//                System.out.println(orasCurent);
            }
        };

        Consumer<List<String>> oraseUpperCase2 = (listaOrase) ->
                listaOrase.stream().map(oras -> oras.toUpperCase()).forEach(System.out::println);

        System.out.println("----------------------");
        oraseUpperCase2.accept(orase);
        System.out.println("----------------------");

        Consumer<List<String>> afisareOrase = (listaOrase) -> listaOrase.stream().forEach(System.out::println);

        oraseUpperCase.andThen(afisareOrase).andThen(afisareOrase).accept(orase);


        // Interfata functionala: Predicate (folosita in stream.filter)

        Predicate<String> oraseFiltrate = oras -> oras.startsWith("B");
        orase.stream().filter(oras -> oras.startsWith("B")).forEach(System.out::println);
//        System.out.println(orase.stream().filter(oras -> oras.startsWith("B")).collect(Collectors.toList()));


        // Interfata functionala: Funcion (folosita in stream.map)

        Function<String, Integer> lungimeNumeOras = oras -> oras.length();
        System.out.println("-----------lungime nume orase-----------");
        System.out.println(orase.stream().map(oras -> oras.length()).collect(Collectors.toList()));
        System.out.println(orase.stream().map(oras -> oras.length() > 5 ? oras.length() + "A" : oras.length() + "B").collect(Collectors.joining(", ")));


        // Interfata functionala: Supplier (folosita in stream.collect)
        Supplier<Double> sumaDouble = () -> 12 + 25.3;
//        Math.random();
        System.out.println(sumaDouble.get());

        Integer[] lungimeNumeOraseArray = orase.stream().map(oras -> oras.length()).toArray(Integer[]::new);


        // Exercitiu 6

        List<Integer> numere = Arrays.asList(6, 11, 58, 20, 8, 3, 15);

        System.out.println(numere.stream().map(numar -> numar % 2 == 0 ? "e" + numar : "o" + numar).collect(Collectors.joining("\n")));


    }
}