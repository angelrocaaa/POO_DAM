package Sistema_de_pagos;

import java.util.Scanner;

public class Tienda {

    static Scanner teclado = new Scanner(System.in);

    public static void realizarPago(MetodoPago metodo) {
        System.out.println("Introduce el importe a pagar: ");
        double importe = teclado.nextDouble();
    }

    public static void iniciarPago() {

    }

    public static String preguntarMetodo() {
        System.out.println("¿Qué metodo de pago quieres usar? [bizum, paypal, Tarjeta]");
        String opcion = teclado.nextLine().toLowerCase();
        return opcion;
    }
}
