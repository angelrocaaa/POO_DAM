package Dispositivos_Inteligente;

public abstract class Dispositivo {

    protected String nombre;
    protected boolean estado;

    public Dispositivo (String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public abstract void encender();

    public void apagar() {
        if (estado == false) {
            System.out.println(nombre + " ya está apagado");
        } else {
            estado = false;
            System.out.println(nombre + " apagado...");
        }
    }

    public void mostrarEstado() {
        if (estado == false) {
            System.out.println("apagado");
        } else {
            System.out.println("encendido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
