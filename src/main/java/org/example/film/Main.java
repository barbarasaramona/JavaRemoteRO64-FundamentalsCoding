package org.example.film;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String numeFilm = "Oblevion";
        ArrayList<String> listaActoriFilm = new ArrayList<>();
        listaActoriFilm.add("Tom Hardy");
        listaActoriFilm.add("act2");
        listaActoriFilm.add("act3");
        RecenzieFilm[] vectorRecenziiFilm;
        RecenzieFilm recenzie1 = new RecenzieFilm("descrev1", "Mircea", 10);
        RecenzieFilm recenzie2 = new RecenzieFilm("descrev2", "Andrei", 9.5);
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
        System.out.println(film1.calculRaitingFilm());
        //2
        //Pe baza a doua filme create(film1 si film2), sa se afiseze recenziile acestora
        RecenzieFilm recenzie4 = new RecenzieFilm("descrev4", "Mircea", 3.5);
        RecenzieFilm recenzie5 = new RecenzieFilm("descrev5", "Andrei", 5);
        RecenzieFilm[] vectorRecenziiFilm2 = new RecenzieFilm[]{recenzie4, recenzie5};

        ArrayList<String> listaActoriFilm2 = new ArrayList<>();
        listaActoriFilm2.add("Tom Hardy");
        listaActoriFilm2.add("Florin");
        listaActoriFilm2.add("Piersic");
        Film film2 = new Film("Shrek", listaActoriFilm2, vectorRecenziiFilm2);

        Film[] listaFilme2 = new Film[]{film1, film2};

        System.out.println(Film.recenziiFilm(listaFilme2));
        //3
        //Pe baza a doua filme create, sa se afiseze filmul cu raitingul cel mai mare
        System.out.println(Film.topFilm(film1, film2));
        System.out.println(film1.topFilm(film2));

        //4
        //Sa se afiseze toate filmele care au drept actor - actorul X (ex Tom Hardy)
        ArrayList<String> listaActoriFilm3 = new ArrayList<>();
        listaActoriFilm3.add("Jhon");
        listaActoriFilm3.add("Mos");
        listaActoriFilm3.add("Craciun");
        Film film3 = new Film("Lebada", listaActoriFilm3, vectorRecenziiFilm);
        Film[] filme = new Film[]{film1, film2, film3};
        System.out.println("Filme cu Tom Hardy :" + Film.filmeCuActoriX("Tom Hardy", filme));

        //5
        //Sa se afiseze recenziile filmelor care au actorul X

        //6
        //Sa se verifice si afiseze daca doua filme sunt identice
        //(doua filme sunt identice atunci cand au acelasi titlu si aceeasi actori)

        //7
        //Pentru filmul 1 sa se modifice numele criticului pentru recenzia X

        //8
        //Pentru filmul 2 sa se modifice nota raitingului pentru recenzia X

        //9
        //Pentru o lista de 3 filme sa se afiseze doar recenziile cu nota peste 7
    }
}
