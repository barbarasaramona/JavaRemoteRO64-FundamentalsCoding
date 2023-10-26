package org.example.film;

public class RecenzieFilm {
    private String descriere;
    private String numeCritic;
    private double notaRating;

    @Override
    public String toString() {
        return "Recenzie{" +
                "descriere='" + descriere + '\'' +
                ", numeCritic='" + numeCritic + '\'' +
                ", notaRating=" + notaRating +
                '}';
    }

    public RecenzieFilm(String descriere, String numeCritic, double notaRating) {
        this.descriere = descriere;
        this.numeCritic = numeCritic;
        this.notaRating = notaRating;
    }

    public double getNotaRating() {
        return notaRating;
    }

}
