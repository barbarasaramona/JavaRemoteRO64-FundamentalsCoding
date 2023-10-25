package org.example.film;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String numeFilm = "Oblevion";
        ArrayList<String> listaActoriFilm = new ArrayList<>();
        listaActoriFilm.add("act1");
        listaActoriFilm.add("act2");
        listaActoriFilm.add("act3");
        RecenzieFilm[] vectorRecenziiFilm;
        RecenzieFilm recenzie1 = new RecenzieFilm("descrev1", "Mircea", 7);
        RecenzieFilm recenzie2 = new RecenzieFilm("descrev2", "Andrei", 4);
        vectorRecenziiFilm = new RecenzieFilm[]{recenzie1, recenzie2};
        Film film1 = new Film(numeFilm, listaActoriFilm, vectorRecenziiFilm);
        System.out.println(film1.toString());
        RecenzieFilm recenzie3 = new RecenzieFilm("descrev3", "Mihai", 10);
        film1.adaugaRecenzie(recenzie3);
        System.out.println(film1.toString());
        film1.adaugaActor("act4");
        System.out.println(film1.toString());
    }
}
