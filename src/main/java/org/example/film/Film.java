package org.example.film;

import java.util.ArrayList;
import java.util.Arrays;

public class Film {
    private String nume;
    private ArrayList<String> listaActori;
    private RecenzieFilm[] recenzieFilm;

    public Film(String numeFilm, ArrayList<String> listaActoriFilm, RecenzieFilm[] recenziiFilm) {
        this.nume = numeFilm;
        this.listaActori = listaActoriFilm;
        this.recenzieFilm = recenziiFilm;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", listaActori=").append(listaActori);
        sb.append(", recenzieFilm=").append(Arrays.toString(recenzieFilm));
        sb.append('}');
        return sb.toString();
    }

    public void adaugaRecenzie(RecenzieFilm recenzieNoua) {
        RecenzieFilm[] listaNoua = new RecenzieFilm[this.recenzieFilm.length + 1];
        for (int i = 0; i < this.recenzieFilm.length; i++) {
            listaNoua[i] = this.recenzieFilm[i];
        }
        listaNoua[listaNoua.length - 1] = recenzieNoua;
        this.recenzieFilm = listaNoua;
    }

    public void adaugaActor(String numeActor) {
        this.listaActori.add(numeActor);
    }

    public double calculRaitingFilm() {
        double sumaRaiting = 0;
        for (int i = 0; i < this.recenzieFilm.length; i++) {
            sumaRaiting = sumaRaiting + this.recenzieFilm[i].getNotaRating();
        }
        return sumaRaiting / this.recenzieFilm.length;
    }

    public static String recneziiFime(Film[] films) {
        StringBuilder rezultat = new StringBuilder();
        for (int i = 0; i < films.length; i++) {
            rezultat.append(films[i].nume).append("\n");
            for (int j = 0; j < films[i].recenzieFilm.length; j++) {
                rezultat.append(films[i].recenzieFilm[j].toString()).append("/n");
            }
        }
        return rezultat.toString();
    }

    public static String topFilm(Film film1, Film film2) {
        StringBuilder rezultat = new StringBuilder();
        if (film1.calculRaitingFilm() == film2.calculRaitingFilm()) {
            rezultat.append(film1.nume).append(", ").append(film2.nume);
        } else if (film1.calculRaitingFilm() == film2.calculRaitingFilm()) {
            rezultat.append(film1.nume);
        } else {
            rezultat.append(film2.nume);
        }
        return rezultat.toString();
    }

    public String topFilm(Film film1) {
        StringBuilder rezultat = new StringBuilder();
        if (film1.calculRaitingFilm() == this.calculRaitingFilm()) {
            rezultat.append(film1.nume).append(", ").append(this.nume);
        } else if (film1.calculRaitingFilm() == this.calculRaitingFilm()) {
            rezultat.append(film1.nume);
        } else {
            rezultat.append(this.nume);
        }
        return rezultat.toString();
    }

    public static String filmeCuActoriX(String numeActor, Film[] filme) {
        String rezultat = "";
        for (int i = 0; i < filme.length; i++) {
            if (filme[i].listaActori.contains(numeActor)) {
                rezultat = rezultat + filme[i].nume + ", ";
            }

        }
        return rezultat;
    }
}