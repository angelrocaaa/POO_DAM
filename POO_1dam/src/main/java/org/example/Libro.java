package org.example;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    public static final String CADENA_ID = "LIB";


    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;

    public Libro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        cantidadLibros++;
        librosDisponibles++;
        id = calcularID();
        disponible = true;
        estudiantePrestado = null;
    }

    private String calcularID () {
        return CADENA_ID+cantidadLibros;
    }

    public void prestar(Estudiante estudiante) {
        if (disponible) {
            disponible=false;
            System.out.println("El libro " + titulo + " ha sido prestado a " + estudiante.getNombre() + " de " + estudiante.getCurso());
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.setLibro(this);
        }else if (estudiante.getLibro() == null) {

        } else {
            System.out.println("El libro " + titulo + " no está disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro " + titulo + " ha sido devuelto por " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso());
            librosDisponibles++;
            estudiantePrestado.setLibro(null);
            estudiantePrestado = null;
        } else {
            System.out.println("El libro " + titulo + " está disponible. No se puede devolver.");
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public static int getTotalLibros() {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible() {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                ", estudiante=" + estudiantePrestado +
                '}';
    }

}
