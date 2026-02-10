package Practica1;

import java.util.Arrays;

public class Empleado {
    private static final String LETRAS_ID = "EP";
    private static final String DIRECTOR = "director";
    private static final String[] POSIBLES_CARGOS = new String[] {"director", "tecnico", "presentador", "colaborador"};
    private static final String CARGO = "pte";

    private static int contadorID = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;


    public Empleado(String nombre,String cargo,Empleado director) {
        ++contadorID;
        id = setId();
        this.nombre = nombre;
        this.cargo = setCargo(cargo);
        asignarDirector(director);
    }


    public void asignarDirector(Empleado director) {
        if (cargo.equals(DIRECTOR)) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    public String getId() {
        return id;
    }

    private static String setId() {
        return LETRAS_ID + contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String setCargo(String cargo) {

        if (Arrays.asList(POSIBLES_CARGOS).contains(cargo)) {
            return cargo;
        } else {
            System.out.println("El cargo " + cargo + " no existe.");
            return CARGO;
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id +
                ", nombre='" + nombre +
                ", cargo='" + cargo +
                ", director=" + director +
                '}';
    }
}