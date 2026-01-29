package Immobilaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    static Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa (String direccion) {
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();

    }

    public void crearHabitacion(String nombre, double metros) {
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                System.out.println("La habitación " + nombre + " ya existe");
                return;
            }
        }
        Habitacion hab1 = new Habitacion(nombre, metros);
        listaHabitaciones.add(hab1);
        System.out.println("Habitaciñon " + nombre + " ha sido creada.");
    }

    public void mostrarHabitacion () {
        System.out.println("Casa en " + direccion + " y propietario " + propietario.getNombre() + " tiene " + listaHabitaciones.size() + " habitaciones");
        for (Habitacion habitacion : listaHabitaciones) {
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + ") m2");
        }
    }

    public Habitacion getHabitacionMasGrande () {

        Habitacion mayor = listaHabitaciones.get(0);
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getMetros()> mayor.getMetros()) {
                mayor=habitacion;
            }
        }
        return mayor;
    }

    public void eliminarHabitaciones (String nombre) {
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitación " + nombre + " borrada con éxito.");
                return;
            }
        }
        System.out.println("La habitación " + nombre + " no existe");
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario de la casa en: " + direccion);
        String nombre = teclado.next();
        System.out.println("Introduce la edad del propietario: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        Propietario propietario = new Propietario(nombre,edad);
        this.propietario = propietario;
        System.out.println("Propietario " + nombre + " con " + edad + " años ha sido añadido.");
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propietario='" + propietario + '\'' +
                '}';
    }



}
