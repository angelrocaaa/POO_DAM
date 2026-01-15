package org.example;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;
    private String ciudad;
    private String profesion;

    public Persona (String nombre, String dni, int edad, String ciudad, String profesion) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String profesion) {
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String ciudad) {
        this.ciudad = ciudad;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Profesion: " + profesion);
    }
}
