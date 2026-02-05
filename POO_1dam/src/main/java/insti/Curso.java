package insti;

import lombok.NonNull;

public class Curso {

    @NonNull
    private String nombre;
    private int horas;

    public Curso (String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }



}