package org.example.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Film {
    private String nume;
    private ArrayList<String> listaActori;
    private RecenzieFilm[] listaRecenziiFilm;

    public Film(String numeFilm, ArrayList<String> listaActoriFilm, RecenzieFilm[] recenziiFilm) {
        this.nume = numeFilm;
        this.listaActori = listaActoriFilm;
        this.listaRecenziiFilm = recenziiFilm;

    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", listaActori=").append(listaActori);
        sb.append(", recenzieFilm=").append(Arrays.toString(listaRecenziiFilm));
        sb.append('}');
        return sb.toString();
    }

    public void adaugaRecenzie(RecenzieFilm recenzieNoua) {
        RecenzieFilm[] listaNoua = new RecenzieFilm[this.listaRecenziiFilm.length + 1];
        for (int i = 0; i < this.listaRecenziiFilm.length; i++) {
            listaNoua[i] = this.listaRecenziiFilm[i];
        }
        listaNoua[listaNoua.length - 1] = recenzieNoua;
        this.listaRecenziiFilm = listaNoua;
    }

    public void adaugaActor(String numeActor) {
        this.listaActori.add(numeActor);
    }

    public double calculRaitingFilm() {
        double sumaRaiting = 0;
        for (int i = 0; i < this.listaRecenziiFilm.length; i++) {
            sumaRaiting = sumaRaiting + this.listaRecenziiFilm[i].getNotaRating();
        }
        return sumaRaiting / this.listaRecenziiFilm.length;
    }

    public static String recenziiFilm(Film[] films) {
        StringBuilder rezultat = new StringBuilder();
        for (int i = 0; i < films.length; i++) {
            rezultat.append(films[i].nume).append("\n");
            for (int j = 0; j < films[i].listaRecenziiFilm.length; j++) {
                rezultat.append(films[i].listaRecenziiFilm[j].toString()).append("\n");
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
    public static String afisareRecenziiCuActorX(String actorX, Film[] filme) {
        String rezultat = "";
        for (int i = 0; i < filme.length; i++){
            if (filme[i].listaActori.contains(actorX)) {
//                for (int j = 0; j < filme[i].listaRecenziiFilm.length; j++){
//                    rezultat = rezultat + filme[i].listaRecenziiFilm[j].toString() + "\n";
//                }
                rezultat = rezultat + filme[i].afisareRecenzii();
            }
        }
        return rezultat;
    }


    public String afisareRecenzii(){
        String rezultat = "";
//        for (RecenzieFilm recenzie : listaRecenziiFilm){
//            rezultat = rezultat + recenzie.toString() + "\n";
//        }
        for (int j = 0; j < this.listaRecenziiFilm.length; j++ ) {
            rezultat = rezultat + this.listaRecenziiFilm[j].toString() + "\n";
        }

        return rezultat;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Film filmCuCareComparam = (Film) object;
//        return Objects.equals(nume, film.nume) && Objects.equals(listaActori, film.listaActori);
//          ArrayList<String> listaActoriUpperCase = new ArrayList<>();
//          for (int i = 0; i < listaActori.size(); i++) {
//              listaActoriUpperCase.add(listaActori.get(i).toUpperCase());
//          }
//        System.out.println("Lista actori" + listaActori);
          return Objects.equals(nume, filmCuCareComparam.nume) && this.listaActoriToUpperCase().contains("Tom Hardy".toUpperCase())
                  && filmCuCareComparam.listaActoriToUpperCase().contains("Tom Hardy".toUpperCase());
    }
    public ArrayList<String> listaActoriToUpperCase() {
        System.out.println(this);
        ArrayList<String> listaActoriUpperCase = new ArrayList<>();
        for (int i = 0; i < listaActori.size(); i++) {
            listaActoriUpperCase.add(listaActori.get(i).toUpperCase());
        }
        return listaActoriUpperCase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, listaActori);
    }
    public void modificaNumeActor(String numeCriticNou, int numarRecenzie) {
        String rezultat = "";
//        for (int i = 0; i < listaRecenziiFilm.length; i++) {
//            listaRecenziiFilm[i].setNumeCritic(numeCriticNou);
//        }
        listaRecenziiFilm[numarRecenzie -1].setNumeCritic(numeCriticNou);

    }
}
