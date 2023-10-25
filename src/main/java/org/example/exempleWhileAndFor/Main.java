package org.example.exempleWhileAndFor;

public class Main {
    public static void main(String[] args) {
        //Sa se calculeze suma numerelor de la 0 la 10
        //Varianta cu FOR
        int sumaCalculataCuFor = 0;
        for (int i = 0; i <= 10; i++) {
            sumaCalculataCuFor = sumaCalculataCuFor + i;
        }
        System.out.println("Suma numerelor de la 1 la 10 calculata cu for: " + sumaCalculataCuFor);

        //Varianta cu WHILE
        int j = 1;
        int sumaCalculataCuWhile = 0;
        while (j <= 10) {
            sumaCalculataCuWhile = sumaCalculataCuWhile + j;
            j += 1;
        }
        System.out.println("Suma numerelor de la 1 la 10 calculata cu while: " + sumaCalculataCuWhile);

        //TODO
        //Varianta DO WHILE

        //Sa se calculeze suma numerelor pare de la 0 la 10
        //Varianta cu FOR
        int sumaNrPareCalculataCuFor = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sumaNrPareCalculataCuFor = sumaNrPareCalculataCuFor + i;
            }
        }
        System.out.println("Suma numerelor pare de la 1 la 10 calculata cu for: " + sumaNrPareCalculataCuFor);

        //Varianta cu WHILE
        int sumaNrPareCalculataCuWhile = 0;
        int k = 0;
        while (k <= 10) {
            sumaNrPareCalculataCuWhile = sumaNrPareCalculataCuWhile + k;
            k += 2;
        }
        System.out.println("Suma numerelor pare de la 1 la 10 calculata cu while: " + sumaNrPareCalculataCuWhile);

        //TODO
        //Varianta DO WHILE

        //Sa se calculeze suma numerelor impare de la 0 la 10
        //Varianta cu FOR
        int sumaNrImpareCalculataCuFor = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                sumaNrImpareCalculataCuFor = sumaNrImpareCalculataCuFor + i;
            }
        }
        System.out.println("Suma numerelor impare de la 1 la 10 calculata cu for: " + sumaNrImpareCalculataCuFor);

        //Varianta cu WHILE
        int sumaNrImpareCalculataCuWhile = 0;
        int l = 1;
        while (l <= 10) {
            sumaNrImpareCalculataCuWhile = sumaNrImpareCalculataCuWhile + l;
            l += 2;
        }
        System.out.println("Suma numerelor impare de la 1 la 10 calculata cu while: " + sumaNrImpareCalculataCuWhile);

        //TODO
        //Varianta DO WHILE




    }
}
