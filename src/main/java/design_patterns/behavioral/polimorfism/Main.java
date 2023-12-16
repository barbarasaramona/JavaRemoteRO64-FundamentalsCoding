package design_patterns.behavioral.polimorfism;

public class Main {
    public static void main(String[] args) {

        Angajat programator = new Programator("Diana", 100000, 2, 800);
        Angajat manager = new Manager("Maria", 156556, 5, 500);

        System.out.println(programator.calculSalariu());
        System.out.println(manager.calculSalariu());

        Manager managerAdevarat = new Manager("Andrei", 1000, 1, 900);
        Angajat tester = new Tester("Alin", 500, 0);

        managerAdevarat.angajare(tester);
        managerAdevarat.angajare(programator);

        managerAdevarat.afiseazaSalariileAngajatiilor();
    }
}
