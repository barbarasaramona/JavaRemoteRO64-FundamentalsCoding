package advanced_coding.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {5, 1, 6, 9, 3, 2};
        String[] stringArray = {"mere", "Ana", "are"};

        List<Integer> list = Arrays.asList(5, 1, 6, 9, 3, 2);
        List<String> listString = Arrays.asList("mere", "Ana", "are");

        Sortare.sortareLista(stringArray);
        System.out.println(listString.stream().sorted().collect(Collectors.toList()));

        Sortare.sortareLista(intArray);
        System.out.println(list.stream().sorted().collect(Collectors.toList()));

    }
}
