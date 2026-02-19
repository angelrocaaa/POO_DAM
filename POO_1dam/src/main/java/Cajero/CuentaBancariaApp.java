package Cajero;

import java.util.Scanner;

public class CuentaBancariaApp {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    static public void mostrarMenu() {
        System.out.println("=== Cajero Automático ===");
        System.out.println("[1]. Consultar saldo");
        System.out.println("[2]. Ingresar dinero");
        System.out.println("[3]. Retirar dinero");
        System.out.println("[X]. Salir");
    }

    static public void opcionesMenu() {
        System.out.print("Selecciona una opción: ");
        String opcion = teclado.nextLine();

        switch (opcion) {
            case "1":
                
        }
    }
}
