package org.example.mastenire;


public class Main {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = new FormaGeometrica(5,8);
        System.out.println("Perimetru parinte " + formaGeometrica.calculPerimetruFormaGeometrica());

        Dreptunghi dr1 = new Dreptunghi(1, 2);
        System.out.println("Perimetru dreptunghi " + dr1.calculPerimetruFormaGeometrica());
        //  System.out.println("Arie dreptunghi " + dr1.calculArie());
        //   System.out.println(dr1.arie);

        Cerc c1 = new Cerc(5);
        System.out.println("Perimetru cerC " + c1.calculPerimetruFormaGeometrica());
        //  System.out.println(c1.arie);

    }
}