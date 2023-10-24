package org.example.film;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Film {
    private String nume;
    private ArrayList<String> listaActori;
    private Review[] review;

    public Film (String numeC,ArrayList<String> listaActoriC,Review[] reviewC){
        this.nume = numeC;
        this.listaActori = listaActoriC;
        this.review = reviewC;

    }

    @Override
    public String toString() {
        return "Film{" +
                "nume='" + nume + '\'' +
                ", listaActori=" + listaActori +
                ", review=" + Arrays.toString(review) +
                '}';
    }
    public void adaugaReview(Review review){
        Review[] listaNoua = new Review[this.review.length + 1];
        for (int i = 0; i < this.review.length; i++){
            listaNoua[i] = this.review[i];
        }

        listaNoua[listaNoua.length - 1] = review;
        this.review = listaNoua;
    }
    public void adaugaActor(String numeActor){
        this.listaActori.add(numeActor);

    }
}
