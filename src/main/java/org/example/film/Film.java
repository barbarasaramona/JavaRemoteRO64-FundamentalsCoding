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
}
