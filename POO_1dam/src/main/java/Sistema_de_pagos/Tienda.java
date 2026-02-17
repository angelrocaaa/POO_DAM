package Sistema_de_pagos;

import java.util.Scanner;

public class Tienda {

    static Scanner teclado = new Scanner(System.in);

    public static double realizarPago(MetodoPago metodo) {
        System.out.println("Introduce el importe a pagar: ");
        double importe = teclado.nextDouble();
        teclado.nextLine();

        metodo.procesarPago(importe);
        return importe;
    }

    public static void iniciarPago() {
        System.out.println("¿Qué método de pago vas a usar? [Bizum, Paypal, Tarjeta]");
        String opcion = teclado.nextLine();

        switch (opcion.toUpperCase()) {

            case "BIZUM":
                System.out.println("Escribe tu número de telefono vinculado con Bizum:");
                String telefono = teclado.nextLine();

                Bizum bizum = new Bizum(telefono);

                if (bizum.validarBizum()) {
                    realizarPago(bizum);
                    System.out.println("Pago aceptado. Muchas gracias.");
                } else {
                    System.out.println("Saliendo del programa...");
                }
                break;


            case "PAYPAL":
                System.out.println("Escribe tu cuenta de Paypal:");
                String email = teclado.nextLine();

                Paypal paypal = new Paypal(email);

                if (paypal.validarPaypal()) {

                    if (paypal.validarSaldo(realizarPago(paypal))) {
                        System.out.println("Gracias por su compra.");
                    } else {
                        System.out.println("Saliendo del programa...");
                    }

                } else {
                    System.out.println("Saliendo del programa...");
                }
                break;


            case "TARJETA":
                System.out.println("Introduce los datos de tu tarjeta:");
                String numero = teclado.nextLine();
                System.out.println("Selecciona el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]:");
                String tipo_tarjeta = teclado.nextLine().toUpperCase();
                TarjetaCredito tarjeta = new TarjetaCredito(numero, tipo_tarjeta);

                if (tarjeta.validarTarjeta()) {
                    realizarPago(tarjeta);
                    System.out.println("Pago aceptado. Muchas gracias");
                } else {
                    System.out.println("Los datos de tu tarjeta no son correctos. ");
                }
                break;

            default:
                System.out.println("El método de pago no existe");

        }
    }

}
