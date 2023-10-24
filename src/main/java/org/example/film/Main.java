package org.example.film;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String numeFilm = "Oblevion";
        ArrayList<String> actori = new ArrayList<>();
        actori.add("act1");
        actori.add("act2");
        actori.add("act3");
        Review[] arrayReview;
        Review review1 = new Review("descrev1", "Mircea", 7);
        Review review2 = new Review("descrev2", "Andrei", 4);
        arrayReview =new Review[]{review1, review2};
        Film film1 = new Film(numeFilm, actori, arrayReview);
        System.out.println(film1.toString());
        Review review3 = new Review("descrev3", "Mihai", 10);
        film1.adaugaReview(review3);
        System.out.println(film1.toString());
        film1.adaugaActor("act4");
        System.out.println(film1.toString());
    }
}
