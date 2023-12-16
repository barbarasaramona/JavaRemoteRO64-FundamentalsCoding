package design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CanalAbonati {
    public List<Abonat> abonati = new ArrayList<>();

    public void inregistrareAbonat(Abonat abonat) {
        if (abonat.getVarsta() >= 9) {
            abonati.add(abonat);
            abonat.pendingNotification("abonat cu succes!");
        } else {
            abonat.pendingNotification("nu a putut fii abonat!");
        }
    }

    public void notifica(String mesaj) {
        for (Abonat abonat : abonati) {
            if (abonat.getVarsta() > 10) {
                abonat.pendingNotification(mesaj);
            } else {
                abonat.pendingNotification("varsta dumneavoastra este sub 10 ani");
            }
        }
    }
}
