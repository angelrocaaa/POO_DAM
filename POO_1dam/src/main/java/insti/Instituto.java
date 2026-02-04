package insti;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@Getter @Setter @ToString
@AllArgsConstructor
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    @NonNull
    private ArrayList<Estudiante> listaEstudiantes;
    @NonNull
    private ArrayList<Curso> listaCursos;

    public Instituto (String nombre) {
        this.nombre = nombre;
    }

    public Instituto (String nombre,String poblacion, ArrayList<Estudiante> listaEstudiantes, ArrayList<Curso> listaCursos) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        listaEstudiantes = new ArrayList<>();
        listaCursos = new ArrayList<>();
    }

    private void setNombre(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre,"Instituto sin nombre");
    }

    public void agregarCurso() {
        
    }

}
