package org.example.mastenire;

public class Dreptunghi extends FormaGeometrica {
    private float lungime;
    private float latime;


    public Dreptunghi() {
        System.out.println("Constructor default din dreptunghi.");
    }

    public Dreptunghi(float lungime, float latime) {
          super(2, 2);
        this.lungime = lungime;
        this.latime = latime;
        //   System.out.println("Constructor cu parmaterii din dreptunghi.");
    }

    public float calculPerimetru() {
        float rezultat = 2 * (this.lungime + this.latime);
        return rezultat;
    }

    public float calculArie() {
        float rezultat = this.lungime * this.latime;
        super.arie = rezultat;
        return rezultat;
    }

    @Override
    public float calculPerimetruFormaGeometrica() {
        float rezultat = 2 * (this.lungime + this.latime);
        return super.calculPerimetruFormaGeometrica() + rezultat;
    }
}
