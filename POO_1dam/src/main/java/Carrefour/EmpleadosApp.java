package Carrefour;

import java.util.ArrayList;

public class EmpleadosApp {

    public static void main(String[] args) {

        Cajero jorge = new Cajero(147,"Jorge", 100);

        jorge.mostrarInfo();

        Reponedor denis = new Reponedor(199,"Denis",5);

        denis.mostrarInfo();

        Seguridad raul = new Seguridad(333,"Raúl",33);

        raul.agregarArmas("Táser");
        raul.agregarArmas("Porra");
        raul.mostrarInfo();

        Persona manuel = new Cajero(900,"manuel",1000);

        ArrayList<Persona> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(manuel);
        listaEmpleados.add(raul);

        for (Persona persona : listaEmpleados) {
            System.out.println("- " + persona);
        }

        fichar(manuel);
        fichar(raul);

        jorge.trabajar();
        denis.trabajar();
        raul.trabajar();
    }

    public static void fichar(Persona persona) {
        System.out.println("Fichando...");
    }
}
