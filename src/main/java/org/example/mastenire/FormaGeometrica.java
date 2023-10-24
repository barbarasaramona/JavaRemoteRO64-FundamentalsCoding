package org.example.mastenire;

public class FormaGeometrica {
    protected float arie;
    protected float perimetru;

    public FormaGeometrica(float arie, float perimetru) {
        this.arie = arie;
        this.perimetru = perimetru;
        //    System.out.println("Constructor cu paramtru din clasa de baza.");
    }

    public FormaGeometrica() {
      //  System.out.println("Constructor default din clasa de baza.");
    }
    public float calculPerimetruFormaGeometrica(){

        return perimetru;
    }
}
