package fundamentalsCoding.film;

public class RecenzieFilm {
    private String descriere;
    private String numeCritic;
    private double notaRating;

    public void setNumeCritic(String numeCritic) {
        this.numeCritic = numeCritic;
    }

    public String getDescriere() {
        return descriere;
    }

    public double getNotaRating() {
        return notaRating;


    }

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


}
