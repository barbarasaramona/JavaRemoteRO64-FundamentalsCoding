package advanced_coding.generic;

import java.util.Arrays;
import java.util.List;

public class Sortare {

    public static <T extends Comparable> void sortareLista(T[] lista) {

        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
                if (lista[j].compareTo(lista[j + 1]) > 0) {
                    T variabila = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = variabila;
                }
            }
        }
        System.out.println(Arrays.toString(lista));
    }

}
