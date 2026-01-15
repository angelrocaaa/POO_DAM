package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bocadillo pepito = new Bocadillo("pepito","normal","bacon","big mac", 10.0);

        pepito.imprimirInfoBocata();

        System.out.println(pepito.getNombre() + " " + pepito.getPrecio() + "€");

        Bocadillo vacio = new Bocadillo();

        vacio.setNombre("chivito");

        vacio.imprimirInfoBocata();


    }
}
