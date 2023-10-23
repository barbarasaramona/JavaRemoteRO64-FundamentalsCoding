package org.example;

public class Dreptunghi extends FormaGeometrica {
   private float lungime;
   private float latime;


    public Dreptunghi(){
        System.out.println("Constructor default din dreptunghi.");
    }
    public Dreptunghi(float lungime,float latime){
        super(0,0);
        this.lungime=lungime;
        this.latime=latime;
     //   System.out.println("Constructor cu parmaterii din dreptunghi.");
    }
    public float calculperimetru(){
        float rezultat= 2*(this.lungime+this.latime);
        return rezultat;
    }
}
