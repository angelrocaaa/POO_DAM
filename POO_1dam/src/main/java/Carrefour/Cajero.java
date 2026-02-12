package Carrefour;

import java.util.Scanner;

public class Cajero extends Persona {

    static Scanner teclado = new Scanner(System.in);

    private int caja;

    public int getCaja() {
        return caja;
    }

    public void setCaja() {
        System.out.println("Introduce la caja registradora: ");
        caja = teclado.nextInt();
        teclado.nextLine();
    }

    public Cajero(int codigo_empleado, String nombre, double sueldo) {
        super(codigo_empleado, nombre, sueldo);
        setCaja();
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cajero que trabaja en la caja " + caja);
    }

    @Override
    public void trabajar() {
        System.out.println("Cobrando productos...");
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "caja=" + caja +
                '}';
    }
}
