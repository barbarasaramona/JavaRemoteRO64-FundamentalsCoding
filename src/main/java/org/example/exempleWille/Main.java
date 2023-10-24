package org.example.exempleWille;

public class Main {
    public static void main(String[] args) {
//        int suma = 0;
//        for (int i = 0; i <= 10; i++){
//
//            if (i % 2 == 0){
//                suma = suma + i;
//
//            }
//        }
//        System.out.println(suma);
//
//        int j = 0;
//        suma = 0;
//        while (j <= 10) {
//            suma = suma + j;
//            j += 2;
//        }
//        System.out.println(suma);

        int suma = 0;
//        for (int i = 0; i <= 10; i++){
//
//            if (i % 2 == 1){
//                suma = suma + i;
//                System.out.println(i);
//            }
//
//        }
        for (int i = 1; i <= 10; i+=2){

                suma = suma + i;
                System.out.println(i);
        }
        System.out.println(suma);
        int j = 1;
        suma = 0;
        while (j <= 10) {
            suma = suma + j;
            j += 2;
        }
        System.out.println(suma);


    }
}
