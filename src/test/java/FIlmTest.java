import org.example.film.Film;
import org.example.film.RecenzieFilm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FIlmTest {
    private Film film;
    private RecenzieFilm recenzieFilm;
    @BeforeEach
    public void initializare(){
        film = new Film("Film test", new ArrayList<>(), new RecenzieFilm[]{});
        recenzieFilm = new RecenzieFilm("recenzie test", "test", 7);
    }
    @Test
    public void adaugaRecenzieTest1(){
        film.adaugaRecenzie(recenzieFilm);
        Assertions.assertEquals(1, film.getListaRecenziiFilm().length);
    }
    @Test
    public void adaugaRecenzieTest2(){
        film.adaugaRecenzie(recenzieFilm);
        org.assertj.core.api.Assertions.assertThat(film.getListaRecenziiFilm().length).isGreaterThan(0).isEqualTo(1);
    }
    @Test
    public void adaugaRecenzieTest3(){
        film.adaugaRecenzie(recenzieFilm);
        int pozitiaUltimeiRecenzi = film.getListaRecenziiFilm().length - 1;
        RecenzieFilm ultimaRecenzie = film.getListaRecenziiFilm()[pozitiaUltimeiRecenzi];
        String descriereaUltimeirec = ultimaRecenzie.getDescriere();
//        org.assertj.core.api.Assertions.assertThat(film.getListaRecenziiFilm()[film.getListaRecenziiFilm().length - 1].getDescriere()).isEqualTo(recenzieFilm.getDescriere());
        org.assertj.core.api.Assertions.assertThat(descriereaUltimeirec).isEqualTo(recenzieFilm.getDescriere());
        org.assertj.core.api.Assertions.assertThat(ultimaRecenzie).isEqualTo(recenzieFilm);
    }
}
