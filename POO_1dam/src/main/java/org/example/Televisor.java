package org.example;

public class Televisor {

    private int canal;
    private int volumen;

    public Televisor () {
        canal = 1;
        volumen = 5;
    }

    public Televisor (int canal,int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void subirCanal (int canal) {
        if (canal==100) {
            canal = 1;
        } else {
            canal=canal+1;
        }
        System.out.println(canal);
    }

    public void bajarCanal (int canal) {
        if (canal==1) {
            canal = 100;
        } else {
            canal=canal-1;
        }
        System.out.println(canal);
    }
    public void subirVolumen (int volumen) {
        if (volumen==100) {
            volumen = 1;
        } else {
            volumen=volumen+1;
        }
        System.out.println(volumen);
    }

    public void bajarVolumen (int volumen) {
        if (volumen==1) {
            volumen = 100;
        } else {
            volumen=volumen-1;
        }
        System.out.println(volumen);
    }
}
