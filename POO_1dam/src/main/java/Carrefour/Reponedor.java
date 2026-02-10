package Carrefour;

import java.util.Scanner;

public class Reponedor extends Persona {

    static Scanner teclado = new Scanner(System.in);

    private String pasillo;

    public Reponedor(int codigo_empleado, String nombre, double sueldo) {
        super(codigo_empleado, nombre, sueldo);
        setPasillo();
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo() {
        System.out.println("Introduce el pasillo en el que trabaja: ");
        pasillo = teclado.next();
        teclado.nextLine();
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Reponedor que trabaja en el pasillo " + pasillo);
    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo='" + pasillo + '\'' +
                '}';
    }
}
