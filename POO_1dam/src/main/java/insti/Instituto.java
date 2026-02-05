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
        this.poblacion = poblacion;
        listaEstudiantes = new ArrayList<>();
        listaCursos = new ArrayList<>();
    }

    private void setNombre(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre,"Instituto sin nombre");
    }

    public void agregarCurso(Curso curso){

        if (!listaCursos.contains(curso)){
            listaCursos.add(curso);
        } else {
            System.out.println("No puedes añadir un curso existente");
        }
    }

    public void agregarEstudiante(Estudiante estudiante){

        if (!listaEstudiantes.contains(estudiante)){
            listaEstudiantes.add(estudiante);
        } else {
            System.out.println("No puedes añadir un estudiante existente");
        }
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }
}
