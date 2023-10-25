package org.example.film;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String numeFilm = "Oblevion";
        ArrayList<String> listaActoriFilm = new ArrayList<>();
        listaActoriFilm.add("act1");
        listaActoriFilm.add("act2");
        listaActoriFilm.add("act3");
        RecenzieFilm[] vectorRecenziiFilm;
        RecenzieFilm recenzie1 = new RecenzieFilm("descrev1", "Mircea", 7.5);
        RecenzieFilm recenzie2 = new RecenzieFilm("descrev2", "Andrei", 4);
        vectorRecenziiFilm = new RecenzieFilm[]{recenzie1, recenzie2};
        Film film1 = new Film(numeFilm, listaActoriFilm, vectorRecenziiFilm);
        System.out.println(film1.toString());
        RecenzieFilm recenzie3 = new RecenzieFilm("descrev3", "Mihai", 10);
        film1.adaugaRecenzie(recenzie3);
        System.out.println(film1.toString());
        film1.adaugaActor("act4");
        System.out.println(film1.toString());

        //TODO
        //1
        //Sa se calculeze si afiseze raitingul filmului pe baza raitingurilor din recenzii
        //suma raitingurilor din recenzii / nr de recenzii

        //2
        //Pe baza a doua filme create(film1 si film2), sa se afiseze recenziile acestora

        //3
        //Pe baza a doua filme create, sa se afiseze filmul cu raitingul cel mai mare

        //4
        //Sa se afiseze toate filmele care au drept actor - actorul X (ex Tom Hardy)

        //5
        //Sa se afiseze recenziile filmelor care au actorul X

        //6
        //Sa se verifice si afiseze daca doua filme sunt identice
        //(doua filme sunt identice atunci cand au acelasi titlu si aceeasi actori)
    }
}
