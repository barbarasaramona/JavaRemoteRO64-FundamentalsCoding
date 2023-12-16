package design_patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Abonat abonat1 = new Abonat("Andrei",9);
        Abonat abonat2 = new Abonat("Mihai",23);
        Abonat abonat3 = new Abonat("Iulia",17);
        Abonat abonat4 = new Abonat("Maria",7);

        CanalAbonati canalAbonati = new CanalAbonati();

        System.out.println("---inregistrare----");

        canalAbonati.inregistrareAbonat(abonat1);
        canalAbonati.inregistrareAbonat(abonat2);
        canalAbonati.inregistrareAbonat(abonat3);
        canalAbonati.inregistrareAbonat(abonat4);

        System.out.println("---anunt nou----");

        canalAbonati.notifica("notificare: tricou nou");


    }
}
