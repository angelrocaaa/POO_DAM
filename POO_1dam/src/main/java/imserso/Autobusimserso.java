package imserso;

import java.util.ArrayList;

public class Autobusimserso {

    private String matricula;
    private String destino;
    private ArrayList<Abuelo> listaAbuelos;

    public Autobusimserso (String matricula, String destino) {
        this.matricula = matricula;
        this.destino = destino;
        listaAbuelos = new ArrayList<>();
    }

    public void insertarAbuelo (Abuelo abuelo) {
        listaAbuelos.add(abuelo);
    }

    public void borrarAbuelo (Abuelo abuelo) {
        listaAbuelos.remove(abuelo);
    }

    public void mostrarAbuelos () {
        System.out.println("Abuelos del autobús con matrícula " + matricula + ": ");
        for (Abuelo abuelo : listaAbuelos) {
            System.out.println("- " + abuelo.getNombre() + " de " + abuelo.getEdad() + " de edad.");
        }
    }

    public void mostrarMayores (int edad) {
        System.out.println("Abuelos mayores a " + edad + " años:");

        for (Abuelo abuelo : listaAbuelos) {
            if (abuelo.getEdad() >= edad) {
                System.out.println("- " + abuelo.getNombre() + " de " + abuelo.getEdad() + " de edad.");
            }
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Abuelo> getListaAbuelos() {
        return listaAbuelos;
    }

    public void setListaAbuelos(ArrayList<Abuelo> listaAbuelos) {
        this.listaAbuelos = listaAbuelos;
    }

    @Override
    public String toString() {
        return "Autobusimserso{" +
                "matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                ", listaAbuelos=" + listaAbuelos +
                '}';
    }




}
