package Practica1;

import java.util.ArrayList;

public class Programa {
    private static final String DIRECTOR = "director";

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre,Cadena cadena,String nombre_director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        cadena.anyadirPrograma(this);
        setDirector(nombre_director);
    }

    public void anyadirEmpleado(String nombre, String cargo){
        Empleado empleado = new Empleado(nombre,cargo,getDirector());
        if (cargo.equals(DIRECTOR)){
            System.out.println("El programa ya tiene un director.");
            return;
        }
        listaEmpleados.add(empleado);
    }

    public void borrarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

    public void anyadirInvitado(String nombre,String profesion,int temporada){
        Invitado invitado = new Invitado(nombre,profesion,temporada);
        listaInvitados.add(invitado);
    }

    public void borrarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }

    public void invitadosTemporada(int temporada){
        int contador = 0;

        for (Invitado invitado : listaInvitados){
            if (invitado.getTemporada() == temporada){
                contador++;
                System.out.println("El invitado " + invitado.getNombre() + " de profesion " + invitado.getProfesion() + " vino en la temporada " + temporada);
            }
        }

        System.out.println(contador + " invitados han venido en la temporada "+temporada );

    }

    public int cantidadInvitado(String nombre){
        int contador = 0;

        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                contador++;
            }
        }
        return contador;
    }

    public void rastrearInvitado(String nombre){
        int veces = cantidadInvitado(nombre);
        System.out.println("El invitado " + nombre + " ha acudido " + veces + " veces al programa ");

        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                System.out.println(invitado.getFecha() + " - en la temporada " + invitado.getTemporada());
            }

        }
    }

    public boolean buscarInvitado(String nombre){
        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(String nombre) {
        Empleado director = new Empleado(nombre, DIRECTOR,null);
        this.director = director;
        listaEmpleados.add(director);
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", director=" + director +
                ", Lista empleados= " + listaEmpleados +
                '}';
    }
}