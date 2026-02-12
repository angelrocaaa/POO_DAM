package Carrefour;

public abstract class Persona {

    private int codigo_empleado;
    private String nombre;
    private double sueldo;

    public Persona (int codigo_empleado, String nombre, double sueldo) {
        this.codigo_empleado = codigo_empleado;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrarInfo () {
        System.out.println("Persona con código " + codigo_empleado + " y nombre " + nombre + " gana " + sueldo + " €");
    }

    public abstract void trabajar();

    @Override
    public String toString() {
        return "Persona{" +
                "codigo_empleado=" + codigo_empleado +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

}
