package org.example.film;

public class Review {
    private String descriere;
    private String numeCritic;
    private double notaRating;

    @Override
    public String toString() {
        return "Review{" +
                "descriere='" + descriere + '\'' +
                ", numeCritic='" + numeCritic + '\'' +
                ", notaRating=" + notaRating +
                '}';
    }

    public Review(String descriere, String numeCritic, double notaRating) {
        this.descriere = descriere;
        this.numeCritic = numeCritic;
        this.notaRating = notaRating;
    }
}
