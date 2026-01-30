package Immobilaria;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros;
    private ArrayList<Electrodomestico> listaElectrodomesticos;

    public Habitacion (String nombre, double metros) {
        this.nombre = nombre;
        this.metros = metros;
        listaElectrodomesticos = new ArrayList<>();
    }

    public void agregarElectrodomestico(String nombre, double consumo) {
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            if (electrodomestico.getNombre().equals(nombre)) {
                    System.out.println("El electrodomestico " + nombre + " ya existe");
                    return;
            }
        }
        Electrodomestico electrodomestico = new Electrodomestico(nombre,consumo);
        listaElectrodomesticos.add(electrodomestico);
        System.out.println("Electrodomestico " + nombre + " ha sido creado");

    }

    public void mostrarElectrodomestico () {
        System.out.println("Habitación " + nombre + " de " + metros + " tiene " + listaElectrodomesticos + " electrodomesticos.");
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            System.out.println("- " + electrodomestico.getNombre() + " (" + electrodomestico.getConsumo() + ") kwh");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public ArrayList<Electrodomestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<Electrodomestico> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }



    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }

}
