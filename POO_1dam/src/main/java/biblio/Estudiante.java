package biblio;

public class Estudiante {

    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int NIA;
    private String email;
    private Libro libro;

    public Estudiante (String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        setNIA();
        libro = null;
    }

    public Estudiante (String nombre) {
        this(nombre,"", "");
    }

    public static int obtenerTotalEstudiantes () {
        return contadorEstudiantes;
    }

    public static boolean validarCorreo (String correo) {
        if(correo.matches(CORREO_FORMAT)) {
            return true;
        } else {
            return false;
        }
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getNIA() {
        return NIA;
    }

    private void setNIA() {
        NIA = ++contadorEstudiantes;
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
