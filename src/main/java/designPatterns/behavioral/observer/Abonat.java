package designPatterns.behavioral.observer;

public class Abonat {

    private String nume;

    private int varsta;

    public int getVarsta() {
        return varsta;
    }

    public Abonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    public void pendingNotification(String notificare){
        System.out.println(nume + " " + varsta + " " + notificare);
    }
}
