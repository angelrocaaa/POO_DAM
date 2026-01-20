package org.example;

public class Estudiante {

    private static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int NIA;
    private String email;

    public Estudiante (String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        NIA = contadorEstudiantes + 1;
    }

    public Estudiante (String nombre) {
        this(nombre,"", "");
    }

    public int getNIA() {
        return NIA;
    }

    public void setNIA(int NIA) {
        this.NIA = NIA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", NIA=" + NIA +
                ", email='" + email + '\'' +
                '}';
    }

}
