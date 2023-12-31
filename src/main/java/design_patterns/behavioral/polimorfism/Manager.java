package design_patterns.behavioral.polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Angajat{

    private double bonusManager;

    private List<Angajat> angajatii = new ArrayList<>();

    public Manager(String nume, double salariuDeBaza, int aniExperienta, double bonusManager) {
        super(nume, salariuDeBaza, aniExperienta);
        this.bonusManager = bonusManager;
        this.angajatii = new ArrayList<>();
    }

    public void angajare(Angajat angajat){
        if (angajat.aniExperienta < 1){
            System.out.println("Angajatul" + angajat.nume + "nu are experienta mai mare de un an");
        }else {
            angajatii.add(angajat);
            System.out.println(angajat + " a semnat contractul");
            }
        }


    @Override
    public double calculSalariu() {
        return super.calculSalariu() + bonusManager;
    }

    public void afiseazaSalariileAngajatiilor(){
        if (angajatii.isEmpty()){
            System.out.println("Managerul nu are angajati");
        } else {
            System.out.println("Raport manager salarii angajati:");
            for (Angajat angajat : angajatii) {
                System.out.println("Salariul angajatului" + angajat.nume + ": " + angajat.calculSalariu());
            }
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonusManager=" + bonusManager +
                ", angajatii=" + angajatii +
                "} " + super.toString();
    }
}
