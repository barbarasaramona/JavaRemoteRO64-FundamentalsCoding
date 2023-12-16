package fundamentals_coding.exempleWhileAndFor;

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
        int j = 0;
        int sumaCalculataCuWhile = 0;
        while (j <= 10) {
            sumaCalculataCuWhile = sumaCalculataCuWhile + j;
            j++;
        }
        System.out.println("Suma numerelor de la 1 la 10 calculata cu while: " + sumaCalculataCuWhile);

        //TODO
        //Varianta DO WHILE
        int cursor = 0;
        int sumaCalculataCuDoWilde = 0;
        do {
            sumaCalculataCuDoWilde = sumaCalculataCuDoWilde + cursor;
            cursor++;
        } while (cursor <= 10);
        System.out.println("Suma nr de la 1 la 10 cu DO WHILE: " + sumaCalculataCuDoWilde);

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
        int cursor1 = 0;
        int sumaNrPareCalculataCuDoWhile = 0;
        do {
            sumaNrPareCalculataCuDoWhile = sumaNrPareCalculataCuDoWhile + cursor1;
            cursor1 += 2;
        } while (cursor1 <= 10);
        System.out.println("Suma nr pare cu DO WHILE: " + sumaNrPareCalculataCuDoWhile);

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
        int cursor2 = 1;
        int sumaNrImpareCalculataCuDoWhile = 0;
        do {
            sumaNrImpareCalculataCuDoWhile = sumaNrImpareCalculataCuDoWhile + cursor2;
            cursor2 += 2;
        } while (cursor2 <= 10);
        System.out.println("Suma nr impare cu DO WHILE: " + sumaNrImpareCalculataCuDoWhile);




    }
}
