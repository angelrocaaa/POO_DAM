package insti;

import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

    public Estudiante(@NonNull String nombre, int edad, Curso curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public Estudiante(@NonNull String nombre) {
        this.nombre = nombre;
    }

}