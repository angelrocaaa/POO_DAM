package org.example;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;


    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        //id
        setDisponible();
    }

    public String calcularID () {
        return id;
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
        disponible = true;
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

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                '}';
    }

}
