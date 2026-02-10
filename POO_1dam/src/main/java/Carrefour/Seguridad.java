package Carrefour;

import java.util.ArrayList;
import java.util.Scanner;

public class Seguridad extends Persona{

    static Scanner teclado = new Scanner(System.in);

    private String empresa;
    private ArrayList<String> armas;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa() {
        System.out.println("Introduce la empresa del personal de seguridad: ");
        empresa = teclado.next();
        teclado.nextLine();
    }

    public ArrayList<String> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Seguridad que trabaja para la empresa " + empresa);
        System.out.println("Las armas que tiene son:");
        for (String arma : armas) {
            System.out.println(arma);
        }
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", armas=" + armas +
                '}';
    }

    public void agregarArmas (String arma) {
        armas.add(arma);
    }

    public Seguridad(int codigo_empleado, String nombre, double sueldo) {
        super(codigo_empleado, nombre, sueldo);
        setEmpresa();
        armas = new ArrayList<>();
    }
}
