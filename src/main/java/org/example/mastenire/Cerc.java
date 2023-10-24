package org.example.mastenire;

public class Cerc extends FormaGeometrica {
    private float raza;

    public Cerc(float raza) {
        super(0, 0);
        this.raza = raza;
    }

    public float calcularie() {
        float rezultat = (float) Math.PI * raza * raza;
        this.arie = rezultat;
        return rezultat;
    }

    @Override
    public float calculPerimetruFormaGeometrica() {
        float rezultat = (float)( 2 * Math.PI * raza);
        return rezultat;
    }
}
